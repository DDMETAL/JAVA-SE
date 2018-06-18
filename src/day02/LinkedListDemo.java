package day02;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		/*
		 * �ڼ����д洢����������ʹ�ð�װ��
		 * ���巺��
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
		 * �Ƚϼ��ϴ洢�ṹ���㷨���ܵ�Ӱ��
		 */
		//����ʵ�ֵ����Ա��������ṹ
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
	
		
		//����˫��ѭ�����������
		//��βƵ��������linklist
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
		 * set()��������ָ��λ�õ�Ԫ�ؽ����滻
		 * ���ر��滻��Ԫ��
		 */
		List<String> list3=new ArrayList<String>();
		list3.add("Tom");
		list3.add("Jerry");
		list3.add("Lucy");
		String name=list3.set(2, "Ciri");
		System.out.println(name);//set����ֵΪ��������ֵ
		System.out.println(list3);
		
		list3.set(0,list3.set(2, list3.get(0)));
		System.out.println(list3);
		
		
		//����������ʹ��Iterator��foreach��
		//ArrayList ��������get����������������Iterator��ͬ
		//LinkedList ��Ҫʹ��get�������б��������ܲ�
		for(int i=0;i<list3.size();i++) {
			String val=list3.get(i);
			System.out.println(val);
			
			
			
		/*
		 * ���룺void add()
		 * ɾ����remove();
		 * 
		 */
			List<String> list4=new ArrayList<String>();
			list4.add("I");
			list4.add("like");
			list4.add("study");
			list4.add("java");
			
			list4.add(1,"am");
			System.out.println(list4);
			String str=list4.remove(1);//���ر�ɾ����ֵ
			System.out.println(list4);
			System.out.println(str);
			
			
		}
	}
}
