package day02;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * java.util.Calendar
 * 日历类，定义了操作时间的相关方法
 * Date大部分方法生命为过时的而代替方案是使用Calendar
 * Calendar本身为抽象类，规定了操作时间的方法定义
 * 常用实现类GregorianCalendar，即：阳历历法
 * Calendar提供了一个静态方法getInstance来根据当前系统所在地区
 * 返回一个适用的实现类，大部分地区返回的都是阳历实现类
 * @author NiCo
 *
 */
public class CalendarDemo {
	public static void main(String[] args) {
		//默认创建出来表示当前系统时间
		Calendar calendar=new GregorianCalendar();
		//重写了toString,但不能直观看出日期
		System.out.println(calendar);
		/*
		 * Date getTime()
		 * Calendar提供的该方法可以获取Date对象
		 * 该对象就表示当前Calendar所表示的日期
		 */
		Date date=calendar.getTime();
		System.out.println(date);
		/*
		 * void setTime(Date date)
		 * 使当前Calendar表示给定的Date所表示的日期
		 */
		calendar.setTime(date);
		
		/*
		 * Calendar提供了方法：
		 * int get(int field)
		 * 该方法可以获取当前Calendar中的指定时间分量
		 * 所对应的值
		 * 时间分量是一个int值，在Calendar中有大量的常量
		 * 定义了不同的时间分量
		 */
		Calendar calendar1=Calendar.getInstance();
		//年
		int year=calendar1.get(Calendar.YEAR);
		//月从0开始
		int month=calendar1.get(Calendar.MONTH)+1;
		/*
		 * 天
		 * DAY_OF_MONTH		月中的天，所谓的几号
		 * DAY_OF_WEEK		周中的天，星期几
		 * DAY_OF_YEAR		年中的天，今年的第多少天
		 * DATE				和DAY_OF_MONTH相同
		 */
		int day=calendar1.get(Calendar.DAY_OF_MONTH);//DAY_OF_MONTH=DATE
		System.out.println(year+"-"+month+"-"+day);
		
		
		int h=calendar.get(Calendar.HOUR_OF_DAY);
		int m=calendar.get(Calendar.MINUTE);
		int s=calendar.get(Calendar.SECOND);
		System.out.println(h+":"+m+":"+s);
		
		int yday=calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("今天是今年的第"+yday+"天");
		int wday=calendar.get(Calendar.DAY_OF_WEEK)-1;
		String[] data= {"日","一","二","三","四","五","六"};
		System.out.println("星期"+data[wday]);
		
		/* 获取指定时间分量所允许的最大值，参考时间
		 * 为Calendar所表示的日期
		 */
		int maxm=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("本月共"+maxm+"天");
		int maxy=calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("今年共"+maxy+"天");
	
		
		/*
		 * void set(int field,int value)
		 * 对指定时间分量设置指定的值
		 *表示1997-12-07 00:45:23
		 */
		calendar.set(Calendar.YEAR, 1997);
		calendar.set(Calendar.MONTH,11);
		calendar.set(Calendar.DAY_OF_MONTH, 7);
		calendar.set(Calendar.HOUR_OF_DAY, 00);
		calendar.set(Calendar.MINUTE, 45);
		calendar.set(Calendar.SECOND, 23);
		System.out.println(calendar.getTime());
		
		
		
		/*
		 * void add(int field,int value)
		 * 对指定时间分量加给定值，若传入的值为负数
		 * 则减去给定的值
		 */
		calendar.add(Calendar.YEAR, 20);
		calendar.add(Calendar.MONTH, -1);
		calendar.add(Calendar.DAY_OF_MONTH, 4);
		//设置为当前周的周一
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		calendar.add(Calendar.HOUR_OF_DAY, 12);
		calendar.add(Calendar.MINUTE, 5);
		calendar.add(Calendar.SECOND, -10);
		System.out.println(calendar.getTime());
	}
}
