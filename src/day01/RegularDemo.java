package day01;
/**
 * �ַ������������
 * ������Ҳ���ַ���
 * ����ƥ���ַ������ַ�����ġ������ַ�����
 * �ܶ������Զ�֧��������ʽ
 * ����API��
 * 		String.matches()�����鷽��
 * 		String.split()�з��ַ���
 * 		String.replaceAll()ȫ���滻
 * ��;���û������ݼ���
 * 		�ַ���������
 * @author NiCo
 *
 */
public class RegularDemo {

	public static void main(String[] args) {
		/*
		 * java String API ����matchs()
		 * ���ڲ����ַ��������Ƿ�����������
		 * �൱�ڰ���^ $�߽���
		 * ���"a"�Ƿ����[abc]����
		 */
		String reg="[abc]";
		boolean b="a".matches(reg);
		System.out.println(b);//true
		reg="s\\d";//s[0-9]
		System.out.println("s1".matches(reg));//true
		reg="s...";
		System.out.println("sdfg".matches(reg));//true
		reg="\\d{3}";
		System.out.println("1234".matches(reg));//false
		reg="\\w{8,16}";
		System.out.println("abc123456789".matches(reg));//true
		reg="[A-Z]*";
		System.out.println("A".matches(reg));//true
		System.out.println("a".matches(reg));//false
		System.out.println("ASD".matches(reg));//true	
		reg="int\\[\\s*\\]";
		System.out.println("int[  ]".matches(reg));
	
		
		/*
		 * ��������ƥ��һ���ַ����У�������|����
		 * ���ڶ�������ַ����ж�ѡһ
		 * ������1|����2|����3��������һ��
		 */
		reg="\\w+\\.(png|jpg|gif|jpeg)";
		System.out.println("demo.png".matches(reg));
	
		
		/*
		 * String[] data=str.split(������ʽ)
		 * ���ַ�������ƥ�䵽��λ���п�
		 * �����г�ƥ�䵽���ַ������п��Ľ�����浽����
		 */
		String str="Tom,119,tom@qq.com,����";
		String[] data=str.split(",");
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[2]);
		System.out.println(data[3]);

		
		/*
		 * ���IP��ַ��192.168.1.100
		 */
		String str1="192.168.1.100";
		String[] ip=str1.split("\\.");
		System.out.println(ip[0]);
		System.out.println(ip[1]);
		System.out.println(ip[2]);
		System.out.println(ip[3]);
	
		
		/*
		 * ƥ���ֻ�������
		 * �ֻ���ͷ��(0086|\+86)?\s?��((00|\+)86)?\s?
		 * 1\d{10}
		 *(0086|\+86)?\s?1\d{10}\b  \b����ĩβ
		 */
		reg="(0086|\\+86)?\\s?1\\d{10}";
		System.out.println("+86 18392618766".matches(reg));
		
		
		/*
		 * String �ṩ���滻������
		 * ��������ʽ�ܹ�ƥ���ϵ��ַ����滻Ϊ���ַ���
		 * ���ַ���=Դ�ַ�����replace All(�����滻)
		 * 
		 */
		 reg="(�Բ�|fuck)";
		String str2="�Բ�fuck��";
		System.out.println(str2.replaceAll(reg, "**"));
		
		
		
		
	}

}
