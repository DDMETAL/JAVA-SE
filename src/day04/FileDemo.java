package day04;

import java.io.File;
import java.text.SimpleDateFormat;


/**
 * java.io.File
 * File��ÿһ��ʵ�����ڱ�ʾ�ļ�ϵͳ�е�һ��
 * �ļ���Ŀ¼
 * ʹ��File���ԣ�
 * 1.�����ļ���Ŀ¼��������Ϣ�����֣���С���޸�ʱ��ȣ�
 * 2�������ļ���Ŀ¼��������ɾ����
 * 3.����Ŀ¼����
 * 
 * ���ǲ��ܷ����ļ�����
 * @author NiCo
 *
 */
public class FileDemo {
	public static void main(String[] args) {
		/*
		 * ��ʹ��·��ʱ����ʹ�����·������Ϊ
		 * ����·����ͬ��ϵͳ��һ�����ᵼ�¿�ƽ̨����
		 * ���·�����ã�
		 * 1.�����·������ã�
		 * 2.��ǰĿ¼����eclipse�е�ǰĿ¼����ָ��ǰ�����ڵ���ĿĿ¼
		 */
			File file=new File(
					"."+File.separator+"demo.txt");
			String name=file.getName();
			System.out.println(name);
			
			//�����ļ��Ĵ�С���ֽ�����
			long length=file.length();
			System.out.println(length);
			
			boolean cr=file.canRead();
			System.out.println("�Ƿ�ɶ�"+cr);
			
			boolean cw=file.canWrite();
			System.out.println("�Ƿ��д"+cw);
			
			boolean ih=file.isHidden();
			System.out.println("�Ƿ����أ�"+ih);
			
			//����޸�ʱ��
			long time=file.lastModified();
			SimpleDateFormat sdf=
					new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println("�޸�ʱ�䣺"+sdf.format(time));
	
	}
	
		
}
