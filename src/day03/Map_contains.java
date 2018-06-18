package day03;

import java.util.HashMap;
import java.util.Map;

/**
 * boolean containsKey(K k)
 * boolean containsValue(V v)
 * 判断当前map是否包含给定大的Key或value
 * 判断标准是参考元素equals比较的结果
 * @author NiCo
 *
 */
public class Map_contains {
	public static void main(String[] args) {
		Map<String,Integer> map
			=new HashMap<String,Integer>();
		map.put("语文", 99);
		map.put("数学", 98);
		map.put("英语", 97);
		map.put("物理", 96);
		map.put("化学", 99);
		
		boolean containsKey=map.containsKey("语文");
		System.out.println("包含Key:"+containsKey);
		
		boolean containsValue=map.containsValue(99);
		System.out.println("包含Value:"+containsValue);
		
	}
}
