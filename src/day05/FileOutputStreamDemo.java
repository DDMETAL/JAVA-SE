package day05;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ����java��׼�Ķ�д������ʽ
 * �������ܷ�Ϊ���������������
 * ��������������ȡ���ݵ���
 * �����������д�����ݵ���
 * 
 * ����Ϊ���ڵ�����������
 * �ڵ������ͼ�����������Դ��ȷ����дһ�������ڵͼ���
 * 				  �ϣ���ʵ����������Դ�������������
 * ���������߼����������ܶ������ڣ������壩����Ҫ��������
 * 				  ����֮�϶��䴦��ʹ�ô�������Ŀ����
 * 				  �ڼ򻯶�д����
 * 
 * java.io.FileOutputStream
 * �ļ������
 * �ļ����ǵͼ���
 * 
 * �ļ������������д���ļ���
 * @author NiCo
 *
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
	/*
	 * ���췽����
	 * FileOutputStream(String path)
	 * FileOutputStream(File file)
	 * ����������ʽ�������ļ������Ĭ��Ϊ����д������
	 * ����ָ�����ļ����Ѿ���������Ƚ����ļ���������
	 * �����Ȼ��ͨ������д�������ݻ���Ϊ���ļ�������
	 * 
	 * 
	 * FileOutputStream(String path��boolean append)
	 * FileOutputStream(File file,boolean append)
	 * �����������췽��Ҫ����һ��booleanֵ
	 * ���������ò���Ϊtrue����Ϊ׷��д������ͨ��
	 * ��ǰ��д�������ݻᱻ׷�ӵ��ļ���ĩβ
	 */
		FileOutputStream fos
			=new FileOutputStream("fos.txt",true);
		fos.write("java".getBytes());
		fos.write("c++".getBytes());
		System.out.println("д�����");
		fos.close();
		
		
	}
}
