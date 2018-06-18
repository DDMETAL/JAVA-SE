package day02;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
	public static void main(String[] args) {
		/*
		 * <String> 泛型<约束结构>
		 * <String>约束了c集合只能存储String
		 * 类型数据，如果放入其他数据，将出现编译错误
		 */
		Collection<String> c=
				new ArrayList<String>();
		c.add("Tom");
		for(String s:c) {
			System.out.println(s);
		}
		//c.add(5);//编译错误
		//有了泛型，java自动转换类型
		
		
		Collection c1=
				new ArrayList();
		c1.add("Tom");
		c1.add(5);
	}
}
