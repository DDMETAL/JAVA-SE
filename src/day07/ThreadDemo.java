package day07;
/**
 * 多线程
 * 多线程允许多段代码”同时运行“
 * 多线程运行代码实际上是并发运行的，不是真正意义
 * 上的同时运行
 * 
 * 线程有两种创建方式：
 * 方式一：
 * 继承Thread并重写run方法
 * 
 * @author NiCo
 *
 */
public class ThreadDemo {
	public static void main(String[] args) {
		Thread t1=new MyThread1();
		Thread t2=new MyThread2();
		/*
		 * 启动线程
		 * 启动线程要执行start方法
		 * 该方法的作用是将当前线程纳入到线程调度
		 * 该方法调用完毕后，线程会很快被分配到CPU
		 * 时间片开始运行，一旦开始运行会自动执行该
		 * 线程的run方法来运行线程任务
		 */
		t1.start();
		t2.start();
	}
}
class MyThread1 extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("你好");
		}
	}
}
class MyThread2 extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("Hello");
		}
	}
}