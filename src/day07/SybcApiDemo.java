package day07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * �̰߳�ȫ��API
 * StringBuilder�����̰߳�ȫ�ģ���StringBuffer
 * ���̰߳�ȫ�ģ������ڶ��߳��²���ͬһ���ַ�������
 * ʱӦ��ʹ��StringBuffer,��Ϊ�����еĲ����ַ���
 * ��ط�������ͬ������(ʹ��Synchronized����)
 * 
 * List���ϳ��õ�ʵ���ࣺArrayList��LinkedList
 * �Լ�Set���ϵ�ʵ���ࣺHashSet
 * Map���ϵ�ʵ���ࣺHashMap
 * �������ݽṹ�������̰߳�ȫ�ģ����ǿ���ͨ��
 * ���ϵĹ�����Collections����ط���ת��Ϊһ��
 * �̰߳�ȫ��
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
		//������ת��Ϊ�̰߳�ȫ��
		list=Collections.synchronizedList(list);
		System.out.println(list);
		//
		Set<String> set=new HashSet<String>(list);
		System.out.println(set);
		set=Collections.synchronizedSet(set);
		
		//
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("����",98);
		map.put("��ѧ",99);
		map.put("Ӣ��",87);
		
		map=Collections.synchronizedMap(map);
		System.out.println(map);
		
		/*
		 * �̰߳�ȫ�ļ��ϵ���ɾԪ�صȲ�����ͬ����
		 * ��������֮��Ҳ�ǻ���ġ����߳������
		 * ������û�������
		 * �������ǲ�������������ü��ϵĲ�������
		 * �������������Ĳ�������Ҫ����ά�������ϵ
		 * ��Ϊ�������������ϵĹ����в�����ʹ�ü���
		 * ��ط�����ɾԪ�أ�������׳��쳣
		 */
	}
}
