package day04;
/**
 * 读取文件中的数据
 * 
 */
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_read {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
		=new RandomAccessFile("demo.dat","rw");
		
		/*
		 * int read()
		 * 读取一个字节，并将该字节二进制内容
		 * 以一个int值形式返回。
		 * 若返回值为-1，则表示读取到了文件末尾。
		 */
		int r=raf.read();
		System.out.println(r);
		
		raf.close();
	}
}
