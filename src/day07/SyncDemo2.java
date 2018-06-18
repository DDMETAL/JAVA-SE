package day07;
/**
 * 静态方法上使用synchronization修饰后
 * 该方法一定具有同步效果
 * @author NiCo
 *
 */
public class SyncDemo2 {
	public static void main(String[] args) {
		Thread t1=new Thread() {
			public void run() {
				B.dosome();
			}
		};
		Thread t2=new Thread() {
			public void run() {
				B.dosome();
			}
		};
		t1.start();
		t2.start();
	}
	
}
class B{
	public synchronized static void dosome() {
		Thread t=Thread.currentThread();
		try {
			System.out.println(t.getName()+"正在运行dosome方法");
			Thread.sleep(5000);
			System.out.println(t.getName()+"运行dosome方法结束");
		} catch (Exception e) {
			
		}
	}
}