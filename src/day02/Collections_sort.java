package day02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_sort {
	public static void main(String[] args) {
		/*
		 * ��List���Ͻ�������
		 */
		List<String> list=new ArrayList<String>();
		list.add("1");
		list.add("3");
		list.add("2");
		list.add("a");
		list.add("Tom");
		list.add("Jerry");
		/*
		 * Collections.sort(list)��list������
		 * Ԫ�ؽ�������
		 */
		Collections.sort(list);
		System.out.println(list);
		
		//sort������αȽ������ַ�����С
		//sort��������compareTo������������
		/*
		 * String�����ṩ�Ƚ��ַ�����С�ķ���
		 * compare�Ƚ�to ��xxx�Ƚ�
		 * compareTo����3��״̬��>0 <0  ==0
		 * >0��ʾ��һ���ַ�����
		 * <0��ʾ��һ���ַ���С
		 * =0��ʾ�����ַ���һ����
		 */
		int n="Tom".compareTo("Jerry");
		int n1="Jerry".compareTo("Tom");
		int n2="Tom".compareTo("Tom");
		System.out.println(n);
		System.out.println(n1);
		System.out.println(n2);
	}
}
