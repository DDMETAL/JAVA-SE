package day07;
/**
 * ���߳�
 * ���߳������δ��롱ͬʱ���С�
 * ���߳����д���ʵ�����ǲ������еģ�������������
 * �ϵ�ͬʱ����
 * 
 * �߳������ִ�����ʽ��
 * ��ʽһ��
 * �̳�Thread����дrun����
 * 
 * @author NiCo
 *
 */
public class ThreadDemo {
	public static void main(String[] args) {
		Thread t1=new MyThread1();
		Thread t2=new MyThread2();
		/*
		 * �����߳�
		 * �����߳�Ҫִ��start����
		 * �÷����������ǽ���ǰ�߳����뵽�̵߳���
		 * �÷���������Ϻ��̻߳�ܿ챻���䵽CPU
		 * ʱ��Ƭ��ʼ���У�һ����ʼ���л��Զ�ִ�и�
		 * �̵߳�run�����������߳�����
		 */
		t1.start();
		t2.start();
	}
}
class MyThread1 extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("���");
		}
	}
}
class MyThread2 extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("Hello");
		}
	}
}