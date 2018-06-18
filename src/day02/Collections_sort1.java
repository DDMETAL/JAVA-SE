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
			 * sort不能直接对Cat进行排序
			 * 因为没有compareTo方法
			 */
			//Collections.sort(list);
			
			/*
			 * Collections.sort(list,比较器)
			 * 重载的sort方法可以实现任意对象的
			 * 自定义排序
			 * 自定义：按照重量，年龄，体重等排序
			 */
			Collections.sort(list,new ByAge() );
			System.out.println(list);
	}
}
/*
 * 实现自定义比较器 Comparator
 */
class ByAge implements Comparator<Cat>{
	/*
	 * 自定义的比较算法：按照Cat对象的年龄
	 * 比较大小
	 * 如果返回>0则o1>02
	 * 如果返回<0则o1<02
	 * 如果返回=0则o1=02
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