package day06;
/**
 * ʹ�ø�������쳣���׳�
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
			 * ͨ��������throw�쳣Ҫ�ڷ�����
			 * ʹ��throws���������쳣���׳�
			 * ֻ��RuntimeException����������
			 * �쳣���׳�ʱ�����ڷ�����ʹ��throws
			 * ����
			 */
			throw new IllegalAgeException("���䲻�Ϸ�");
		}
		this.age = age;
	}
	
}
