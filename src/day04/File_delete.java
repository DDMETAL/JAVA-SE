package day04;

import java.io.File;

/**
 * 删除文件
 * @author NiCo
 *
 */
public class File_delete {
	public static void main(String[] args) {
		/*
		 * 删除当前目录中的test.txt文件
		 * 使用delete方法删除目录时要求该目录必须是
		 * 空目录，否则无法删除
		 */
		File file=new File("test.txt");
		if(file.exists()) {
			file.delete();
			System.out.println("删除成功！");
		}else {
			System.out.println("该文件不存在！");
		}
	}
}
