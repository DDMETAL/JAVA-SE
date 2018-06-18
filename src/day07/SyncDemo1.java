package day07;
/**
 * ͬ����
 * ��Ч����Сͬ����Χ�����ڱ�֤��ȫ��ǰ����
 * ��ߴ��벢��ִ�е�Ч��
 * @author NiCo
 *
 */
public class SyncDemo1 {
	public static void main(String[] args) {
		final Shop shop=new Shop();
		Thread t1=new Thread() {
			public void run() {
				shop.buy();
			}
		};
		Thread t2=new Thread() {
			public void run() {
				shop.buy();
			}
		};
		t1.start();
		t2.start();
	}
}
class Shop{
	//public synchronized void buy() {
	public  void buy() {
		Thread t=Thread.currentThread();
		try {
			System.out.println(t.getName()+":�������·�...");
			Thread.sleep(5000);
			/*
			 * ͬ����
			 * synchronized(ͬ��������){
			 * 		��Ҫͬ��ִ�еĴ���Ƭ��
			 * }
			 * ͬ���������������Ķ��󣬿�����java�е�
			 * ������󣬵��Ǳ��뱣֤��Ҫͬ��ִ�д���
			 * �Ķ���߳̿����ĸö�������ǡ�ͬһ�����ſ���
			 * ͨ������ʹ��this
			 */
		//	synchronized (new Object()) { //������
			synchronized (this) {
				System.out.println(t.getName()+":�������·�...");
				Thread.sleep(5000);
			}
			System.out.println(t.getName()+":����");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}