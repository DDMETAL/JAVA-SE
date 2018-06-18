package day02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 * java.text.SimpleDateFormat
 * ���԰���һ�����������ڸ�ʽ��Date��String֮���໥ת��
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
		 * ����SDFָ�������ڸ�ʽ��������date��ʾ������
		 * ת��Ϊ�ַ���
		 */
		String str=sdf.format(now);
		System.out.println(str);
		/*
		 * String->Date
		 * Date parse(String str)
		 * ����SDFָ�������ڸ�ʽ�������ַ���
		 * ����ΪDate����
		 */
		String str1="2017-11-11 11:12:54";
		SimpleDateFormat sdf1
			=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=sdf1.parse(str1);
		System.out.println(str1);
		System.out.println(date);
		
		
		/*
		 * ��дһ�γ���
		 * Ҫ���û����ո�ʽ�����Լ������գ��磺1997-12-07
		 * Ȼ�󾭹�����������������Ϊֹ���˶�����
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("�����������:(1997-12-07)");
		String str2=scan.nextLine();
		SimpleDateFormat sdf2
			=new SimpleDateFormat("yyyy-MM-dd");
		Date date1=sdf2.parse(str2);
		System.out.println(date1);
		long times=now.getTime()-date1.getTime();
		times=times/1000/60/60/24;
		System.out.println(times+"��");
	}
}
