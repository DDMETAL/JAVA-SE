package day07;
/**
 * ��̬������ʹ��synchronization���κ�
 * �÷���һ������ͬ��Ч��
 * @author NiCo
 *
 */
public class SyncDemo2 {
	public static void main(String[] args) {
		Thread t1=new Thread() {
			public void run() {
				B.dosome();
			}
		};
		Thread t2=new Thread() {
			public void run() {
				B.dosome();
			}
		};
		t1.start();
		t2.start();
	}
	
}
class B{
	public synchronized static void dosome() {
		Thread t=Thread.currentThread();
		try {
			System.out.println(t.getName()+"��������dosome����");
			Thread.sleep(5000);
			System.out.println(t.getName()+"����dosome��������");
		} catch (Exception e) {
			
		}
	}
}