package day04;

import java.io.File;

/**
 * 1：编写一段代码，要求实现1+2+3+……+100并输出结果
 * 	  在该段代码中不得出现for，while关键字
 * 2：一个人去买汽水，1块钱一瓶汽水，3个瓶盖可以换一瓶
 * 	  汽水，2个空瓶可以换一瓶汽水，编写一段代码计算20快
 * 	  钱总共可以得到多少瓶汽水？
 * 
 * 
 * 
 * 删除目录
 * @author NiCo
 *
 */
public class File_delelteDir {
	public static void main(String[] args) {
		File dir=new File("demo");
		if(dir.exists()) {
			dir.delete();
			System.out.println("目录删除成功");
		}else {
			System.out.println("该目录不存在");
		}
		File dirs=new File("a");
		delete(dirs);
	}
	public static void delete(File file) {
		/*
		 * 若是文件则直接删除
		 * 若是目录，要先将目录中所有内容删除
		 */
		if(file.exists()) {
			if(file.isDirectory()) {
				//清空目录
				File[] subs=file.listFiles();
				for(File sub:subs) {
					/*
					 * 递归调用
					 * 方法内部调用自己方法的行为
					 * 
					 * 使用递归要主语：
					 * 1.递归的层数不要太对，因为
					 * 	递归调用开销较大
					 * 2.递归调用在方法中不能必然
					 * 	执行，必须在一个分支中控制
					 * 	它调用，否则就是死循环。
					 * 
					 * 递归是将一个方法中所有代码重
					 * 	新执行。
					 */
					delete(sub);
				}
			}
			file.delete();
			//System.out.println("删除成功");
		}else {
			System.out.println("文件不存在");
		}
	}
}
