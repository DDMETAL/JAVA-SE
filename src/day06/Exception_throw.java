package day06;
/**
 * 测试异常抛出
 * 通常两种情况会导致异常抛出：
 * 1.满足语法要求，但是不满足业务逻辑要求时，
 * 	 可以当做一个异常抛出给调用者
 * 2.当前代码出现了异常，但是该异常的解决不应在
 * 	 当前代码中处理时可以将其抛出给调用者解决
 * @author NiCo
 *
 */
public class Exception_throw {
	public static void main(String[] args) {
		Person p=new Person();
		try {
				/*
				 * 当调用一个含有throws异常抛出声明
				 * 的方法时，编译器要求必须处理该异常
				 * 否则编译不通过。
				 * 而处理手段有两种：
				 * 1.用try-catch捕获并处理
				 * 2.继续在当前方法上使用throws将
				 * 该异常生命继续向外抛出
				 */
				
					p.setAge(200);
				} catch (IllegalAgeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		

		
		System.out.println("年龄："+p.getAge());
	}
}
