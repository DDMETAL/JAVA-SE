package day07;
/**
 * 使用匿名内部类来完成方式一和方式二的线程创建
 * @author NiCo
 *
 */
public class ThreadDemo2 {
	public static void main(String[] args) {
		Thread t1=new Thread() {
			public void run() {
				for(int i=0;i<100;i++) {
					System.out.println("你好");
				}
			}
		};
		Runnable r2=new Runnable() {
			public void run() {
				for(int i=0;i<100;i++) {
					System.out.println("Hello");
				}
			}
		};
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
	}
}
