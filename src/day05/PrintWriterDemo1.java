package day05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 在流连接中使用PrintWriter
 * 
 * @author NiCo
 *
 */
public class PrintWriterDemo1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			=new FileOutputStream("pw2.txt");
	//	OutputStreamWriter osw
	//		=new OutputStreamWriter(fos,"GBK");
		PrintWriter pw
			=new PrintWriter(fos);
		pw.println("在流连接中使用");
		pw.println("PrintWriter");
		System.out.println("写出完成");
		pw.close();
	}
}
