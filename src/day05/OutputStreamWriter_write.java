package day05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Reader��Writer
 * �ַ��������ַ�Ϊ��λ��д����
 * �ַ���ֻ������д�ı�����
 * 
 * ת������
 * InputStreamReader
 * OutputStreamWriter
 * ת�������ַ�����һ��ʵ����
 * 
 * 
 * @author NiCo
 *
 */
public class OutputStreamWriter_write {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			=new FileOutputStream("fos1.txt");
		OutputStreamWriter osw
			=new OutputStreamWriter(fos,"GBK");
		osw.write("�ַ���");
		osw.write("ת����");
		System.out.println("д�����");
		osw.close();
	}
}
