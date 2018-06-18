package day03;

import java.util.Deque;
import java.util.LinkedList;

/**
 * java.util.Deque
 * 双端队列
 * 两端都可以进出队的队列
 * 双端队列接口继承自队列接口(Queue)
 * @author NiCo
 *
 */
public class DequeDemo {
	public static void main(String[] args) {
		Deque<String> deque
			=new LinkedList<String>();
		deque.offer("a");
		deque.offer("b");
		System.out.println(deque);
		deque.offerFirst("c");
		System.out.println(deque);
		deque.offerLast("d");
		deque.offerLast("e");
		System.out.println(deque);
		//遍历
		for(String e:deque) {
			System.out.println(e);
			}
		deque.poll();
		System.out.println(deque);
		deque.pollFirst();
		System.out.println(deque);
		deque.pollLast();
		System.out.println(deque);
		
	}
}
