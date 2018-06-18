package day04;

import java.io.File;
import java.io.FileFilter;

/*
 * 获取一个目录中的所有子项
 */
public class File_listFiles {
	public static void main(String[] args) {
		/*
		 * 查看当前目录中的所有子项
		 */
		File dir=new File(".");
		/*
		 * boolean isFile()
		 * 判断当前File表示是否为一个文件
		 * 
		 * boolean isDirectory()
		 * 判断当前File表示的是否为一个目录
		 */
		if(dir.isDirectory()) {
			//获取一个目录中的所有子项
			File[] dirs=dir.listFiles();
			System.out.println(dirs.length);
			for(File sub:dirs) {
				if(sub.isFile()) {
					System.out.print("文件：");
				}
				if(sub.isDirectory()) {
					System.out.print("目录：");
				}
				System.out.println(sub.getName());
			}
		}
		
		/*
		 * 使用文件过滤器来获取一个目录中满足条件的
		 * 所有子项
		 * 
		 * File[] listFiles(FileFilter filter)
		 * File的这个重载的listFiles方法要求传入一个
		 * 文件过滤器，然后该方法会将当前目录中满足该
		 * 过滤器要求的子项全部返回，不满足的会被忽略。
		 */
		//创建文件过滤器
		FileFilter filter=new FileFilter() {
			//accept方法是用来定义过滤条件
			public boolean accept(File file) {
				String name=file.getName();
				System.out.println("正在过滤："+name);
				return name.startsWith(".");
				
			}
		};
		File[] subs=dir.listFiles(filter);
		for(File sub:subs) {
			System.out.println(sub.getName());
		}
	}
}
