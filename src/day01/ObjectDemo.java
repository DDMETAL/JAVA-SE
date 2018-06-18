package day01;
/**
 * Object中定义了全体类共同的方法，子类会自动继承这些方法
 * 
 * toString()方法就是定义在Object类上定义的方法
 * 建议在子类中重写toString方法
 * 
 * Object提供了比较两个对象是否相等的方法
 * equals()
 * 默认的equals()方法不能比较对象中数据是否相等
 * 建议子类重写(Object的equals方法是用==比较的)
 * 重写时，按照关键数据比较两个对象是否相等
 * 
 */
public class ObjectDemo {

	public static void main(String[] args) {
		Point p=new Point(1,2);
		System.out.println(p.toString());//1,2
		//输出3个点
		/*
		 * 如下3个对象，是不同的，但关键数据相同
		 * 是数据相等的对象
		 */
		Point p1=new Point(3,4);
		Point p2=new Point(3,4);
		Point p3=new Point(3,4);
		boolean b=p1.equals(p2);
		Point p4=null;
		//没重写equals()方法时返回为false
		//System.out.println(b);//false
		/*
		 * 利用重写的equals()方法比较两个对象相等
		 */
		System.out.println(b);//true
		System.out.println(p1.equals(p4));//false
		System.out.println(p1.equals(p1));//true
		//传统做法
		System.out.println(p1.x+","+p1.y);
		System.out.println(p2.x+","+p2.y);
		System.out.println(p3.x+","+p3.y);
		//利用toString
		System.out.println(p1);//自动调用toString方法 	
		System.out.println(p2);
		System.out.println(p3);
		
		
		String s1=new String("a");
		String s2=new String("a");
		String s3=new String("ab");
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		
		/*
		 * 不能用==用于比较对象相等！
		 * ==比较的是变量的值，引用变量的值是地址，所以==
		 * 比较的是引用变量地址值
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
 * 平面坐标系中的一个点(x,y)
 * 重写toString方法，返回Point的关键数据（x,y）
 */
class Point{
	int x,y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		
	}
	/*
	 *toString方法的用途：java的API会自动调用
	 *toString方法，利用这个特点可以简化
	 *程序的调试输出，如Println(p)会自动调用toString 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		//返回Point对象的关键数据
		return x+","+y;
	}
	/*
	 * 重写euqals()方法(修改父类的方法)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		//方法执行期间this是指当前对象引用
		//obj是另外一个对象的引用
		//比较关键数据：比较this(x,y)和obj(x,y)是否相等
		if(obj==null) {
			return false;
		}
		if(this==obj) {//对象自己跟自己比较
			return true;//性能好
		}
		if(obj instanceof Point) {//强转
			Point other=(Point)obj;
			return this.x==other.x
					&&
					this.y==other.y;
		}
		return false;
	}
}