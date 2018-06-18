package day05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Reader和Writer
 * 字符流，以字符为单位读写数据
 * 字符流只用来读写文本数据
 * 
 * 转换流：
 * InputStreamReader
 * OutputStreamWriter
 * 转换流是字符流的一对实现类
 * 
 * 
 * @author NiCo
 *
 */
public class OutputStreamWriter_write {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			=new FileOutputStream("fos1.txt");
		OutputStreamWriter osw
			=new OutputStreamWriter(fos,"GBK");
		osw.write("字符流");
		osw.write("转换流");
		System.out.println("写出完成");
		osw.close();
	}
}
