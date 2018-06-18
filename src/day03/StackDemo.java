package day03;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ջ�ṹ
 * ջ�����洢һ��Ԫ�أ����Ǵ�ȡԪ�ر�����ѭ�Ƚ����ԭ��
 * ��FILO,First Input Last Output)
 * ջ�ṹ��������ʵ�֡����ˡ�����
 * Deque��˫�˶��У�������ֻ��һ�˽����Ӿ�ʵ����ջ�ṹ
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
