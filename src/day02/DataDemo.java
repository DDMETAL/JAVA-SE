package day02;

import java.util.Date;

/**
 * java.util.Date
 * Date的每一个实例用于表示一个确切的时间点
 * 由于Date设计缺陷，所以在JDK1.1以后的大部分方法
 * 被声明为过时的，不再建议使用
 * 现在使用Date只来表示时间，时间相关操作全部用
 * Calendar来代替
 * @author NiCo
 *
 */
public class DataDemo {
		public static void main(String[] args) {
			//默认创建出来的表示当前系统时间
			Date date=new Date();
			/*
			 * Date重写toString方法
			 * 输出的是当前Date表示的日期时间
			 */
			System.out.println(date);
			//Date大部分方法都是过时的，开发时不要使用
			date.getYear();
			/*
			 * 获取Date内部维护的long值
			 */
			long time=date.getTime();
			System.out.println(time);
			time+=1000*60*60*24;
			/*
			 * 为Date设置一个long值，使其表示该long值
			 * 所表示的时间
			 */
			date.setTime(time);
			System.out.println(date);
			
		}
}
