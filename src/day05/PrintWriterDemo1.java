package day05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * ����������ʹ��PrintWriter
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
		pw.println("����������ʹ��");
		pw.println("PrintWriter");
		System.out.println("д�����");
		pw.close();
	}
}
