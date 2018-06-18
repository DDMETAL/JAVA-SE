package day04;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 可以通过提高每次都写的数据量减少读写次数
 * 来达到提高读写效率的目的
 * @author NiCo
 *
 */
public class CopyDemo1 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile src
		=new RandomAccessFile("AMD.mp4","r");
		RandomAccessFile desc
		=new RandomAccessFile("AMD_cp.mp4","rw");
		
		/*
		 * int read(byte[] data)
		 * 一次性读取给定的字节数组总长度的字节量
		 * 并存入到该数组中，返回值为实际读取到的
		 * 字节量，若返回为值-1，则表示本次读取的是
		 * 文件末尾。
		 */
		//10k
		byte[] data=new byte[1024*10];
		int len=-1;//表示实际读取到的字节量
		long start=System.currentTimeMillis();
		while((len=src.read(data))!=-1) {
			/*
			 * void write(byte[] data)
			 * 将给定的字节数组中所有字节一次性写出
			 * void write(byte[] data,int offer,int len)
			 * 将给定的字节数组中从offer处的连续len个字节一次性写出
			 */
			desc.write(data,0,len);
		}
		long end=System.currentTimeMillis();
		System.out.println("复制完毕！耗时:"+(end-start)+"毫秒");
		src.close();
		desc.close();
	}
}
