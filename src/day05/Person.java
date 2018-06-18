package day05;

import java.io.Serializable;
import java.util.List;

/**
 * �������ڲ��Զ������Ķ����д����
 * ��һ�����ʵ����Ҫ��������������кţ���ô����
 * ����ʵ�ֿ����л��ӿڣ�java.io.Serializable
 * @author NiCo
 *
 */
public class Person implements Serializable{
	/**
	 * ��һ����ʵ���˿����л��ӿڣ���Ҫ����һ��������
	 * �汾��
	 * �汾�ž����Ŷ������л��Ƿ�ɹ�
	 * 1.�����л��Ķ���İ汾�����뵱ǰ��汾��һ��
	 * �����л��ɹ����������л�����Ľṹ�뵱ǰ��
	 * �ӿ��б仯����ô���Ի�ԭ�����Ծͻ�ԭ
	 * û�е�����jiu1����
	 * 2.�汾������һ�£������л�ֱ��ʧ��
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
