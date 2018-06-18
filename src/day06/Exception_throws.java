package day06;

import java.awt.AWTException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * 重写父类含有throws异常抛出声明的方法时
 * 对throws的重写准则
 * @author NiCo
 *
 */
public class Exception_throws {
	public void dosome()
			throws IOException,AWTException{
			
	}
class Son extends Exception_throws{
	//允许不再抛出任何异常
//	public void dosome() {
//		
//	}
	
	//仅抛出部分异常
//	public void dosome()
//			throws IOException{
//		
//	}
	
	//允许抛出父类方法抛出异常的子类异常
//	public void dosome()
//			throws FileNotFoundException{
//		
//	}
	
	
	//不允许抛出额外异常
//	public void dosome()
//			throws SQLException{
//		
//	}
	
	//不允许抛出父类方法抛出异常的父类型异常
//	public void dosome()
//			throws Exception{
//		
//	}
}

}
