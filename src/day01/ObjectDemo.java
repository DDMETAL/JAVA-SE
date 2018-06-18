package day01;
/**
 * Object�ж�����ȫ���๲ͬ�ķ�����������Զ��̳���Щ����
 * 
 * toString()�������Ƕ�����Object���϶���ķ���
 * ��������������дtoString����
 * 
 * Object�ṩ�˱Ƚ����������Ƿ���ȵķ���
 * equals()
 * Ĭ�ϵ�equals()�������ܱȽ϶����������Ƿ����
 * ����������д(Object��equals��������==�Ƚϵ�)
 * ��дʱ�����չؼ����ݱȽ����������Ƿ����
 * 
 */
public class ObjectDemo {

	public static void main(String[] args) {
		Point p=new Point(1,2);
		System.out.println(p.toString());//1,2
		//���3����
		/*
		 * ����3�������ǲ�ͬ�ģ����ؼ�������ͬ
		 * ��������ȵĶ���
		 */
		Point p1=new Point(3,4);
		Point p2=new Point(3,4);
		Point p3=new Point(3,4);
		boolean b=p1.equals(p2);
		Point p4=null;
		//û��дequals()����ʱ����Ϊfalse
		//System.out.println(b);//false
		/*
		 * ������д��equals()�����Ƚ������������
		 */
		System.out.println(b);//true
		System.out.println(p1.equals(p4));//false
		System.out.println(p1.equals(p1));//true
		//��ͳ����
		System.out.println(p1.x+","+p1.y);
		System.out.println(p2.x+","+p2.y);
		System.out.println(p3.x+","+p3.y);
		//����toString
		System.out.println(p1);//�Զ�����toString���� 	
		System.out.println(p2);
		System.out.println(p3);
		
		
		String s1=new String("a");
		String s2=new String("a");
		String s3=new String("ab");
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		
		/*
		 * ������==���ڱȽ϶�����ȣ�
		 * ==�Ƚϵ��Ǳ�����ֵ�����ñ�����ֵ�ǵ�ַ������==
		 * �Ƚϵ������ñ�����ֵַ
		 */
		System.out.println();
		String s4="a";
		String s5="a";
		String s6=new String(s5);
		System.out.println(s4==s5);//true
		System.out.println(s5==s6);//false
	}
}
/*
 * ƽ������ϵ�е�һ����(x,y)
 * ��дtoString����������Point�Ĺؼ����ݣ�x,y��
 */
class Point{
	int x,y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		
	}
	/*
	 *toString��������;��java��API���Զ�����
	 *toString��������������ص���Լ�
	 *����ĵ����������Println(p)���Զ�����toString 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		//����Point����Ĺؼ�����
		return x+","+y;
	}
	/*
	 * ��дeuqals()����(�޸ĸ���ķ���)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		//����ִ���ڼ�this��ָ��ǰ��������
		//obj������һ�����������
		//�ȽϹؼ����ݣ��Ƚ�this(x,y)��obj(x,y)�Ƿ����
		if(obj==null) {
			return false;
		}
		if(this==obj) {//�����Լ����Լ��Ƚ�
			return true;//���ܺ�
		}
		if(obj instanceof Point) {//ǿת
			Point other=(Point)obj;
			return this.x==other.x
					&&
					this.y==other.y;
		}
		return false;
	}
}