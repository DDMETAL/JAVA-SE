package day07;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 线程提供了静态方法
 * static void sleep(long ms)
 * 该方法会导致运行当前方法的线程进入阻塞状态
 * 指定的毫秒值，当超时后，线程会自动回到Runnable
 * 状态，等待再次分配CPU时间并发运行
 * @author NiCo
 *
 */
public class Thread_sleep {
	public static void main(String[] args) {
		System.out.println("程序开始");
		/*
		 * 电子表功能
		 * 每秒输出当前系统时间，
		 * 格式：15：18：11
		 */
		SimpleDateFormat sdf
			=new SimpleDateFormat("HH:mm:ss");
		while(true) {
			try {
				System.out.println(sdf.format(new Date()));
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
		}
	}
}
