package day02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections_sort1 {
	public static void main(String[] args) {
			List<Cat> list=new ArrayList<Cat>();
			list.add(new Cat(15));
			list.add(new Cat(7));
			list.add(new Cat(2));
			list.add(new Cat(8));
			/*
			 * sort����ֱ�Ӷ�Cat��������
			 * ��Ϊû��compareTo����
			 */
			//Collections.sort(list);
			
			/*
			 * Collections.sort(list,�Ƚ���)
			 * ���ص�sort��������ʵ����������
			 * �Զ�������
			 * �Զ��壺�������������䣬���ص�����
			 */
			Collections.sort(list,new ByAge() );
			System.out.println(list);
	}
}
/*
 * ʵ���Զ���Ƚ��� Comparator
 */
class ByAge implements Comparator<Cat>{
	/*
	 * �Զ���ıȽ��㷨������Cat���������
	 * �Ƚϴ�С
	 * �������>0��o1>02
	 * �������<0��o1<02
	 * �������=0��o1=02
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Cat o1, Cat o2) {
		int a1=o1.age;
		int a2=o2.age;
		return -(a1-a2);
	}
}
class Cat{
	int age;
	public Cat(int age) {
		this.age=age;
	}
	public String toString() {
		return "["+age+"]";
	}
}