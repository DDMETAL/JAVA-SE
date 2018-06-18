package day04;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 文件复制
 * @author NiCo
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile src
		=new RandomAccessFile("HashMap.png","r");
		RandomAccessFile desc
		=new RandomAccessFile("HashMap_cp.png","rw");
		
		//该变量用来保存从源文件读到的每个字节
		int d=-1;
		
		long start=System.currentTimeMillis();
		while((d=src.read())!=-1) {
			desc.write(d);
		}
		long end=System.currentTimeMillis();
		System.out.println("复制完成，耗时："+(end-start)+"毫秒");
		src.close();
		desc.close();
	}
	
	
	
}
