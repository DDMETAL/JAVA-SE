package day05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流复制文件
 * 缓冲流是一对高级流，作用是提高读写效率
 * java.io.BufferedInputStream
 * java.io.BufferedOutputStream
 * 
 * @author NiCo
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis
			=new FileInputStream("AMD.mp4");
		BufferedInputStream bis
			=new BufferedInputStream(fis);
		FileOutputStream fos
			=new FileOutputStream("AMD_cp2.mp4");
		BufferedOutputStream bos
			=new BufferedOutputStream(fos);
		
	//	byte[] data=new byte[1024*10];
		int len=-1;
		while((len=bis.read())!=-1) {
			bos.write(len);
		}
		System.out.println("复制完成！");
		bis.close();
		bos.close();
	}
}
