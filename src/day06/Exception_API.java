package day06;
/**
 * 异常常用方法
 * @author NiCo
 *
 */
public class Exception_API {
	public static void main(String[] args) {
		System.out.println("程序开始");
		try {
			String str="a";
		//	System.out.println(str.length());
			System.out.println(Integer.parseInt(str));
		}catch(Exception e){
			//输出错误堆栈信息
			e.printStackTrace();
			//获取错误消息
			System.out.println(e.getMessage());
		}
		System.out.println("程序结束");
	}
}
