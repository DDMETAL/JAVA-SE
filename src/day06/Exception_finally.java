package day06;
/**
 * finally��
 * ���붨�����쳣������Ƶ����
 * ���Ա�֤����try���еĴ����Ƿ�����쳣
 * finally���еĴ��붼��ִ��
 * ͨ���Ὣ�����ͷ���Դ�Ȳ�������finally��ȷ��ִ��
 * 
 * @author NiCo
 *
 */
public class Exception_finally {
	public static void main(String[] args) {
		System.out.println("����ʼ");
		try {
			String str="";
			System.out.println(str.length());
			return;
		}catch(Exception e) {
			System.out.println("����");
		}finally {
			System.out.println("finally����");
		}
		System.out.println("�������");
	}
}
