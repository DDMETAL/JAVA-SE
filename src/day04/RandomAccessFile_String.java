package day04;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读写字符串
 * @author NiCo
 *
 */
public class RandomAccessFile_String {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			=new RandomAccessFile("raf.txt","rw");
		String str="学习java";
		/*
		 * String提供了方法可以将当前字符串
		 * 转换为一组字节
		 * byte[] getBytes()
		 * 按照系统默认字符集转换为一组字节
		 * 
		 * byte[] getBytes(String csn)
		 * 按照指定的字符集转换为一组字节
		 * 字符集名称常用的有：
		 * GBK,UTF-8
		 */
		byte[] data=str.getBytes("gbk");
		raf.write(data);
		raf.write("要灵活".getBytes("gbk"));
		System.out.println("写出完毕");
		
		
		raf.seek(0);
		byte[] data1=new byte[100];
		int len=raf.read(data1);
		
		String str1=new String(data1,0,len,"gbk");
		System.out.println(str1);
		raf.close();
	}
}
