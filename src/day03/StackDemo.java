package day03;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈结构
 * 栈用来存储一组元素，但是存取元素必须遵循先进后出原则
 * （FILO,First Input Last Output)
 * 栈结构常被用来实现“后退”功能
 * Deque是双端队列，但是若只从一端进出队就实现了栈结构
 * @author NiCo
 *
 */
public class StackDemo {
	public static void main(String[] args) {
		Deque<String> stack
		=new LinkedList<String>();
	
	stack.push("a");
	stack.push("b");
	stack.push("c");
	System.out.println(stack);
	String str=stack.pop();
	System.out.println(str);
	System.out.println(stack);
	
	for(String s:stack) {
		System.out.println(s);
	}
	System.out.println(stack);
	}
	
	
}
