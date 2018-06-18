package day04;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用RAF读写基本数据类型
 * 以及RAF基于指针读写的操作
 * @author NiCo
 *
 */
public class RandomAccessFileDemo1 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			=new RandomAccessFile("pos:"+"raf.dat","rw");
		//RAF创建完毕后指针默认在文件开始
		long pos=raf.getFilePointer();
		System.out.println(pos);
		/*
		 * 将int最大值写入文件
		 * 
		 * 01111111 11111111 11111111 11111111
		 * 
		 */
		int imax=Integer.MAX_VALUE;
		raf.write(imax>>>24);
		System.out.println("pos:"+raf.getFilePointer());
		raf.write(imax>>>16);
		System.out.println("pos:"+raf.getFilePointer());
		raf.write(imax>>>8);
		System.out.println("pos:"+raf.getFilePointer());
		raf.write(imax);
		System.out.println("pos:"+raf.getFilePointer());
		/*
		 * void writeInt(int d)
		 * 将一个int值写出
		 */
		raf.writeInt(imax);
		System.out.println("pos:"+raf.getFilePointer());
		raf.writeLong(123L);
		System.out.println("pos:"+raf.getFilePointer());
		raf.writeDouble(123.123);
		System.out.println("pos:"+raf.getFilePointer());
		System.out.println("写入完成");
		
		/*
		 * void seek(long pos)
		 * 移动指针到指定位置
		 */
		raf.seek(0);
		System.out.println("pos:"+raf.getFilePointer());
		/*
		 * int readInt()
		 * 连续读取4个字节并返回该int值
		 * 若在读取4个字节的过程中读取到文件末尾
		 * 则会抛出EOFException
		 * EOF(end of file)
		 */
		int inum=raf.readInt();
		System.out.println("int:"+inum);
		System.out.println("pos:"+raf.getFilePointer());
		
		raf.seek(8);
		Long lnum=raf.readLong();
		System.out.println("long:"+lnum);
		System.out.println("pos:"+raf.getFilePointer());
		
		double dnum=raf.readDouble();
		System.out.println("double:+"+dnum);
		System.out.println("pos:"+raf.getFilePointer());
		raf.close();
		
	}
}
