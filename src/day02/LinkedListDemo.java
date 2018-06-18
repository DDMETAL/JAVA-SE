package day02;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		/*
		 * 在集合中存储整数，必须使用包装类
		 * 定义泛型
		 */
		List<Integer> list1=
				new ArrayList<Integer>();
		List<Integer> list2=
				new LinkedList<Integer>();
		for(int i=0;i<100000;i++) {
			list1.add(i);
			list2.add(i);
		}
		/*
		 * 比较集合存储结构对算法性能的影响
		 */
		//数组实现的线性表是连续结构
		long t1=System.nanoTime();
		int  n1=list1.get(0);
		long t2=System.nanoTime();
		int  n2=list1.get(50000);
		long t3=System.nanoTime();
		int  n3=list1.get(99999);
		long t4=System.nanoTime();
		System.out.println("get(0):"+(t2-t1));
		System.out.println("get(50000):"+(t3-t2));
		System.out.println("get(99999):"+(t4-t3));
	
		
		//测试双向循环链表的性能
		//首尾频繁操作用linklist
		 t1=System.nanoTime();
		 n1=list2.get(0);
		 t2=System.nanoTime();
		 n2=list2.get(50000);
		 t3=System.nanoTime();
		 n3=list2.get(99999);
		 t4=System.nanoTime();
		System.out.println("get(0):"+(t2-t1));
		System.out.println("get(50000):"+(t3-t2));
		System.out.println("get(99999):"+(t4-t3));
		
		
		/*
		 * set()方法：将指定位置的元素进行替换
		 * 返回被替换的元素
		 */
		List<String> list3=new ArrayList<String>();
		list3.add("Tom");
		list3.add("Jerry");
		list3.add("Lucy");
		String name=list3.set(2, "Ciri");
		System.out.println(name);//set返回值为换出来的值
		System.out.println(list3);
		
		list3.set(0,list3.set(2, list3.get(0)));
		System.out.println(list3);
		
		
		//遍历：尽量使用Iterator（foreach）
		//ArrayList 可以利用get方法遍历！性能与Iterator相同
		//LinkedList 不要使用get方法进行遍历！性能差
		for(int i=0;i<list3.size();i++) {
			String val=list3.get(i);
			System.out.println(val);
			
			
			
		/*
		 * 插入：void add()
		 * 删除：remove();
		 * 
		 */
			List<String> list4=new ArrayList<String>();
			list4.add("I");
			list4.add("like");
			list4.add("study");
			list4.add("java");
			
			list4.add(1,"am");
			System.out.println(list4);
			String str=list4.remove(1);//返回被删除的值
			System.out.println(list4);
			System.out.println(str);
			
			
		}
	}
}
