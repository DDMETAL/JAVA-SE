package day06;
/**
 * java�쳣��������е�try-catch
 * try�������������ܳ���Ĵ���Ƭ��
 * catch��������try���г��ֵĴ��󲢽��
 * @author NiCo
 *
 */
public class Exception_try_catch {
	public static void main(String[] args) {
		System.out.println("����ʼ");
		try {
		String str="a";
		/*
		 * ����ʱ���������ʵ������������ʵ��
		 * �����������е���������Ĺ������õ�
		 * ��ʵ���У����������Ĵ�����Ϣ�������
		 * �Ὣ���쳣�׳���
		 */
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(Integer.parseInt(str));
		//try�г����������Ĵ��벻�ᱻ����
		System.out.println("!");
		}catch(NullPointerException e) {
			System.out.println("���ֿ�ָ��");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("�±�Խ��");
			/*
			 * Ӧ�������һ��catch��
			 * ����Exception��������Ϊδ֪�쳣���³����ж�
			 * ����catch���쳣֮���м̳й�ϵʱ��
			 * �����쳣���ϣ������쳣����
			 */
		}catch(Exception e) {
			System.out.println("����");
		}
		
		System.out.println("�������");
	}
}
