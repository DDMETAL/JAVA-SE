package day07;
/**
 * �߳��ṩ��һ����̬������
 * static Thread currentThread
 * �÷������Ի�ȡ���е�ǰ�������߳�
 * @author NiCo
 *
 */
public class Thread_currentThread {
	public static void main(String[] args) {
		/*
		 * JVM������ᴴ��һ���߳�������main����
		 */
		//��ȡ����main�������߳�
		Thread main=Thread.currentThread();
		System.out.println("����main�������߳��ǣ�"+main);
		dosome();
		
		
		Thread t=new Thread() {
			public void run() {
				Thread t=Thread.currentThread();
				System.out.println("�Զ����̣߳�"+t);
				dosome();
			}
		};
		t.start();
	}
	public static void dosome() {
		Thread t=Thread.currentThread();
		System.out.println("����dosome�������߳��ǣ�"+t);
	}
}
