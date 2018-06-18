package day05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * 
 * @author NiCo
 *
 */
public class PrintWriterDemo2 {
	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
		/*
		 * 记事本功能
		 * 程序启动后要求用户输入一个文件名
		 * 然后打开针对该文件的pw.
		 * 之后用户在控制台输入的每行字符串
		 * 都按行写入到文件中
		 * 当用户输入"exit"时，程序退出
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入文件名：");
		String fileName=scan.nextLine();
		
		/*
		 * 创建PrintWriter时，如果是使用流连接
		 * 形式的构造方法，1那么构造方法就支持
		 * 第二个参数，是一个boolean值，若该值
		 * 为true，那么pw就具有自动行刷新功能，
		 * 即：每当使用println方法写出一行字符串时，
		 * 会自动flush，注意！print方法不会flush
		 */
		PrintWriter pw=new PrintWriter(
				new OutputStreamWriter(
						new FileOutputStream(fileName),"rw"
						),true
				);
		System.out.println("请开始输入内容：");
		//用来保存用户输入的每行字符串
		String line=null;
		while(true) {
			line=scan.nextLine();
			if("exit".equals(line)) {
				break;
			}
			pw.println(line);
//			pw.flush();
		}
		System.out.println("写出完成");
		pw.close();
	}
}
