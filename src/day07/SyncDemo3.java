package day07;
/**
 * ������
 * ʹ��synchronized���ε��Ƕ�˴���
 * ������Щͬ�����ͬ��������������ͬ
 * һ����ʱ����Щ�����;����˻���Ч��
 * ͬһʱ�����̲߳���ͬʱ����Щ�����ڲ�ִ��
 * @author NiCo
 *
 */
public class SyncDemo3 {
	public static void main(String[] args) {
		final F f=new F();
		Thread t1=new Thread() {
			public void run() {
				f.menthodA();
			}
		};
		Thread t2=new Thread() {
			public void run() {
				f.menthodA();
			}
		};
		t1.start();
		t2.start();
	}
}
class F{
	public  void menthodA() {
		synchronized (this) {
			try {
				Thread t=Thread.currentThread();
				System.out.println(t.getName()+"����ִ��A");
				Thread.sleep(5000);
				System.out.println(t.getName()+"A����");
			} catch (Exception e) {
			
			}
		}
		
	}
	public synchronized void menthodB() {
		try {
			Thread t=Thread.currentThread();
			System.out.println(t.getName()+"����ִ��B");
			Thread.sleep(5000);
			System.out.println(t.getName()+"B����");
		} catch (Exception e) {
		
		}
	}
}