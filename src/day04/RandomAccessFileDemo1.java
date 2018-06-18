package day04;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ʹ��RAF��д������������
 * �Լ�RAF����ָ���д�Ĳ���
 * @author NiCo
 *
 */
public class RandomAccessFileDemo1 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			=new RandomAccessFile("pos:"+"raf.dat","rw");
		//RAF������Ϻ�ָ��Ĭ�����ļ���ʼ
		long pos=raf.getFilePointer();
		System.out.println(pos);
		/*
		 * ��int���ֵд���ļ�
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
		 * ��һ��intֵд��
		 */
		raf.writeInt(imax);
		System.out.println("pos:"+raf.getFilePointer());
		raf.writeLong(123L);
		System.out.println("pos:"+raf.getFilePointer());
		raf.writeDouble(123.123);
		System.out.println("pos:"+raf.getFilePointer());
		System.out.println("д�����");
		
		/*
		 * void seek(long pos)
		 * �ƶ�ָ�뵽ָ��λ��
		 */
		raf.seek(0);
		System.out.println("pos:"+raf.getFilePointer());
		/*
		 * int readInt()
		 * ������ȡ4���ֽڲ����ظ�intֵ
		 * ���ڶ�ȡ4���ֽڵĹ����ж�ȡ���ļ�ĩβ
		 * ����׳�EOFException
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
