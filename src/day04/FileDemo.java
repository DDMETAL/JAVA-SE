package day04;

import java.io.File;
import java.text.SimpleDateFormat;


/**
 * java.io.File
 * File的每一个实例用于表示文件系统中的一个
 * 文件或目录
 * 使用File可以：
 * 1.访问文件或目录的属性信息（名字，大小，修改时间等）
 * 2。操作文件或目录（创建，删除）
 * 3.访问目录子项
 * 
 * 但是不能访问文件数据
 * @author NiCo
 *
 */
public class FileDemo {
	public static void main(String[] args) {
		/*
		 * 在使用路径时尽量使用相对路径，因为
		 * 绝对路径不同的系统不一样，会导致跨平台问题
		 * 相对路径常用：
		 * 1.类加载路径（最常用）
		 * 2.当前目录：在eclipse中当前目录就是指当前类所在的项目目录
		 */
			File file=new File(
					"."+File.separator+"demo.txt");
			String name=file.getName();
			System.out.println(name);
			
			//返回文件的大小（字节量）
			long length=file.length();
			System.out.println(length);
			
			boolean cr=file.canRead();
			System.out.println("是否可读"+cr);
			
			boolean cw=file.canWrite();
			System.out.println("是否可写"+cw);
			
			boolean ih=file.isHidden();
			System.out.println("是否隐藏："+ih);
			
			//最后修改时间
			long time=file.lastModified();
			SimpleDateFormat sdf=
					new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println("修改时间："+sdf.format(time));
	
	}
	
		
}
