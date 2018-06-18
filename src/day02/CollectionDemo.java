package day02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * java.util.Collection
 * 集合，用来存储一组元素，提供了相关操作元素的方法
 * 有两个常见的子接口
 * List：可重复集，且有序
 * Set：不可重复集，大部分实现类是无序的
 * 元素是否重复是依靠元素自身equals方法比较的结果
 * 集合存放的是元素的引用（地址）
 * @author NiCo
 *
 */
public class CollectionDemo {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		/*
		 * boolean add(E e)
		 * 向集合中添加指定元素，成功添加返回true
		 */
		c.add("a");
		c.add("b");
		System.out.println(c);
		/*
		 * int size()
		 * 返回当前集合的元素个数
		 */
		int size=c.size();
		System.out.println("size:"+size);
		
		
		/*
		 * boolean isEmpty()
		 * 判断集合是否为空集
		 */
		boolean isEmpty=c.isEmpty();
		System.out.println(isEmpty);
		
		/*
		 * 清空集合
		 */
		c.clear();
		System.out.println(c);
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		System.out.println();
		
		/*
		 * addAll()集合合并，将c2中全部元素合并到c1中
		 * c2不变，c1包含c2的全部元素
		 * 
		 * containsAll()检查集合的包含关系 
		 * 
		 */
		Collection c1=new ArrayList();
		Collection c2=new ArrayList();
		c1.add("Tom");
		c2.add("Jerry");
		boolean  b=c1.containsAll(c2);
		System.out.println(b);//false
		c1.addAll(c2);
		System.out.println(c1.containsAll(c2));//true
		
		c1.add("熊二");
		Iterator ite=c1.iterator();
		/*
		 * hasNext()检查ite	中游标的下个位置是否有引用
		 */
		while(ite.hasNext()) {
			/*
			 * 将ite中游标移动一次并返回引用
			 * 如果移动越界将抛出异常
			 * 返回值引用集合中的元素
			 */
			Object obj=ite.next();
			System.out.println(obj);
			if("熊二".equals(obj)) {
				ite.remove();//删除正在遍历的元素
				//使用迭代器遍历集合时，不能通过集合方法删除元素
				//c1.remove("熊二");
			}
		}
		System.out.println(c1);//缺少熊二
		/*
		 * foreach循环不能遍历（迭代）期间删除
		 * 集合中的元素
		 * 如果需要删除要使用传统迭代器
		 */
//		for(Object obj:c1) {
//			System.out.println(obj);
//		}
	}
}
