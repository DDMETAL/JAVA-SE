package day04;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * ���ڶ�д�ļ����ݵ���
 * RAF�ǻ���ָ����ʽ��д�ļ����ݵģ��Ƚ����
 * RAF�����ִ���ģʽ��ֻ��ģʽ�Ͷ�дģʽ
 * @author NiCo
 *
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * RandomAccessFile�ĳ��ù��췽����
		 * 
		 * RandomAccessFile(File file,String mode)
		 * RandomAccessFile(String path,String mode)
		 * 
		 * modeģʽ���õ��У�
		 * "r"��ֻ��ģʽ(�����ļ���FileNotFoundException��
		 * "rw":��дģʽ(��������������Զ������ļ�)
		 */
		RandomAccessFile raf
			=new RandomAccessFile("demo.dat","rw");
		/*���ļ���д������
		 *
		 * void write(int d)
		 * ���ļ���д��һ���ֽڣ�д���Ǹ���intֵ
		 * ��Ӧ�Ķ����Ƶ�"�Ͱ�λ";
		 * 
		 */
		// 00000000 00000000 00000000 00000001
		//                            wwwwwwww
		raf.write(1);
		System.out.println("д�����");

		
		
	}
}
