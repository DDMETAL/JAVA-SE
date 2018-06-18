package day02;

import java.util.ArrayList;
import java.util.List;

public class List_subList {
	public static void main(String[] args) {
		/*
		 * 子列表：子列表与主列表共享同一个存储空间
		 */
		List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		/*
		 * 获取子列表
		 */
		List<String> sub=list.subList(1, 1+5);
		System.out.println(sub);
		sub.add(1, "C");
		System.out.println(sub);
		System.out.println(list);
		sub.remove(2);
		System.out.println(sub);
		System.out.println(list);
	}
}
