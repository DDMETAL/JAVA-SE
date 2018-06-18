package day03;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * ����Map
 * �����ַ�ʽ��
 * 1.�������е�Key
 * 2.�������еļ�ֵ��
 * 3.�������е�value�����ǰ���ֲ�̫���ã�
 * @author NiCo
 *
 */
public class Map_iterate {
	public static void main(String[] args) {
		Map<String,Integer> map
		//���Ǳ�������˳����putʱ˳��һ��ʱ
		//��LinkedHashMap
			=new LinkedHashMap<String,Integer>();
		map.put("����", 99);
		map.put("��ѧ", 98);
		map.put("Ӣ��", 97);
		map.put("����", 96);
		map.put("��ѧ", 99);
		
		/*
		 * �������е�key
		 * Set KeySet()
		 * �÷����Ὣ��ǰMap�����е�Key����һ��
		 * Set���Ϻ󷵻�
		 */
		Set<String> keySet=map.keySet();
		for(String key:keySet) {
			System.out.println("key:"+key);
		}
		
		/*
		 * ����ÿһ���ֵ��
		 * Set entrySet()
		 * Entry��Map���ڲ��࣬��ÿһ��ʵ������
		 * ��ʾMap��һ���ֵ��
		 * ���÷�����getKey,getValue,����������
		 * �ֱ����ڻ�ȡ�����ֵ����key��value
		 * 
		 * entrySet�����Ὣ��ǰmap��ÿһ���ֵ��
		 * ��һ��Entryʵ������ʽ����Set���Ϻ�
		 * ��Set���Ϸ���
		 */
		Set<Entry<String,Integer>> entrySet=map.entrySet();
		for(Entry<String,Integer> e:entrySet) {
			//System.out.println(e);
			String key=e.getKey();
			Integer value=e.getValue();
			System.out.println(key+","+value);
		}
		/*
		 * �������е�value
		 * Collection values()
		 * ����ǰMap�����е�value����һ�����Ϻ󷵻�
		 */
		Collection<Integer> values=map.values();
		for(Integer v:values) {
			System.out.println("values:"+v);
		}
	}
}
