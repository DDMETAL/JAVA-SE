package day05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.InputStreamReader
 * ת�������ַ�������
 * ���԰���ָ�����ַ�����ȡ�ַ�
 * 
 * 
 * �󲿷ֵͼ��������ֽ��������ַ����������Ǹ߼���
 * ������Щ�ַ���ͨ��ֻ���������ַ�������͵���
 * ���ǲ���ֱ�����ӵ��ֽ����ϣ�Ϊ�˿���ͨ��
 * InputStreamReader��OutputStreamWriter
 * ���м����ת��
 * @author NiCo
 *
 */
public class InputStreamReader_read {
	public static void main(String[] args) throws IOException {
		FileInputStream fis
			=new FileInputStream("fos1.txt");
		InputStreamReader isr
			=new InputStreamReader(fis);
		
//		char[] data=new char[100];
//		int len=isr.read(data) ;
//		String str=new String(data,0,len);
//		System.out.println(str);
		
		int d=-1;
		while((d=isr.read())!=-1) {
			System.out.print((char)d);
		}
		isr.close();
	}
}
