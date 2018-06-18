package day04;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * 用于读写文件数据的类
 * RAF是基于指针形式读写文件数据的，比较灵活
 * RAF有两种创建模式：只读模式和读写模式
 * @author NiCo
 *
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * RandomAccessFile的常用构造方法：
		 * 
		 * RandomAccessFile(File file,String mode)
		 * RandomAccessFile(String path,String mode)
		 * 
		 * mode模式常用的有：
		 * "r"：只读模式(若无文件则FileNotFoundException）
		 * "rw":读写模式(若不存在则可以自动创建文件)
		 */
		RandomAccessFile raf
			=new RandomAccessFile("demo.dat","rw");
		/*向文件中写入数据
		 *
		 * void write(int d)
		 * 向文件中写入一个字节，写的是给定int值
		 * 对应的二进制的"低八位";
		 * 
		 */
		// 00000000 00000000 00000000 00000001
		//                            wwwwwwww
		raf.write(1);
		System.out.println("写入完毕");

		
		
	}
}
