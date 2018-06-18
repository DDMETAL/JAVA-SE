package day02;

import java.util.ArrayList;
import java.util.Collection;

/**
 * boolean contains(E e)
 * �жϵ�ǰ�����Ƿ��������Ԫ��
 */
public class CollectionContains {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		System.out.println(c);
		
		Point p=new Point(1,2);
		boolean contains=c.contains(p);
		System.out.println(contains);
	}
}
class Point{
	int x,y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		
	}
	/*
	 *toString��������;��java��API���Զ�����
	 *toString��������������ص���Լ�
	 *����ĵ����������Println(p)���Զ�����toString 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		//����Point����Ĺؼ�����
		return "("+x+","+y+")";
	}
	/*
	 * ��дequals()����(�޸ĸ���ķ���)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		//����ִ���ڼ�this��ָ��ǰ��������
		//obj������һ�����������
		//�ȽϹؼ����ݣ��Ƚ�this(x,y)��obj(x,y)�Ƿ����
		if(obj==null) {
			return false;
		}
		if(this==obj) {//�����Լ����Լ��Ƚ�
			return true;//���ܺ�
		}
		if(obj instanceof Point) {//ǿת
			Point other=(Point)obj;
			return this.x==other.x
					&&
					this.y==other.y;
		}
		return false;
	}
}