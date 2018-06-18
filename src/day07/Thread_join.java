package day07;
/**
 * 线程是异步执行代码的
 * 异步运行：多段代码可以同时运行，各干各的
 * 同步运行：运行代码有先后顺序的一句一句执行
 * 
 * 可以使用线程的join方法当多个线程出现同步运行
 * 的效果。让多个线程中的代码有先后顺序的执行
 * @author NiCo
 *
 */
public class Thread_join {
	//图片是否下载完毕
	private static boolean isFinish=false;
	public static void main(String[] args) {
		final Thread download=new Thread() {
			public void run() {
				System.out.println("down：开始下载");
				for(int i=0;i<100;i++) {
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(50);
					}catch(InterruptedException e) {
						
					}
				}
				System.out.println("down:图片下载完毕");
				isFinish=true;
			}
		};
		Thread show=new Thread() {
			public void run() {
				System.out.println("show:显示图片");
				/*
				 * 等待下载线程先将图片下载完毕
				 * 当show线程执行到downloda.join()方法
				 * 时，show线程进入阻塞状态，直到download线程
				 * 将任务执行完毕（download线程结束）时才会
				 * 解除阻塞继续向下运行代码
				 */
				try {
					/*
					 * 当一个方法的局部内部类中想引用
					 * 这个方法的其他局部变量，那么该
					 * 变量必须是final的，这源自JVM
					 * 的内存分配问题
					 * JDK8由于重构了JVM内存分配，解决
					 * 了这个问题。
					 */
					download.join();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				
				if(!isFinish) {
					throw new RuntimeException("图片没有下载完毕");
				}
				System.out.println("show:显示图片完毕");
			}
		};
		download.start();
		show.start();
	}
}
