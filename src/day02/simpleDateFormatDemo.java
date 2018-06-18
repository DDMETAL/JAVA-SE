package day02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 * java.text.SimpleDateFormat
 * 可以按照一个给定的日期格式在Date与String之间相互转换
 * @author NiCo
 *
 */
public class simpleDateFormatDemo {
	public static void main(String[] args) throws ParseException {
		Date now=new Date();
		System.out.println(now);
		
		/*
		 * 2017-11-11 10:53:20
		 * yyyy-MM-dd  HH:mm:ss
		 */
		SimpleDateFormat sdf
			=new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss a E");
		/*
		 * Date->String
		 * String format(Date date)
		 * 按照SDF指定的日期格式将给定的date表示的日期
		 * 转换为字符串
		 */
		String str=sdf.format(now);
		System.out.println(str);
		/*
		 * String->Date
		 * Date parse(String str)
		 * 按照SDF指定的日期格式将给定字符串
		 * 解析为Date对象
		 */
		String str1="2017-11-11 11:12:54";
		SimpleDateFormat sdf1
			=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=sdf1.parse(str1);
		System.out.println(str1);
		System.out.println(date);
		
		
		/*
		 * 编写一段程序
		 * 要求用户按照格式输入自己的生日，如：1997-12-07
		 * 然后经过程序计算输出到今天为止活了多少天
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("输入出生日期:(1997-12-07)");
		String str2=scan.nextLine();
		SimpleDateFormat sdf2
			=new SimpleDateFormat("yyyy-MM-dd");
		Date date1=sdf2.parse(str2);
		System.out.println(date1);
		long times=now.getTime()-date1.getTime();
		times=times/1000/60/60/24;
		System.out.println(times+"天");
	}
}
