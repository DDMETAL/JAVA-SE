package day02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_sort {
	public static void main(String[] args) {
		/*
		 * 对List集合进行排序
		 */
		List<String> list=new ArrayList<String>();
		list.add("1");
		list.add("3");
		list.add("2");
		list.add("a");
		list.add("Tom");
		list.add("Jerry");
		/*
		 * Collections.sort(list)对list集合中
		 * 元素进行排序
		 */
		Collections.sort(list);
		System.out.println(list);
		
		//sort方法如何比较两个字符串大小
		//sort方法根据compareTo方法进行排序！
		/*
		 * String类型提供比较字符串大小的方法
		 * compare比较to 与xxx比较
		 * compareTo返回3种状态：>0 <0  ==0
		 * >0表示第一个字符串大
		 * <0表示第一个字符串小
		 * =0表示两个字符串一样！
		 */
		int n="Tom".compareTo("Jerry");
		int n1="Jerry".compareTo("Tom");
		int n2="Tom".compareTo("Tom");
		System.out.println(n);
		System.out.println(n1);
		System.out.println(n2);
	}
}
