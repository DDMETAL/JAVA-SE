package day05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * 
 * @author NiCo
 *
 */
public class PrintWriterDemo2 {
	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
		/*
		 * ���±�����
		 * ����������Ҫ���û�����һ���ļ���
		 * Ȼ�����Ը��ļ���pw.
		 * ֮���û��ڿ���̨�����ÿ���ַ���
		 * ������д�뵽�ļ���
		 * ���û�����"exit"ʱ�������˳�
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("�������ļ�����");
		String fileName=scan.nextLine();
		
		/*
		 * ����PrintWriterʱ�������ʹ��������
		 * ��ʽ�Ĺ��췽����1��ô���췽����֧��
		 * �ڶ�����������һ��booleanֵ������ֵ
		 * Ϊtrue����ôpw�;����Զ���ˢ�¹��ܣ�
		 * ����ÿ��ʹ��println����д��һ���ַ���ʱ��
		 * ���Զ�flush��ע�⣡print��������flush
		 */
		PrintWriter pw=new PrintWriter(
				new OutputStreamWriter(
						new FileOutputStream(fileName),"rw"
						),true
				);
		System.out.println("�뿪ʼ�������ݣ�");
		//���������û������ÿ���ַ���
		String line=null;
		while(true) {
			line=scan.nextLine();
			if("exit".equals(line)) {
				break;
			}
			pw.println(line);
//			pw.flush();
		}
		System.out.println("д�����");
		pw.close();
	}
}
