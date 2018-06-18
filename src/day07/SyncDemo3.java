package day07;
/**
 * 互斥锁
 * 使用synchronized修饰的是多端代码
 * 但是这些同步块的同步监视器对象是同
 * 一个的时候，这些代码间就具有了互斥效果
 * 同一时间多个线程不能同时在这些方法内部执行
 * @author NiCo
 *
 */
public class SyncDemo3 {
	public static void main(String[] args) {
		final F f=new F();
		Thread t1=new Thread() {
			public void run() {
				f.menthodA();
			}
		};
		Thread t2=new Thread() {
			public void run() {
				f.menthodA();
			}
		};
		t1.start();
		t2.start();
	}
}
class F{
	public  void menthodA() {
		synchronized (this) {
			try {
				Thread t=Thread.currentThread();
				System.out.println(t.getName()+"正在执行A");
				Thread.sleep(5000);
				System.out.println(t.getName()+"A结束");
			} catch (Exception e) {
			
			}
		}
		
	}
	public synchronized void menthodB() {
		try {
			Thread t=Thread.currentThread();
			System.out.println(t.getName()+"正在执行B");
			Thread.sleep(5000);
			System.out.println(t.getName()+"B结束");
		} catch (Exception e) {
		
		}
	}
}