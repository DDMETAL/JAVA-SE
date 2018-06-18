package day07;



/**
 * ���̲߳�����ȫ����
 * ������̲߳�������ͬһ��Դʱ������
 * �߳��л���ȷ�������µĴ���ִ��˳�����
 * �Ӷ����ֺܶ�����
 * ����ʱ���ܵ���ϵͳ̱��
 * @author NiCo
 *
 */
public class SyncDemo {
	public static void main(String[] args) {
		final Table table=new Table();
			Thread t1=new Thread(){
				public void run() {
					while(true) {
						int bean=table.getBean();
						//ģ�ⷢ���߳��л�
						Thread.yield();
						System.out.println(getName()+":"+bean);
					}
					
				}
			};
			Thread t2=new Thread(){
				public void run() {
					while(true) {
						int bean=table.getBean();
						//ģ�ⷢ���߳��л�
						Thread.yield();
						System.out.println(getName()+":"+bean);
					}
					
				}
			};
			t1.start();
			t2.start();
	}
}
class Table{
	//��������20������
	private int beans=20;
	/*
	 * ��һ������ʹ��synchronization���κ󣬸÷���
	 * ��Ϊ��ͬ��������������̲߳���ͬʱ�ڷ����ڲ�ִ��
	 * ���밴��˳��һ��һ����ִ�з���
	 * �������Ա������̡߳����š�ִ��ͬһ���������ֵ�
	 * ִ���߼�������������һϵ�����⡣
	 * 
	 * �ڷ�����ʹ��synchronized����ôͬ��������
	 * ������ǵ�ǰ�����������󣬼���this
	 */
	public synchronized int getBean() {
		if(beans==0) {
			throw new RuntimeException("û�ж�����");
		}
		//ģ�ⷢ���߳��л�
		Thread.yield();
		return beans--;
	}
}