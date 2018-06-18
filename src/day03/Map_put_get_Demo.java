package day03;

import java.util.HashMap;
import java.util.Map;

/*
 * java.util.Map
 * 查找表，以Key-value对的形式存储元素
 * 常用实现类：java。util.HashMap
 * HashMap:散列表，以散列算法实现的Map
 * 
 * Map要求key不允许重复，
 * 是否重复取决于key元素equals方法比较的结果 
 *
 */
public class Map_put_get_Demo {
	public static void main(String[] args) {
		Map<String,Integer> map
			=new HashMap<String,Integer>();
		/*
		 * V put(key,value)
		 * 将对应的键值对存入到Map中
		 * 由于Map要求Key不能重复，
		 * 所以若使用已有的Key存入新的value则
		 * 是替换该Key原来所对应的value值，并
		 * 将其返回，若指定的Key在Map中不存在，则
		 * 返回值为null
		 */
		map.put("语文", 99);
		map.put("数学", 98);
		map.put("英语", 97);
		map.put("物理", 96);
		/*
		 * 尽量不使用基本类型去接收返回值，
		 * 因为若返回值为null，触发自动拆箱时会
		 * 引起空指针异常
		 */
		Integer num=map.put("化学", 99);
		System.out.println(num);
		
		System.out.println(map);
		
		num=map.put("化学", 98);
		System.out.println(num);
		System.out.println(map);
		
		/*
		 * V get(K k)
		 * 获取指定Key所对应的value
		 * 若制定的Key在map中不存在则返回值为null
		 */
		num=map.get("语文");
		System.out.println("语文："+num);
		num=map.get("体育");
		System.out.println("体育:"+num);
		
		/*
		 * V remove(K k)
		 * 将给定的key对应的键值对从map中删除
		 * 返回值为key对应的value 
		 */
		num=map.remove("语文");
		System.out.println("remove:"+num);
		System.out.println(map);
	}
}	
