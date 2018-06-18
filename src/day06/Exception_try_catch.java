package day06;
/**
 * java异常处理机制中的try-catch
 * try块用来包含可能出错的代码片段
 * catch用来捕获try块中出现的错误并解决
 * @author NiCo
 *
 */
public class Exception_try_catch {
	public static void main(String[] args) {
		System.out.println("程序开始");
		try {
		String str="a";
		/*
		 * 出错时，虚拟机会实例化这个错误的实例
		 * 并将程序运行到错误这里的过程设置到
		 * 该实例中，有了完整的错误信息后，虚拟机
		 * 会将该异常抛出。
		 */
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(Integer.parseInt(str));
		//try中出错代码下面的代码不会被运行
		System.out.println("!");
		}catch(NullPointerException e) {
			System.out.println("出现空指针");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("下标越界");
			/*
			 * 应当在最后一个catch中
			 * 捕获Exception，避免因为未知异常导致程序中断
			 * 当多catch的异常之间有继承关系时，
			 * 子类异常在上，父类异常在下
			 */
		}catch(Exception e) {
			System.out.println("出错");
		}
		
		System.out.println("程序结束");
	}
}
