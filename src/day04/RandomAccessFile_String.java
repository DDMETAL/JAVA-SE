package day04;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��д�ַ���
 * @author NiCo
 *
 */
public class RandomAccessFile_String {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			=new RandomAccessFile("raf.txt","rw");
		String str="ѧϰjava";
		/*
		 * String�ṩ�˷������Խ���ǰ�ַ���
		 * ת��Ϊһ���ֽ�
		 * byte[] getBytes()
		 * ����ϵͳĬ���ַ���ת��Ϊһ���ֽ�
		 * 
		 * byte[] getBytes(String csn)
		 * ����ָ�����ַ���ת��Ϊһ���ֽ�
		 * �ַ������Ƴ��õ��У�
		 * GBK,UTF-8
		 */
		byte[] data=str.getBytes("gbk");
		raf.write(data);
		raf.write("Ҫ���".getBytes("gbk"));
		System.out.println("д�����");
		
		
		raf.seek(0);
		byte[] data1=new byte[100];
		int len=raf.read(data1);
		
		String str1=new String(data1,0,len,"gbk");
		System.out.println(str1);
		raf.close();
	}
}
