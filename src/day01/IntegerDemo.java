package day01;
/**
 * 包装类：用于将基本类型包装为对象
 * Number定义了6中数值类型相互转换的方法
 * 包装类提供了String(10进制)到基本类型的转换方法
 * int Integer.parsrInt(10进制字符串)
 * double Integer.parsrDouble(10进制字符串)
 * @author NiCo
 *
 */
public class IntegerDemo {
	public static void main(String[] args) {
		Number n=new Integer(5);
		System.out.println(n.doubleValue());
		int i=Integer.parseInt("-123");
		double pi=Double.parseDouble("3.1415926535897932384626");
		System.out.println(i+"\n"+pi);
	
		
	}
}
