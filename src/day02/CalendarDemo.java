package day02;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * java.util.Calendar
 * �����࣬�����˲���ʱ�����ط���
 * Date�󲿷ַ�������Ϊ��ʱ�Ķ����淽����ʹ��Calendar
 * Calendar����Ϊ�����࣬�涨�˲���ʱ��ķ�������
 * ����ʵ����GregorianCalendar��������������
 * Calendar�ṩ��һ����̬����getInstance�����ݵ�ǰϵͳ���ڵ���
 * ����һ�����õ�ʵ���࣬�󲿷ֵ������صĶ�������ʵ����
 * @author NiCo
 *
 */
public class CalendarDemo {
	public static void main(String[] args) {
		//Ĭ�ϴ���������ʾ��ǰϵͳʱ��
		Calendar calendar=new GregorianCalendar();
		//��д��toString,������ֱ�ۿ�������
		System.out.println(calendar);
		/*
		 * Date getTime()
		 * Calendar�ṩ�ĸ÷������Ի�ȡDate����
		 * �ö���ͱ�ʾ��ǰCalendar����ʾ������
		 */
		Date date=calendar.getTime();
		System.out.println(date);
		/*
		 * void setTime(Date date)
		 * ʹ��ǰCalendar��ʾ������Date����ʾ������
		 */
		calendar.setTime(date);
		
		/*
		 * Calendar�ṩ�˷�����
		 * int get(int field)
		 * �÷������Ի�ȡ��ǰCalendar�е�ָ��ʱ�����
		 * ����Ӧ��ֵ
		 * ʱ�������һ��intֵ����Calendar���д����ĳ���
		 * �����˲�ͬ��ʱ�����
		 */
		Calendar calendar1=Calendar.getInstance();
		//��
		int year=calendar1.get(Calendar.YEAR);
		//�´�0��ʼ
		int month=calendar1.get(Calendar.MONTH)+1;
		/*
		 * ��
		 * DAY_OF_MONTH		���е��죬��ν�ļ���
		 * DAY_OF_WEEK		���е��죬���ڼ�
		 * DAY_OF_YEAR		���е��죬����ĵڶ�����
		 * DATE				��DAY_OF_MONTH��ͬ
		 */
		int day=calendar1.get(Calendar.DAY_OF_MONTH);//DAY_OF_MONTH=DATE
		System.out.println(year+"-"+month+"-"+day);
		
		
		int h=calendar.get(Calendar.HOUR_OF_DAY);
		int m=calendar.get(Calendar.MINUTE);
		int s=calendar.get(Calendar.SECOND);
		System.out.println(h+":"+m+":"+s);
		
		int yday=calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("�����ǽ���ĵ�"+yday+"��");
		int wday=calendar.get(Calendar.DAY_OF_WEEK)-1;
		String[] data= {"��","һ","��","��","��","��","��"};
		System.out.println("����"+data[wday]);
		
		/* ��ȡָ��ʱ���������������ֵ���ο�ʱ��
		 * ΪCalendar����ʾ������
		 */
		int maxm=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("���¹�"+maxm+"��");
		int maxy=calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("���깲"+maxy+"��");
	
		
		/*
		 * void set(int field,int value)
		 * ��ָ��ʱ���������ָ����ֵ
		 *��ʾ1997-12-07 00:45:23
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
		 * ��ָ��ʱ������Ӹ���ֵ���������ֵΪ����
		 * ���ȥ������ֵ
		 */
		calendar.add(Calendar.YEAR, 20);
		calendar.add(Calendar.MONTH, -1);
		calendar.add(Calendar.DAY_OF_MONTH, 4);
		//����Ϊ��ǰ�ܵ���һ
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		calendar.add(Calendar.HOUR_OF_DAY, 12);
		calendar.add(Calendar.MINUTE, 5);
		calendar.add(Calendar.SECOND, -10);
		System.out.println(calendar.getTime());
	}
}
