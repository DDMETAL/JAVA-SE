package day05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.BufferedReader
 * 缓冲字符输入流，可以按行读取字符串
 * 
 * @author NiCo
 *
 */
public class BufferedReader_readLine {
	public static void main(String[] args) throws IOException {
		/*
		 * 将当前类的源代码输出到控制台
		 */
		FileInputStream fis
			=new FileInputStream("."+File.separator+"src"
					+File.separator+"day05"
					+File.separator+"BufferedReader_readLine.java");
		InputStreamReader isr
			=new InputStreamReader(fis);
		BufferedReader br
			=new BufferedReader(isr);
		/*
		 * String readLine()
		 * 该方法会使缓冲流读取若干字符，
		 * 直到读取到换行符为止，然后将换行符之前的所有字符
		 * 组成一个字符串返回，但是返回的字符串中
		 * 不含有最后的换行符。
		 * 若返回值为null，则表示本次没有读取到任何内容
		 * （读文件的话就是文件末尾）
		 * 只有通过该流不能再次读取到内容时返回NULL。
		 * 
		 */
		String line=null;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}
}
