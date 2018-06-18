package day03;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue
 * ���У����Դ洢һ��Ԫ�أ����Ǵ�ȡԪ�ر���
 * ��ѭ�Ƚ��ȳ�ԭ��FIFO, First Input First Output��
 * @author NiCo
 *
 */
public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue
			=new LinkedList<String>();
		/*
		 * ��Ӳ���
		 */
		queue.offer("abc");
		queue.offer("def");
		queue.offer("ghi");
		System.out.println(queue);
		/*
		 * E poll()
		 * �����в������Ӷ��׻�ȡԪ�أ���ȡ���Ԫ��
		 * �ʹӶ������Ƴ�
		 */
		String str=queue.poll();
		System.out.println(str);
		System.out.println(queue);
		/*
		 * E peek()
		 * ���ö���Ԫ�أ���ȡ����Ԫ�غ��Ԫ�ػ��ڶ�����
		 */
		str=queue.peek();
		System.out.println(str);
		System.out.println(queue);
		System.out.println("������������");
		for(String e:queue) {
			System.out.println(e);
		}
		System.out.println(queue);
		
		System.out.println("���б�����");
		//��ʹ��for����Ϊsize�ı仯
		while(queue.size()>0) {
		//��ʹ��peek����Ϊpeek���ö���Ԫ�أ�����Ԫ�ز���
			str=queue.poll();
			System.out.println(str);
		}
		System.out.println(queue);
	}
}
