package day07;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �߳��ṩ�˾�̬����
 * static void sleep(long ms)
 * �÷����ᵼ�����е�ǰ�������߳̽�������״̬
 * ָ���ĺ���ֵ������ʱ���̻߳��Զ��ص�Runnable
 * ״̬���ȴ��ٴη���CPUʱ�䲢������
 * @author NiCo
 *
 */
public class Thread_sleep {
	public static void main(String[] args) {
		System.out.println("����ʼ");
		/*
		 * ���ӱ���
		 * ÿ�������ǰϵͳʱ�䣬
		 * ��ʽ��15��18��11
		 */
		SimpleDateFormat sdf
			=new SimpleDateFormat("HH:mm:ss");
		while(true) {
			try {
				System.out.println(sdf.format(new Date()));
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
		}
	}
}
