package day07;
/**
 * 线程优先级
 * 线程对于线程调度的工作是不可控制的
 * 线程只能被动的被分配CPU时间，不能
 * 主动获取。改变线程优先级可以最大程度改善
 * 线程获取CPU的几率
 * 
 * 理论上线程优先级越高的线程获取CPU时间片的次数越多
 * @author NiCo
 *
 */
public class Thread_setPriority {
	public static void main(String[] args) {
		Thread max=new Thread() {
			public void run() {
				for(int i=0;i<10000;i++) {
					System.out.println("max");
				}
			}
		};
		Thread nor=new Thread() {
			public void run() {
				for(int i=0;i<10000;i++) {
					System.out.println("nor");
				}
			}
		};
		Thread min=new Thread() {
			public void run() {
				for(int i=0;i<10000;i++) {
					System.out.println("min");
				}
			}
		};
		min.setPriority(1);
		max.setPriority(10);
		max.start();
		nor.start();
		min.start();
	}
}
