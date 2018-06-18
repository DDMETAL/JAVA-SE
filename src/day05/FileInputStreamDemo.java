package day05;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * java.io.FileInputStream
 * 文件输入流，用于从文件中将数据读入到程序中
 * 
 * 
 * @author NiCo
 *
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis
			=new FileInputStream("fos.txt");
		byte[] data=new byte[200];
		int len=fis.read(data);
		String str=new String(data,0,len);
		System.out.println(str);
		fis.close();
	}
}
