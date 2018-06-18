package day05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.InputStreamReader
 * 转换流，字符输入流
 * 可以按照指定的字符集读取字符
 * 
 * 
 * 大部分低级流都是字节流，而字符流基本都是高级流
 * 但是这些字符流通常只处理其他字符流，这就导致
 * 它们不能直接连接到字节流上，为此可以通过
 * InputStreamReader，OutputStreamWriter
 * 在中间进行转换
 * @author NiCo
 *
 */
public class InputStreamReader_read {
	public static void main(String[] args) throws IOException {
		FileInputStream fis
			=new FileInputStream("fos1.txt");
		InputStreamReader isr
			=new InputStreamReader(fis);
		
//		char[] data=new char[100];
//		int len=isr.read(data) ;
//		String str=new String(data,0,len);
//		System.out.println(str);
		
		int d=-1;
		while((d=isr.read())!=-1) {
			System.out.print((char)d);
		}
		isr.close();
	}
}
