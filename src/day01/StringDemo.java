package day01;

public class StringDemo {

	public static void main(String[] args) {
		/*
		 * �ַ����ǲ��ɱ����,���������ݲ��ɸı䣬
		 * �ı����ݻᴴ���¶���
		 * �ַ���ͨ��ʹ����������ʽ������
		 * ��Ϊ��������ʽ�������ַ�������Ỻ���ڳ������б����ã�
		 * ���ٴ�������һ�����ַ���������ڴ�Ĳ���Ҫ����
		 * 
		 */
		System.out.println("�ַ����ǲ��ɱ����");
		String s1="a123";
		String s2="a123";
		String s3="a123";
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);
		
		s1=s1+"!";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);//false
		/*
		 * �������ڱ���Դ����ʱ������һ��������ʽ
		 * ���������ݶ���ֱ��������ô��ֱ�Ӽ���ñ��ʽ
		 * ����������뵽class�ļ���
		 * ����jvm����������Ĵ���ʱ������������Ϊ��
		 * String s4="a
		 * 
		 */
		String s4="a"+123;
		System.out.println(s4);
		System.out.println(s2==s4);//true
		
		String s="a";
		String s5=s+123;
		System.out.println(s5);
		System.out.println(s2==s5);//false
		System.out.println();
		
		/*
		 * int length();
		 * ���ص�ǰ�ַ����ĳ���
		 */
		System.out.println("int length();���ص�ǰ�ַ����ĳ���");
		String str="�Ұ�java";
		int len=str.length();
		System.out.println("len:"+len);
		System.out.println();
		
		/*
		 * int indexOf(String str)
		 * ���ظ����ַ����ڵ�ǰ�ַ����е�λ�ã�
		 * ����ǰ�ַ��������и����ַ����򷵻�-1
		 * ���򷵻��±�
		 */	
		//			 0123456789012345	
		System.out.println("int indexOf(String str);"+"\n"
				+ "���ظ����ַ����ڵ�ǰ�ַ����е�λ��");
		String str1="thinking in java";
		int index=str1.indexOf("in");
		System.out.println(index);//2
		//��ָ��λ�ÿ�ʼ����
		index=str1.indexOf("in",3);
		System.out.println(index);
		//�鿴���һ�γ��ֵ�λ��
		index=str1.lastIndexOf("in");
		System.out.println(index);
		System.out.println();
		
		/*
		 * String substring(int start,int end);
		 * ��ȡ��ǰ�ַ���ָ����Χ�ڵ��ַ���������
		 * ��java api��ͨ��ʹ���������ֱ�ʾ��Χʱ��
		 * ���ǡ���ͷ����β����
		 */
		System.out.println("String substring(int start,int end);"+"\n"
				+ "��ȡ��ǰ�ַ���ָ����Χ�ڵ��ַ���������");
		String str2="www.oracle.com";
		String sub=str2.substring(4, 10);
		System.out.println(sub);
		sub=str2.substring(4);
		System.out.println(sub);
		System.out.println();
		
		/*
		 * String trim();
		 * ȥ����ǰ�ַ������ߵĿհ��ַ�
		 * 
		 */
		System.out.println("String trim();"+"\n"
				+ "ȥ����ǰ�ַ������ߵĿհ��ַ�");
		String str3="   abc			";
		System.out.println(str3);
		String trim=str3.trim();
		System.out.println(trim);
		System.out.println();
		
		/*
		 * char charAt(int index);
		 * ���ص�ǰ�ַ�����ָ��λ�õ��ַ�
		 */
		System.out.println("char charAt(int index);"+"\n"
				+ "���ص�ǰ�ַ�����ָ��λ�õ��ַ�");
		String str4="thing in java";
		char ch=str4.charAt(3);
		System.out.println(ch);
		System.out.println();
		System.out.println("�ж��Ƿ�Ϊ����");
		//�鿴�ַ����Ƿ��ǻ���
		String info="�Ϻ�����ˮ���Ժ���";
		System.out.println(info);
		for(int i=0;i<info.length()/2;i++) {
			if(info.charAt(i)!=info.charAt(info.length()-1-i)) {
				System.out.println("��");
				//System.out.println("���ǻ���");
				//return;
				break;
			}
		}
		System.out.println("�ǻ���");
		System.out.println();
		
		
		/*
		 * boolean startWith(String str)
		 * boolean endsWith(String str)
		 * �ж��ַ����Ƿ����Ը����ַ�����ʼ���β��
		 */
		System.out.println("boolean startWith(String str)"+"\n"
		 		+ "boolean endsWith(String str)"+"\n"
				 +"�ж��ַ����Ƿ����Ը����ַ�����ʼ���β��");
		String str5="thing in java";
		boolean starts=str5.startsWith("t");
		System.out.println(starts);
		boolean ends=str5.endsWith("A");
		System.out.println(ends);
		System.out.println();
		
		
		
		/*
		 * String toUpperCase()
		 * String toLowerCase()
		 * ����ǰ�ַ����е�Ӣ�Ĳ���ת��Ϊȫ��д��ȫСд
		 */
		System.out.println("String toUpperCase();"+"\n"
				+ "String toLowerCase();"+"\n"
				+ "����ǰ�ַ����е�Ӣ�Ĳ���ת��Ϊȫ��д��ȫСд");
		String str6="AbcDeFg";
		String toU=str6.toUpperCase();
		System.out.println(toU);
		String toL=str6.toLowerCase();
		System.out.println(toL);
		System.out.println();
		
		
		/*
		 * static String valueOf(...)
		 * String�ṩ��һ�����صľ�̬����valueOf
		 * �����ǽ�java��������ת��Ϊ�ַ���
		 * �����ڽ���������ת��Ϊ�ַ���
		 */
		System.out.println("static String valueOf(...)"+"\n"
				+ "�����ڽ���������ת��Ϊ�ַ���");
		 int i=123;
		 String iStr=String.valueOf(i);
		 System.out.println(iStr);
		 double d=1.23;
		 String dStr=String.valueOf(d);
		 System.out.println(dStr);
		 System.out.println();
		
		 
		 /*
		  * java.lang.StringBuilder
		  * StringBuilder��Ϊ�˽��Ƶ���޸��ַ�����ϵͳ��Դ��������
		  * StringBuilder�ڲ���һ���ɱ���ַ����飬����ͨ��������ʵ�ֳ��ȱ任
		  * ������ÿ�ζ������¶���
		  * StringBuilder�ṩ�˷����޸��ַ������ݵķ���
		  */
		 System.out.println("StringBuilder"
		 		+ "��Ϊ�˽��Ƶ���޸��ַ�����ϵͳ��Դ��������");
		 StringBuilder builder=new StringBuilder("Ŭ��ѧϰjava");
		 		//append()���������ڽ����ַ���ƴ�ӵ���ǰ�ַ���ĩβ
				builder.append("Ϊ���Һù���!");
				 System.out.println(builder.toString());
				 //replace()����ǰ�ַ�����ָ����Χ�ڵ������滻Ϊ��������
				 builder.replace(8, 10, "����");
				 System.out.println(builder.toString());
				 //delete()ɾ��ָ����Χ�ڵ�����
				 builder.delete(8, 14);
				 System.out.println(builder.toString());
				 //insert()�ڵ�ǰ�ַ���ָ��λ�ò���
				 builder.insert(2, "Ŭ��");
				 System.out.println(builder.toString());
				 //reverse()��ת�ַ���
				 builder.reverse();
				 System.out.println(builder.toString());
		System.out.println();
		
		
		
		//Scanner scan=new Scanner(System.in);
		//String host=getHostName(scan.next());
		String host=getHostName("www.baidu.com");
		System.out.println(host);
	}
	/*
	 *��ȡ������ַ�е����� 
	 */
	public static String getHostName(String host) {
		int start=host.indexOf(".");
		int end=host.lastIndexOf(".");
		String sub=host.substring(start+1,end);
		return sub;
	}
	
	
	
}
