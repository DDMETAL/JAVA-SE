package day04;

import java.io.File;
import java.io.IOException;

/**
 * �����ļ�
 * @author NiCo
 *
 */
public class File_createNewFile {
	public static void main(String[] args) throws IOException {
		/*
		 * ��ǰĿ¼�´���һ��test.txt�ļ�
		 * "./"��дĬ��Ҳ���ڵ�ǰĿ¼��
		 */
		File file=new File("test.txt");
		/*
		 * boolean exists()
		 * �жϵ�ǰfile��ʾ���ļ���Ŀ¼�Ƿ����
		 */
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("�ļ������ɹ���");
		}else {
			System.out.println("���ļ��Ѵ���");
		}
	}
}
