package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectiontoArray {
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("Tom");
		c.add("Jerry");
		c.add("Lucy");
		/*
		 * �������е�Ԫ�ظ��Ƶ�������
		 */
		String[] ary=new String[6];
		//������ÿ��Ԫ�����ΪA
		Arrays.fill(ary, "A");
		//��������ȫ��Ԫ������Ϊ�ַ���
		System.out.println(Arrays.toString(ary));
		/*
		 * ����toArray���Ƽ��ϵ�����
		 * ���ary�ĳ��ȵ��ڻ����ԭ����Ԫ������
		 * �򷵻�ֵΪary����
		 * ���������շ���ֵ������ֵ�������������
		 */
		String[] ary1=c.toArray(ary);
		System.out.println(Arrays.toString(ary));
		System.out.println(Arrays.toString(ary1));
		
		
		/*
		 * ��������Ϊ���Ա�ʹ�ã�
		 * 1.�����鹲��洢�ռ�
		 * 2.�����������ܵ�List,���ܸı䳤��(add,remove,insert)
		 * ��Ҫ�������ܵ�List����addAll
		 */
		String[] ary2= {"Tom","Jerry","Lucy"};
		List<String> list1=Arrays.asList(ary2);
		List<String> list2=new ArrayList<String>();
		//�������ܵ�List����addAll
		list2.addAll(list1);
		System.out.println(list2);
		//list2���Խ�����ӣ�ɾ���������
		list2.add("Ciri");
		System.out.println(list2);
		System.out.println(list1);
		//�޸��������ݣ�Ӱ��List
		ary2[1]="Ciri";
		//�޸�List,Ӱ������
		list1.set(2, "Jim");
		//����޸Ľ��
		System.out.println(list1);
		System.out.println(Arrays.toString(ary2));
		//���ϳ��Ȳ��ܱ䣡
		//list1.add("��");
		
	}
}
