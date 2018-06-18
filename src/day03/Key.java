package day03;
/**
 * 影响散列表查询性能的一个主要原因
 * 是在HashMap中产生链表
 * 产生链表的主要情况有两种：
 * 1.元素多，概率问题（通过加载因子解决,避免扩容rehash）
 * 2.作为key元素equals方法与hashcode方法的重写不当
 * 当两个key的hashcode值相同时，它们在HashMap内部
 * 数组（散列桶）中的位置就相同，若这两个key的equals
 * 方法比较为false时就会产生链表
 * 
 * 当一个类在重写equals方法时就应当连同重写hashcode
 * 方法，并且遵循以下原则：
 * 	稳定性：在一个对象参与equals比较的属性值没有发生
 * 			改变的前提下，多次调用hashcode值返回的数字
 * 			必须相同。不能是随机数
 * 一致性：当两个对象equals比较为true时，hashcode值
 * 		  要相等。反过来若连个对象hashcode值相等
 * 	  	  equals方法也应当为ture，若不然则可能会
 * 		  在HashMap中出现链表影响查找性能。
 * @author NiCo
 *
 */
public class Key {
	private int x;
	private int y;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
}
