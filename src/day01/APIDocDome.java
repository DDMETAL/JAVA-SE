package day01;
/**
 * 文档注释
 * 只写在类，方法，常量上
 * 可以被javadoc命令解析并生成为一个文档手册。
 * @author NiCo
 * @version 1.024
 * @see java.lang.String
 * @since JDK8.0
 */
public class APIDocDome {
	/**
	 * sayHello方法中的问候语
	 */
	public static final String INFO="你好!";
		public static void main(String[] args) {
			String str=APIDocDome.sayHello("D");
			System.out.println(str);
		}
		/**
		 * 为给定用户添加问候语
		 * @param name 指定用户名
		 * @return 带有问候语的字符串
		 */
		public static String sayHello(String name) {
			return INFO+name;
		}
}
