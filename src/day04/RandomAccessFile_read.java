package day04;
/**
 * ��ȡ�ļ��е�����
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
		 * ��ȡһ���ֽڣ��������ֽڶ���������
		 * ��һ��intֵ��ʽ���ء�
		 * ������ֵΪ-1�����ʾ��ȡ�����ļ�ĩβ��
		 */
		int r=raf.read();
		System.out.println(r);
		
		raf.close();
	}
}
