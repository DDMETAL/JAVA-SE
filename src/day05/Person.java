package day05;

import java.io.Serializable;
import java.util.List;

/**
 * 该类用于测试对象流的对象读写操作
 * 若一个类的实例需要被对象输出流序列号，那么该类
 * 必须实现可序列化接口：java.io.Serializable
 * @author NiCo
 *
 */
public class Person implements Serializable{
	/**
	 * 当一个类实现了可序列化接口，就要定义一个常量：
	 * 版本号
	 * 版本号决定着对象反序列化是否成功
	 * 1.反序列化的对象的版本号若与当前类版本号一致
	 * 反序列化成功，若反序列化对象的结构与当前类
	 * 接口有变化，那么可以还原的属性就还原
	 * 没有的属性jiu1忽略
	 * 2.版本号若不一致，则反序列化直接失败
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	private transient List<String> otherInfo;
	public Person(){
		
	}
	public Person(String name, int age, String gender, List<String> otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(List<String> otherInfo) {
		this.otherInfo = otherInfo;
	}
	public String toString() {
		return name+","+age+","+gender+","+otherInfo;
	}
}
