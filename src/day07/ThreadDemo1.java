package day07;
/**
 * 方式二：
 * 实现Runnable接口单独定义线程任务
 * 
 * 第一种创建线程的方式存在两个设计上的不足：
 * 1：继承冲突，由于java是单继承的，这就导致
 *    一个类如果希望是线程，同时又需要扩展另一
 *    个类的功能时，由于不能同时继承这两个类，
 *    导致继承冲突
 * 2：继承线程需要重写run方法来定义线程任务，
 * 	  这就导致线程与任务定义在一起有一个强耦合关系
 * 	  不利于线程重用
 * 而第二种创建线程的方式解决了这两个问题
 * @author NiCo
 *
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		Runnable r1=new MyRunnable1();
		Runnable r2=new MyRunnable2();
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
	}
}
class MyRunnable1 implements Runnable{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("你好");
		}
	}
}
class MyRunnable2 implements Runnable{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("Hello");
		}
	}
}