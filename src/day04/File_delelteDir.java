package day04;

import java.io.File;

/**
 * 1����дһ�δ��룬Ҫ��ʵ��1+2+3+����+100��������
 * 	  �ڸöδ����в��ó���for��while�ؼ���
 * 2��һ����ȥ����ˮ��1��Ǯһƿ��ˮ��3��ƿ�ǿ��Ի�һƿ
 * 	  ��ˮ��2����ƿ���Ի�һƿ��ˮ����дһ�δ������20��
 * 	  Ǯ�ܹ����Եõ�����ƿ��ˮ��
 * 
 * 
 * 
 * ɾ��Ŀ¼
 * @author NiCo
 *
 */
public class File_delelteDir {
	public static void main(String[] args) {
		File dir=new File("demo");
		if(dir.exists()) {
			dir.delete();
			System.out.println("Ŀ¼ɾ���ɹ�");
		}else {
			System.out.println("��Ŀ¼������");
		}
		File dirs=new File("a");
		delete(dirs);
	}
	public static void delete(File file) {
		/*
		 * �����ļ���ֱ��ɾ��
		 * ����Ŀ¼��Ҫ�Ƚ�Ŀ¼����������ɾ��
		 */
		if(file.exists()) {
			if(file.isDirectory()) {
				//���Ŀ¼
				File[] subs=file.listFiles();
				for(File sub:subs) {
					/*
					 * �ݹ����
					 * �����ڲ������Լ���������Ϊ
					 * 
					 * ʹ�õݹ�Ҫ���
					 * 1.�ݹ�Ĳ�����Ҫ̫�ԣ���Ϊ
					 * 	�ݹ���ÿ����ϴ�
					 * 2.�ݹ�����ڷ����в��ܱ�Ȼ
					 * 	ִ�У�������һ����֧�п���
					 * 	�����ã����������ѭ����
					 * 
					 * �ݹ��ǽ�һ�����������д�����
					 * 	��ִ�С�
					 */
					delete(sub);
				}
			}
			file.delete();
			//System.out.println("ɾ���ɹ�");
		}else {
			System.out.println("�ļ�������");
		}
	}
}
