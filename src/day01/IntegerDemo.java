package day01;
/**
 * ��װ�ࣺ���ڽ��������Ͱ�װΪ����
 * Number������6����ֵ�����໥ת���ķ���
 * ��װ���ṩ��String(10����)���������͵�ת������
 * int Integer.parsrInt(10�����ַ���)
 * double Integer.parsrDouble(10�����ַ���)
 * @author NiCo
 *
 */
public class IntegerDemo {
	public static void main(String[] args) {
		Number n=new Integer(5);
		System.out.println(n.doubleValue());
		int i=Integer.parseInt("-123");
		double pi=Double.parseDouble("3.1415926535897932384626");
		System.out.println(i+"\n"+pi);
	
		
	}
}
