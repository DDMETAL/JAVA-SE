package day06;
/**
 * �����쳣�׳�
 * ͨ����������ᵼ���쳣�׳���
 * 1.�����﷨Ҫ�󣬵��ǲ�����ҵ���߼�Ҫ��ʱ��
 * 	 ���Ե���һ���쳣�׳���������
 * 2.��ǰ����������쳣�����Ǹ��쳣�Ľ����Ӧ��
 * 	 ��ǰ�����д���ʱ���Խ����׳��������߽��
 * @author NiCo
 *
 */
public class Exception_throw {
	public static void main(String[] args) {
		Person p=new Person();
		try {
				/*
				 * ������һ������throws�쳣�׳�����
				 * �ķ���ʱ��������Ҫ����봦����쳣
				 * ������벻ͨ����
				 * �������ֶ������֣�
				 * 1.��try-catch���񲢴���
				 * 2.�����ڵ�ǰ������ʹ��throws��
				 * ���쳣�������������׳�
				 */
				
					p.setAge(200);
				} catch (IllegalAgeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		

		
		System.out.println("���䣺"+p.getAge());
	}
}
