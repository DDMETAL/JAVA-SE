package day04;

import java.io.File;

/**
 * ����Ŀ¼
 * @author NiCo
 *
 */
public class File_mkDir {
	public static void main(String[] args) {
		/*
		 * �ڵ�ǰĿ¼�´�����Ϊdemo��Ŀ¼
		 */
		File dir=new File("demo");
		if(!dir.exists()) {
			dir.mkdir();
			System.out.println("Ŀ¼�����ɹ�");
		}else {
			System.out.println("��Ŀ¼�Ѵ���");
		}
		File dirs=new File(
				"."+File.separator+"a"
				+File.separator+"b"
				+File.separator+"c"
				+File.separator+"d"
				+File.separator+"e"
				+File.separator+"f");
		if(!dirs.exists()) {
			dirs.mkdirs();
			System.out.println("�༶Ŀ¼�����ɹ�");
		}else {
			System.out.println("�༶Ŀ¼�Ѵ���");
		}
	}
}
