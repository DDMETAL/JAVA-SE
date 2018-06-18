package day07;
/*
 * 守护线程
 * 守护线程又称“后台线程”
 * 默认创建出来的线程都是前台线程，后台线程需要
 * 进行单独设置
 * 前台与后台线程使用没有区别，区别在于结束时机上，
 * 当一个进行结束时，进行中的所有后台线程会被强制
 * 中断，而进程的结束时机是当一个进程中的所有前台
 * 线程都结束时
 */
public class Thread_setDaemon {
	public static void main(String[] args) {
		Thread rose=new Thread() {
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("rose: let me go!");
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						
					}
				}
				System.out.println("rose:啊啊啊");
				System.out.println("音效：噗通");
			}
		};
		Thread jack=new Thread() {
			public void run() {
				while(true) {
					System.out.println("jack：you jump,i jump");
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						
					}
				}
			}
		};
		rose.start();
		//设置为后台线程，在start之前设置
		jack.setDaemon(true);
		jack.start();
		
		System.out.println("main线程结束了");
	}
}
