package day07;
/**
 * �߳����ȼ�
 * �̶߳����̵߳��ȵĹ����ǲ��ɿ��Ƶ�
 * �߳�ֻ�ܱ����ı�����CPUʱ�䣬����
 * ������ȡ���ı��߳����ȼ��������̶ȸ���
 * �̻߳�ȡCPU�ļ���
 * 
 * �������߳����ȼ�Խ�ߵ��̻߳�ȡCPUʱ��Ƭ�Ĵ���Խ��
 * @author NiCo
 *
 */
public class Thread_setPriority {
	public static void main(String[] args) {
		Thread max=new Thread() {
			public void run() {
				for(int i=0;i<10000;i++) {
					System.out.println("max");
				}
			}
		};
		Thread nor=new Thread() {
			public void run() {
				for(int i=0;i<10000;i++) {
					System.out.println("nor");
				}
			}
		};
		Thread min=new Thread() {
			public void run() {
				for(int i=0;i<10000;i++) {
					System.out.println("min");
				}
			}
		};
		min.setPriority(1);
		max.setPriority(10);
		max.start();
		nor.start();
		min.start();
	}
}
