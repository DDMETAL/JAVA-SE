package day05;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * 缓冲字符输出流
 * 特点：可以按行写出字符串
 * 		并且具有自动行刷新功能
 * 
 * 
 * @author NiCo
 *
 */
public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * PrintWriter提供了种类很多的构造方法
		 * 其中有直接对文件写操作的构造方法：
		 * PrintWriter(String path)
		 * PrintWriter(File file)
		 * 
		 * 
		 *向文件中写字符串
		 */
		PrintWriter pw
			=new PrintWriter("pw.txt");
		pw.println("可以按行写出字符串");
		pw.println("并且具有自动行刷新功能");
		System.out.println("写出完毕");
		pw.close();
	}
}
