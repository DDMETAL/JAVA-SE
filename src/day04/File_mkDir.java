package day04;

import java.io.File;

/**
 * 创建目录
 * @author NiCo
 *
 */
public class File_mkDir {
	public static void main(String[] args) {
		/*
		 * 在当前目录下创建名为demo的目录
		 */
		File dir=new File("demo");
		if(!dir.exists()) {
			dir.mkdir();
			System.out.println("目录创建成功");
		}else {
			System.out.println("该目录已存在");
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
			System.out.println("多级目录创建成功");
		}else {
			System.out.println("多级目录已存在");
		}
	}
}
