package day07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 线程池的主要功能是：
 * 1.控制线程数量
 * 2.重用线程
 * 当并发任务量大时，或者有频频创建线程执行任务的
 * 操作时，就应当使用线程池来调度线程
 * 
 * @author NiCo
 *
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService threadPool
			=Executors.newFixedThreadPool(2);
		
		for(int i=0;i<5;i++) {
			Runnable runn=new Runnable() {
				public void run() {
					Thread t=Thread.currentThread();
					System.out.println(t.getName()+"正在运行");
					try {
						Thread.sleep(5000);
						System.out.println(t.getName()+"运行结束");
					} catch (InterruptedException e) {
						System.out.println("线程被中断");
					}
				}
			};
			//将任务指派给线程池
			threadPool.execute(runn);
			System.out.println("指派了一个任务给线程池");
		}
		threadPool.shutdownNow();
		System.out.println("线程池停止了");
	}
}
