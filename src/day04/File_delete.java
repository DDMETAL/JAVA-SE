package day04;

import java.io.File;

/**
 * ɾ���ļ�
 * @author NiCo
 *
 */
public class File_delete {
	public static void main(String[] args) {
		/*
		 * ɾ����ǰĿ¼�е�test.txt�ļ�
		 * ʹ��delete����ɾ��Ŀ¼ʱҪ���Ŀ¼������
		 * ��Ŀ¼�������޷�ɾ��
		 */
		File file=new File("test.txt");
		if(file.exists()) {
			file.delete();
			System.out.println("ɾ���ɹ���");
		}else {
			System.out.println("���ļ������ڣ�");
		}
	}
}
