package day03;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 遍历Map
 * 有三种方式：
 * 1.遍历所有的Key
 * 2.遍历所有的键值对
 * 3.遍历所有的value（相对前两种不太常用）
 * @author NiCo
 *
 */
public class Map_iterate {
	public static void main(String[] args) {
		Map<String,Integer> map
		//考虑遍历出的顺序与put时顺序一致时
		//用LinkedHashMap
			=new LinkedHashMap<String,Integer>();
		map.put("语文", 99);
		map.put("数学", 98);
		map.put("英语", 97);
		map.put("物理", 96);
		map.put("化学", 99);
		
		/*
		 * 遍历所有的key
		 * Set KeySet()
		 * 该方法会将当前Map中所有的Key存入一个
		 * Set集合后返回
		 */
		Set<String> keySet=map.keySet();
		for(String key:keySet) {
			System.out.println("key:"+key);
		}
		
		/*
		 * 遍历每一组键值对
		 * Set entrySet()
		 * Entry是Map的内部类，其每一个实例用于
		 * 表示Map中一组键值对
		 * 常用方法：getKey,getValue,这两个方法
		 * 分别用于获取该组键值对中key，value
		 * 
		 * entrySet方法会将当前map中每一组键值对
		 * 以一个Entry实例的形式存入Set集合后将
		 * 该Set集合返回
		 */
		Set<Entry<String,Integer>> entrySet=map.entrySet();
		for(Entry<String,Integer> e:entrySet) {
			//System.out.println(e);
			String key=e.getKey();
			Integer value=e.getValue();
			System.out.println(key+","+value);
		}
		/*
		 * 遍历所有的value
		 * Collection values()
		 * 将当前Map中所有的value存入一个集合后返回
		 */
		Collection<Integer> values=map.values();
		for(Integer v:values) {
			System.out.println("values:"+v);
		}
	}
}
