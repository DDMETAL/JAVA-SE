package day02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * java.util.Collection
 * ���ϣ������洢һ��Ԫ�أ��ṩ����ز���Ԫ�صķ���
 * �������������ӽӿ�
 * List�����ظ�����������
 * Set�������ظ������󲿷�ʵ�����������
 * Ԫ���Ƿ��ظ�������Ԫ������equals�����ȽϵĽ��
 * ���ϴ�ŵ���Ԫ�ص����ã���ַ��
 * @author NiCo
 *
 */
public class CollectionDemo {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		/*
		 * boolean add(E e)
		 * �򼯺������ָ��Ԫ�أ��ɹ���ӷ���true
		 */
		c.add("a");
		c.add("b");
		System.out.println(c);
		/*
		 * int size()
		 * ���ص�ǰ���ϵ�Ԫ�ظ���
		 */
		int size=c.size();
		System.out.println("size:"+size);
		
		
		/*
		 * boolean isEmpty()
		 * �жϼ����Ƿ�Ϊ�ռ�
		 */
		boolean isEmpty=c.isEmpty();
		System.out.println(isEmpty);
		
		/*
		 * ��ռ���
		 */
		c.clear();
		System.out.println(c);
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		System.out.println();
		
		/*
		 * addAll()���Ϻϲ�����c2��ȫ��Ԫ�غϲ���c1��
		 * c2���䣬c1����c2��ȫ��Ԫ��
		 * 
		 * containsAll()��鼯�ϵİ�����ϵ 
		 * 
		 */
		Collection c1=new ArrayList();
		Collection c2=new ArrayList();
		c1.add("Tom");
		c2.add("Jerry");
		boolean  b=c1.containsAll(c2);
		System.out.println(b);//false
		c1.addAll(c2);
		System.out.println(c1.containsAll(c2));//true
		
		c1.add("�ܶ�");
		Iterator ite=c1.iterator();
		/*
		 * hasNext()���ite	���α���¸�λ���Ƿ�������
		 */
		while(ite.hasNext()) {
			/*
			 * ��ite���α��ƶ�һ�β���������
			 * ����ƶ�Խ�罫�׳��쳣
			 * ����ֵ���ü����е�Ԫ��
			 */
			Object obj=ite.next();
			System.out.println(obj);
			if("�ܶ�".equals(obj)) {
				ite.remove();//ɾ�����ڱ�����Ԫ��
				//ʹ�õ�������������ʱ������ͨ�����Ϸ���ɾ��Ԫ��
				//c1.remove("�ܶ�");
			}
		}
		System.out.println(c1);//ȱ���ܶ�
		/*
		 * foreachѭ�����ܱ������������ڼ�ɾ��
		 * �����е�Ԫ��
		 * �����Ҫɾ��Ҫʹ�ô�ͳ������
		 */
//		for(Object obj:c1) {
//			System.out.println(obj);
//		}
	}
}
