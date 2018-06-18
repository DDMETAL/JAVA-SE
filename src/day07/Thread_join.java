package day07;
/**
 * �߳����첽ִ�д����
 * �첽���У���δ������ͬʱ���У����ɸ���
 * ͬ�����У����д������Ⱥ�˳���һ��һ��ִ��
 * 
 * ����ʹ���̵߳�join����������̳߳���ͬ������
 * ��Ч�����ö���߳��еĴ������Ⱥ�˳���ִ��
 * @author NiCo
 *
 */
public class Thread_join {
	//ͼƬ�Ƿ��������
	private static boolean isFinish=false;
	public static void main(String[] args) {
		final Thread download=new Thread() {
			public void run() {
				System.out.println("down����ʼ����");
				for(int i=0;i<100;i++) {
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(50);
					}catch(InterruptedException e) {
						
					}
				}
				System.out.println("down:ͼƬ�������");
				isFinish=true;
			}
		};
		Thread show=new Thread() {
			public void run() {
				System.out.println("show:��ʾͼƬ");
				/*
				 * �ȴ������߳��Ƚ�ͼƬ�������
				 * ��show�߳�ִ�е�downloda.join()����
				 * ʱ��show�߳̽�������״̬��ֱ��download�߳�
				 * ������ִ����ϣ�download�߳̽�����ʱ�Ż�
				 * ������������������д���
				 */
				try {
					/*
					 * ��һ�������ľֲ��ڲ�����������
					 * ��������������ֲ���������ô��
					 * ����������final�ģ���Դ��JVM
					 * ���ڴ��������
					 * JDK8�����ع���JVM�ڴ���䣬���
					 * ��������⡣
					 */
					download.join();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				
				if(!isFinish) {
					throw new RuntimeException("ͼƬû���������");
				}
				System.out.println("show:��ʾͼƬ���");
			}
		};
		download.start();
		show.start();
	}
}
