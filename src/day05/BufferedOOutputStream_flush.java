package day05;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ������д�����ݵĻ���������
 * @author NiCo
 *
 */
public class BufferedOOutputStream_flush {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			=new FileOutputStream("bos.txt");
		BufferedOutputStream bos
			=new BufferedOutputStream(fos);
		bos.write("java".getBytes());
		/*
		 * flush������ǿ�ƽ����������Ѿ����������
		 * һ����д��
		 */
	//	bos.flush();
		
		System.out.println("д�����");
		bos.close();//colse��Ҳ��flush
	}
}
