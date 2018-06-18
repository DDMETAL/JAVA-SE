package day05;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流写出数据的缓冲区问题
 * @author NiCo
 *
 */
public class BufferedOOutputStream_flush {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			=new FileOutputStream("bos.txt");
		BufferedOutputStream bos
			=new BufferedOutputStream(fos);
		bos.write("java".getBytes());
		/*
		 * flush方法会强制将缓冲区中已经缓存的数据
		 * 一次性写出
		 */
	//	bos.flush();
		
		System.out.println("写出完成");
		bos.close();//colse中也有flush
	}
}
