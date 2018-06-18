package day07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �̳߳�
 * �̳߳ص���Ҫ�����ǣ�
 * 1.�����߳�����
 * 2.�����߳�
 * ��������������ʱ��������ƵƵ�����߳�ִ�������
 * ����ʱ����Ӧ��ʹ���̳߳��������߳�
 * 
 * @author NiCo
 *
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService threadPool
			=Executors.newFixedThreadPool(2);
		
		for(int i=0;i<5;i++) {
			Runnable runn=new Runnable() {
				public void run() {
					Thread t=Thread.currentThread();
					System.out.println(t.getName()+"��������");
					try {
						Thread.sleep(5000);
						System.out.println(t.getName()+"���н���");
					} catch (InterruptedException e) {
						System.out.println("�̱߳��ж�");
					}
				}
			};
			//������ָ�ɸ��̳߳�
			threadPool.execute(runn);
			System.out.println("ָ����һ��������̳߳�");
		}
		threadPool.shutdownNow();
		System.out.println("�̳߳�ֹͣ��");
	}
}
