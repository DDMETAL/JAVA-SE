package day02;

import java.util.ArrayList;
import java.util.Collection;

/**
 * boolean contains(E e)
 * 判断当前集合是否包含给定元素
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
	 *toString方法的用途：java的API会自动调用
	 *toString方法，利用这个特点可以简化
	 *程序的调试输出，如Println(p)会自动调用toString 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		//返回Point对象的关键数据
		return "("+x+","+y+")";
	}
	/*
	 * 重写equals()方法(修改父类的方法)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		//方法执行期间this是指当前对象引用
		//obj是另外一个对象的引用
		//比较关键数据：比较this(x,y)和obj(x,y)是否相等
		if(obj==null) {
			return false;
		}
		if(this==obj) {//对象自己跟自己比较
			return true;//性能好
		}
		if(obj instanceof Point) {//强转
			Point other=(Point)obj;
			return this.x==other.x
					&&
					this.y==other.y;
		}
		return false;
	}
}