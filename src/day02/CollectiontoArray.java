package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectiontoArray {
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("Tom");
		c.add("Jerry");
		c.add("Lucy");
		/*
		 * 将集合中的元素复制到数组中
		 */
		String[] ary=new String[6];
		//将数组每个元素填充为A
		Arrays.fill(ary, "A");
		//将数组中全部元素连接为字符串
		System.out.println(Arrays.toString(ary));
		/*
		 * 调用toArray复制集合到数组
		 * 如果ary的长度等于或大于原集合元素数量
		 * 则返回值为ary本身
		 * 否则必须接收返回值，返回值是新数组的引用
		 */
		String[] ary1=c.toArray(ary);
		System.out.println(Arrays.toString(ary));
		System.out.println(Arrays.toString(ary1));
		
		
		/*
		 * 将数组作为线性表使用：
		 * 1.与数组共享存储空间
		 * 2.不是完整功能的List,不能改变长度(add,remove,insert)
		 * 若要完整功能的List则用addAll
		 */
		String[] ary2= {"Tom","Jerry","Lucy"};
		List<String> list1=Arrays.asList(ary2);
		List<String> list2=new ArrayList<String>();
		//完整功能的List则用addAll
		list2.addAll(list1);
		System.out.println(list2);
		//list2可以进行添加，删除，插入等
		list2.add("Ciri");
		System.out.println(list2);
		System.out.println(list1);
		//修改数组内容，影响List
		ary2[1]="Ciri";
		//修改List,影响数组
		list1.set(2, "Jim");
		//输出修改结果
		System.out.println(list1);
		System.out.println(Arrays.toString(ary2));
		//集合长度不能变！
		//list1.add("！");
		
	}
}
