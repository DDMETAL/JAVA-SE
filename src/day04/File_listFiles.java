package day04;

import java.io.File;
import java.io.FileFilter;

/*
 * ��ȡһ��Ŀ¼�е���������
 */
public class File_listFiles {
	public static void main(String[] args) {
		/*
		 * �鿴��ǰĿ¼�е���������
		 */
		File dir=new File(".");
		/*
		 * boolean isFile()
		 * �жϵ�ǰFile��ʾ�Ƿ�Ϊһ���ļ�
		 * 
		 * boolean isDirectory()
		 * �жϵ�ǰFile��ʾ���Ƿ�Ϊһ��Ŀ¼
		 */
		if(dir.isDirectory()) {
			//��ȡһ��Ŀ¼�е���������
			File[] dirs=dir.listFiles();
			System.out.println(dirs.length);
			for(File sub:dirs) {
				if(sub.isFile()) {
					System.out.print("�ļ���");
				}
				if(sub.isDirectory()) {
					System.out.print("Ŀ¼��");
				}
				System.out.println(sub.getName());
			}
		}
		
		/*
		 * ʹ���ļ�����������ȡһ��Ŀ¼������������
		 * ��������
		 * 
		 * File[] listFiles(FileFilter filter)
		 * File��������ص�listFiles����Ҫ����һ��
		 * �ļ���������Ȼ��÷����Ὣ��ǰĿ¼�������
		 * ������Ҫ�������ȫ�����أ�������Ļᱻ���ԡ�
		 */
		//�����ļ�������
		FileFilter filter=new FileFilter() {
			//accept���������������������
			public boolean accept(File file) {
				String name=file.getName();
				System.out.println("���ڹ��ˣ�"+name);
				return name.startsWith(".");
				
			}
		};
		File[] subs=dir.listFiles(filter);
		for(File sub:subs) {
			System.out.println(sub.getName());
		}
	}
}
