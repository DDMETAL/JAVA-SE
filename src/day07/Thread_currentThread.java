package day07;
/**
 * 线程提供了一个静态方法：
 * static Thread currentThread
 * 该方法可以获取运行当前方法的线程
 * @author NiCo
 *
 */
public class Thread_currentThread {
	public static void main(String[] args) {
		/*
		 * JVM启动后会创建一个线程来运行main方法
		 */
		//获取运行main方法的线程
		Thread main=Thread.currentThread();
		System.out.println("运行main方法的线程是："+main);
		dosome();
		
		
		Thread t=new Thread() {
			public void run() {
				Thread t=Thread.currentThread();
				System.out.println("自定义线程："+t);
				dosome();
			}
		};
		t.start();
	}
	public static void dosome() {
		Thread t=Thread.currentThread();
		System.out.println("运行dosome方法的线程是："+t);
	}
}
