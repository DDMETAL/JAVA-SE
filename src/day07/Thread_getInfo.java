package day07;
/**
 * ��ȡ�߳���Ϣ����ط���
 * @author NiCo
 *
 */
public class Thread_getInfo {
	public static void main(String[] args) {
		Thread main=Thread.currentThread();
		//�߳�����
		String name=main.getName();
		System.out.println("name:"+name);
		
		//��ȡ�߳�ID
		long id=main.getId();
		System.out.println("id:"+id);
		
		//�߳����ȼ�
		int priority=main.getPriority();
		System.out.println("priority:"+priority);
		
		//�Ƿ��ڻ״̬
		boolean isAlive=main.isAlive();
		System.out.println("isAlive:"+isAlive);
		
		//�Ƿ�Ϊ�ػ��߳�
		boolean isDaemon=main.isDaemon();
		System.out.println("isDaemon:"+isDaemon);
		
		//�Ƿ��ж�
		boolean isInterrupted=main.isInterrupted();
		System.out.println("isInterrupted:"+isInterrupted);
		
	}
}
