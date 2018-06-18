package day04;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ����ͨ�����ÿ�ζ�д�����������ٶ�д����
 * ���ﵽ��߶�дЧ�ʵ�Ŀ��
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
		 * һ���Զ�ȡ�������ֽ������ܳ��ȵ��ֽ���
		 * �����뵽�������У�����ֵΪʵ�ʶ�ȡ����
		 * �ֽ�����������Ϊֵ-1�����ʾ���ζ�ȡ����
		 * �ļ�ĩβ��
		 */
		//10k
		byte[] data=new byte[1024*10];
		int len=-1;//��ʾʵ�ʶ�ȡ�����ֽ���
		long start=System.currentTimeMillis();
		while((len=src.read(data))!=-1) {
			/*
			 * void write(byte[] data)
			 * ���������ֽ������������ֽ�һ����д��
			 * void write(byte[] data,int offer,int len)
			 * ���������ֽ������д�offer��������len���ֽ�һ����д��
			 */
			desc.write(data,0,len);
		}
		long end=System.currentTimeMillis();
		System.out.println("������ϣ���ʱ:"+(end-start)+"����");
		src.close();
		desc.close();
	}
}
