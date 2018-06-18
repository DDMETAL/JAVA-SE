package day03;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue
 * 队列，可以存储一组元素，但是存取元素必须
 * 遵循先进先出原则（FIFO, First Input First Output）
 * @author NiCo
 *
 */
public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue
			=new LinkedList<String>();
		/*
		 * 入队操作
		 */
		queue.offer("abc");
		queue.offer("def");
		queue.offer("ghi");
		System.out.println(queue);
		/*
		 * E poll()
		 * 出队列操作，从队首获取元素，获取后该元素
		 * 就从队列中移除
		 */
		String str=queue.poll();
		System.out.println(str);
		System.out.println(queue);
		/*
		 * E peek()
		 * 引用队首元素，获取队首元素后该元素还在队列中
		 */
		str=queue.peek();
		System.out.println(str);
		System.out.println(queue);
		System.out.println("迭代器遍历：");
		for(String e:queue) {
			System.out.println(e);
		}
		System.out.println(queue);
		
		System.out.println("自行遍历：");
		//不使用for是因为size的变化
		while(queue.size()>0) {
		//不使用peek是因为peek引用队首元素，队首元素不变
			str=queue.poll();
			System.out.println(str);
		}
		System.out.println(queue);
	}
}
