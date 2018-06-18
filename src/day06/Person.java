package day06;
/**
 * 使用该类测试异常的抛出
 * @author NiCo
 *
 */
public class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws IllegalAgeException {
		if(age<0||age>100) {
			/*
			 * 通常方法中throw异常要在方法上
			 * 使用throws声明该类异常的抛出
			 * 只有RuntimeException及其子类型
			 * 异常在抛出时无需在方法上使用throws
			 * 声明
			 */
			throw new IllegalAgeException("年龄不合法");
		}
		this.age = age;
	}
	
}
