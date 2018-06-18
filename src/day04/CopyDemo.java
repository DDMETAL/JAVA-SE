package day04;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * �ļ�����
 * @author NiCo
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile src
		=new RandomAccessFile("HashMap.png","r");
		RandomAccessFile desc
		=new RandomAccessFile("HashMap_cp.png","rw");
		
		//�ñ������������Դ�ļ�������ÿ���ֽ�
		int d=-1;
		
		long start=System.currentTimeMillis();
		while((d=src.read())!=-1) {
			desc.write(d);
		}
		long end=System.currentTimeMillis();
		System.out.println("������ɣ���ʱ��"+(end-start)+"����");
		src.close();
		desc.close();
	}
	
	
	
}
