package day06;
/**
 * �쳣���÷���
 * @author NiCo
 *
 */
public class Exception_API {
	public static void main(String[] args) {
		System.out.println("����ʼ");
		try {
			String str="a";
		//	System.out.println(str.length());
			System.out.println(Integer.parseInt(str));
		}catch(Exception e){
			//��������ջ��Ϣ
			e.printStackTrace();
			//��ȡ������Ϣ
			System.out.println(e.getMessage());
		}
		System.out.println("�������");
	}
}
