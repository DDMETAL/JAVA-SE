package day07;



/**
 * 多线程并发安全问题
 * 当多个线程并发访问同一资源时，由于
 * 线程切换不确定，导致的代码执行顺序混乱
 * 从而出现很多问题
 * 严重时可能导致系统瘫痪
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
						//模拟发生线程切换
						Thread.yield();
						System.out.println(getName()+":"+bean);
					}
					
				}
			};
			Thread t2=new Thread(){
				public void run() {
					while(true) {
						int bean=table.getBean();
						//模拟发生线程切换
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
	//桌子上有20个豆子
	private int beans=20;
	/*
	 * 当一个方法使用synchronization修饰后，该方法
	 * 称为“同步方法”，多个线程不能同时在方法内部执行
	 * 必须按照顺序一个一个的执行方法
	 * 这样可以避免多个线程“抢着”执行同一个方法出现的
	 * 执行逻辑混乱所带来的一系列问题。
	 * 
	 * 在方法上使用synchronized，那么同步监视器
	 * 对象就是当前方法所属对象，即：this
	 */
	public synchronized int getBean() {
		if(beans==0) {
			throw new RuntimeException("没有豆子了");
		}
		//模拟发生线程切换
		Thread.yield();
		return beans--;
	}
}