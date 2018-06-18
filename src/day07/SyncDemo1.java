package day07;
/**
 * 同步块
 * 有效的缩小同步范围可以在保证安全的前提下
 * 提高代码并发执行的效率
 * @author NiCo
 *
 */
public class SyncDemo1 {
	public static void main(String[] args) {
		final Shop shop=new Shop();
		Thread t1=new Thread() {
			public void run() {
				shop.buy();
			}
		};
		Thread t2=new Thread() {
			public void run() {
				shop.buy();
			}
		};
		t1.start();
		t2.start();
	}
}
class Shop{
	//public synchronized void buy() {
	public  void buy() {
		Thread t=Thread.currentThread();
		try {
			System.out.println(t.getName()+":正在挑衣服...");
			Thread.sleep(5000);
			/*
			 * 同步块
			 * synchronized(同步监视器){
			 * 		需要同步执行的代码片段
			 * }
			 * 同步监视器即上锁的对象，可以是java中的
			 * 任意对象，但是必须保证需要同步执行代码
			 * 的多个线程看到的该对象必须是“同一个”才可以
			 * 通常可以使用this
			 */
		//	synchronized (new Object()) { //不可以
			synchronized (this) {
				System.out.println(t.getName()+":正在试衣服...");
				Thread.sleep(5000);
			}
			System.out.println(t.getName()+":结帐");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}