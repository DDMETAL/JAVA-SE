package day04;

import java.io.File;
import java.io.IOException;

/**
 * 创建文件
 * @author NiCo
 *
 */
public class File_createNewFile {
	public static void main(String[] args) throws IOException {
		/*
		 * 当前目录下创建一个test.txt文件
		 * "./"不写默认也是在当前目录下
		 */
		File file=new File("test.txt");
		/*
		 * boolean exists()
		 * 判断当前file表示的文件或目录是否存在
		 */
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("文件创建成功！");
		}else {
			System.out.println("该文件已存在");
		}
	}
}
