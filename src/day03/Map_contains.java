package day03;

import java.util.HashMap;
import java.util.Map;

/**
 * boolean containsKey(K k)
 * boolean containsValue(V v)
 * �жϵ�ǰmap�Ƿ�����������Key��value
 * �жϱ�׼�ǲο�Ԫ��equals�ȽϵĽ��
 * @author NiCo
 *
 */
public class Map_contains {
	public static void main(String[] args) {
		Map<String,Integer> map
			=new HashMap<String,Integer>();
		map.put("����", 99);
		map.put("��ѧ", 98);
		map.put("Ӣ��", 97);
		map.put("����", 96);
		map.put("��ѧ", 99);
		
		boolean containsKey=map.containsKey("����");
		System.out.println("����Key:"+containsKey);
		
		boolean containsValue=map.containsValue(99);
		System.out.println("����Value:"+containsValue);
		
	}
}
