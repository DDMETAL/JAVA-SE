package day01;
/**
 * �ĵ�ע��
 * ֻд���࣬������������
 * ���Ա�javadoc�������������Ϊһ���ĵ��ֲᡣ
 * @author NiCo
 * @version 1.024
 * @see java.lang.String
 * @since JDK8.0
 */
public class APIDocDome {
	/**
	 * sayHello�����е��ʺ���
	 */
	public static final String INFO="���!";
		public static void main(String[] args) {
			String str=APIDocDome.sayHello("D");
			System.out.println(str);
		}
		/**
		 * Ϊ�����û�����ʺ���
		 * @param name ָ���û���
		 * @return �����ʺ�����ַ���
		 */
		public static String sayHello(String name) {
			return INFO+name;
		}
}
