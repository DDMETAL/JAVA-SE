package day07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 线程安全的API
 * StringBuilder不是线程安全的，而StringBuffer
 * 是线程安全的，所以在多线程下操作同一个字符串内容
 * 时应当使用StringBuffer,因为该类中的操作字符串
 * 相关方法都是同步方法(使用Synchronized修饰)
 * 
 * List集合常用的实现类：ArrayList，LinkedList
 * 以及Set集合的实现类：HashSet
 * Map集合的实现类：HashMap
 * 上述数据结构都不是线程安全的，但是可以通过
 * 集合的工具类Collections的相关方法转换为一个
 * 线程安全的
 * @author NiCo
 *
 */
public class SybcApiDemo {
	public static void main(String[] args) {
		List<String> list
			=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		//将集合转换为线程安全的
		list=Collections.synchronizedList(list);
		System.out.println(list);
		//
		Set<String> set=new HashSet<String>(list);
		System.out.println(set);
		set=Collections.synchronizedSet(set);
		
		//
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("语文",98);
		map.put("数学",99);
		map.put("英语",87);
		
		map=Collections.synchronizedMap(map);
		System.out.println(map);
		
		/*
		 * 线程安全的集合的增删元素等操作是同步的
		 * 而且他们之间也是互斥的。多线程情况下
		 * 操作是没有问题的
		 * 但是它们不与迭代器遍历该集合的操作互斥
		 * 所以若有这样的操作，需要自行维护互斥关系
		 * 因为迭代器遍历集合的过程中不允许使用集合
		 * 相关方法增删元素，否则会抛出异常
		 */
	}
}
