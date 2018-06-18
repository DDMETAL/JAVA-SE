package day06;
/**
 * finally块
 * 必须定义在异常处理机制的最后
 * 可以保证无论try块中的代码是否出现异常
 * finally块中的代码都会执行
 * 通常会将诸如释放资源等操作放在finally中确保执行
 * 
 * @author NiCo
 *
 */
public class Exception_finally {
	public static void main(String[] args) {
		System.out.println("程序开始");
		try {
			String str="";
			System.out.println(str.length());
			return;
		}catch(Exception e) {
			System.out.println("出错");
		}finally {
			System.out.println("finally运行");
		}
		System.out.println("程序结束");
	}
}
