package day05;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * �����ַ������
 * �ص㣺���԰���д���ַ���
 * 		���Ҿ����Զ���ˢ�¹���
 * 
 * 
 * @author NiCo
 *
 */
public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * PrintWriter�ṩ������ܶ�Ĺ��췽��
		 * ������ֱ�Ӷ��ļ�д�����Ĺ��췽����
		 * PrintWriter(String path)
		 * PrintWriter(File file)
		 * 
		 * 
		 *���ļ���д�ַ���
		 */
		PrintWriter pw
			=new PrintWriter("pw.txt");
		pw.println("���԰���д���ַ���");
		pw.println("���Ҿ����Զ���ˢ�¹���");
		System.out.println("д�����");
		pw.close();
	}
}
