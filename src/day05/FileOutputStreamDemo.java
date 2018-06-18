package day05;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 流是java标准的读写操作方式
 * 流按功能分为：输入流，输出流
 * 输入流：用来读取数据的流
 * 输出流：用来写出数据的流
 * 
 * 流分为：节点流，处理流
 * 节点流（低级流）：数据源明确，读写一定建立在低级流
 * 				  上，真实负责在数据源与程序间搬运数据
 * 处理流（高级流）：不能独立存在（无意义），需要建立在其
 * 				  他流之上对其处理，使用处理流的目的在
 * 				  于简化读写操作
 * 
 * java.io.FileOutputStream
 * 文件输出流
 * 文件流是低级流
 * 
 * 文件输出流将数据写入文件中
 * @author NiCo
 *
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
	/*
	 * 构造方法：
	 * FileOutputStream(String path)
	 * FileOutputStream(File file)
	 * 上面两种形式创建的文件输出流默认为覆盖写操作，
	 * 即：指定的文件若已经存在则会先将该文件所有数据
	 * 清除，然后通过该流写出的内容会作为该文件的内容
	 * 
	 * 
	 * FileOutputStream(String path，boolean append)
	 * FileOutputStream(File file,boolean append)
	 * 上面两个构造方法要求传入一个boolean值
	 * 参数，若该参数为true，则为追加写操作，通过
	 * 当前流写出的内容会被追加到文件的末尾
	 */
		FileOutputStream fos
			=new FileOutputStream("fos.txt",true);
		fos.write("java".getBytes());
		fos.write("c++".getBytes());
		System.out.println("写出完成");
		fos.close();
		
		
	}
}
