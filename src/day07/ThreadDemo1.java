package day07;
/**
 * ��ʽ����
 * ʵ��Runnable�ӿڵ��������߳�����
 * 
 * ��һ�ִ����̵߳ķ�ʽ������������ϵĲ��㣺
 * 1���̳г�ͻ������java�ǵ��̳еģ���͵���
 *    һ�������ϣ�����̣߳�ͬʱ����Ҫ��չ��һ
 *    ����Ĺ���ʱ�����ڲ���ͬʱ�̳��������࣬
 *    ���¼̳г�ͻ
 * 2���̳��߳���Ҫ��дrun�����������߳�����
 * 	  ��͵����߳�����������һ����һ��ǿ��Ϲ�ϵ
 * 	  �������߳�����
 * ���ڶ��ִ����̵߳ķ�ʽ���������������
 * @author NiCo
 *
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		Runnable r1=new MyRunnable1();
		Runnable r2=new MyRunnable2();
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
	}
}
class MyRunnable1 implements Runnable{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("���");
		}
	}
}
class MyRunnable2 implements Runnable{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("Hello");
		}
	}
}