package day02;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
	public static void main(String[] args) {
		/*
		 * <String> ����<Լ���ṹ>
		 * <String>Լ����c����ֻ�ܴ洢String
		 * �������ݣ���������������ݣ������ֱ������
		 */
		Collection<String> c=
				new ArrayList<String>();
		c.add("Tom");
		for(String s:c) {
			System.out.println(s);
		}
		//c.add(5);//�������
		//���˷��ͣ�java�Զ�ת������
		
		
		Collection c1=
				new ArrayList();
		c1.add("Tom");
		c1.add(5);
	}
}
