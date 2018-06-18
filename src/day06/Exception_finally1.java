package day06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 完整异常捕获机制处理IO
 * @author NiCo
 *
 */
public class Exception_finally1 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			FileInputStream fis
			=new FileInputStream("."+File.separator+"src"
					+File.separator+"day05"
					+File.separator+"BufferedReader_readLine.java");
		InputStreamReader isr
			=new InputStreamReader(fis);
		 br
			=new BufferedReader(isr);

		String line=null;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		}catch(Exception e){
			System.out.println("IO异常");
		}finally {
			try {
				if(br!=null) {
				br.close();
				}
				System.out.println("流关闭了");
			}catch(IOException e) {
				System.out.println("");
			}
		
		}
	}
}
