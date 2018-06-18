package day05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.BufferedReader
 * �����ַ������������԰��ж�ȡ�ַ���
 * 
 * @author NiCo
 *
 */
public class BufferedReader_readLine {
	public static void main(String[] args) throws IOException {
		/*
		 * ����ǰ���Դ�������������̨
		 */
		FileInputStream fis
			=new FileInputStream("."+File.separator+"src"
					+File.separator+"day05"
					+File.separator+"BufferedReader_readLine.java");
		InputStreamReader isr
			=new InputStreamReader(fis);
		BufferedReader br
			=new BufferedReader(isr);
		/*
		 * String readLine()
		 * �÷�����ʹ��������ȡ�����ַ���
		 * ֱ����ȡ�����з�Ϊֹ��Ȼ�󽫻��з�֮ǰ�������ַ�
		 * ���һ���ַ������أ����Ƿ��ص��ַ�����
		 * ���������Ļ��з���
		 * ������ֵΪnull�����ʾ����û�ж�ȡ���κ�����
		 * �����ļ��Ļ������ļ�ĩβ��
		 * ֻ��ͨ�����������ٴζ�ȡ������ʱ����NULL��
		 * 
		 */
		String line=null;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}
}
