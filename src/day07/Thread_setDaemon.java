package day07;
/*
 * �ػ��߳�
 * �ػ��߳��ֳơ���̨�̡߳�
 * Ĭ�ϴ����������̶߳���ǰ̨�̣߳���̨�߳���Ҫ
 * ���е�������
 * ǰ̨���̨�߳�ʹ��û�������������ڽ���ʱ���ϣ�
 * ��һ�����н���ʱ�������е����к�̨�̻߳ᱻǿ��
 * �жϣ������̵Ľ���ʱ���ǵ�һ�������е�����ǰ̨
 * �̶߳�����ʱ
 */
public class Thread_setDaemon {
	public static void main(String[] args) {
		Thread rose=new Thread() {
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("rose: let me go!");
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						
					}
				}
				System.out.println("rose:������");
				System.out.println("��Ч����ͨ");
			}
		};
		Thread jack=new Thread() {
			public void run() {
				while(true) {
					System.out.println("jack��you jump,i jump");
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						
					}
				}
			}
		};
		rose.start();
		//����Ϊ��̨�̣߳���start֮ǰ����
		jack.setDaemon(true);
		jack.start();
		
		System.out.println("main�߳̽�����");
	}
}
