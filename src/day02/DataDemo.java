package day02;

import java.util.Date;

/**
 * java.util.Date
 * Date��ÿһ��ʵ�����ڱ�ʾһ��ȷ�е�ʱ���
 * ����Date���ȱ�ݣ�������JDK1.1�Ժ�Ĵ󲿷ַ���
 * ������Ϊ��ʱ�ģ����ٽ���ʹ��
 * ����ʹ��Dateֻ����ʾʱ�䣬ʱ����ز���ȫ����
 * Calendar������
 * @author NiCo
 *
 */
public class DataDemo {
		public static void main(String[] args) {
			//Ĭ�ϴ��������ı�ʾ��ǰϵͳʱ��
			Date date=new Date();
			/*
			 * Date��дtoString����
			 * ������ǵ�ǰDate��ʾ������ʱ��
			 */
			System.out.println(date);
			//Date�󲿷ַ������ǹ�ʱ�ģ�����ʱ��Ҫʹ��
			date.getYear();
			/*
			 * ��ȡDate�ڲ�ά����longֵ
			 */
			long time=date.getTime();
			System.out.println(time);
			time+=1000*60*60*24;
			/*
			 * ΪDate����һ��longֵ��ʹ���ʾ��longֵ
			 * ����ʾ��ʱ��
			 */
			date.setTime(time);
			System.out.println(date);
			
		}
}
