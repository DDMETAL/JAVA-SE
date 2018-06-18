package day01;

public class StringDemo {

	public static void main(String[] args) {
		/*
		 * 字符串是不可变对象,创建后内容不可改变，
		 * 改变内容会创建新对象，
		 * 字符串通常使用字面量形式创建，
		 * 因为字面量形式创建的字符串对象会缓存在常量池中被重用，
		 * 减少大量内容一样的字符串对象对内存的不必要开销
		 * 
		 */
		System.out.println("字符串是不可变对象");
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
		 * 编译器在编译源程序时若发现一个计算表达式
		 * 的所有内容都是直接量，那么会直接计算该表达式
		 * 并将结果编译到class文件中
		 * 所以jvm在运行下面的代码时，看到的样子为：
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
		 * 返回当前字符串的长度
		 */
		System.out.println("int length();返回当前字符串的长度");
		String str="我爱java";
		int len=str.length();
		System.out.println("len:"+len);
		System.out.println();
		
		/*
		 * int indexOf(String str)
		 * 返回给定字符串在当前字符串中的位置，
		 * 若当前字符串不含有给定字符串则返回-1
		 * 否则返回下标
		 */	
		//			 0123456789012345	
		System.out.println("int indexOf(String str);"+"\n"
				+ "返回给定字符串在当前字符串中的位置");
		String str1="thinking in java";
		int index=str1.indexOf("in");
		System.out.println(index);//2
		//从指定位置开始查找
		index=str1.indexOf("in",3);
		System.out.println(index);
		//查看最后一次出现的位置
		index=str1.lastIndexOf("in");
		System.out.println(index);
		System.out.println();
		
		/*
		 * String substring(int start,int end);
		 * 截取当前字符串指定范围内的字符串并返回
		 * 在java api中通常使用两个数字表示范围时，
		 * 都是“含头不含尾”的
		 */
		System.out.println("String substring(int start,int end);"+"\n"
				+ "截取当前字符串指定范围内的字符串并返回");
		String str2="www.oracle.com";
		String sub=str2.substring(4, 10);
		System.out.println(sub);
		sub=str2.substring(4);
		System.out.println(sub);
		System.out.println();
		
		/*
		 * String trim();
		 * 去掉当前字符串两边的空白字符
		 * 
		 */
		System.out.println("String trim();"+"\n"
				+ "去掉当前字符串两边的空白字符");
		String str3="   abc			";
		System.out.println(str3);
		String trim=str3.trim();
		System.out.println(trim);
		System.out.println();
		
		/*
		 * char charAt(int index);
		 * 返回当前字符串中指定位置的字符
		 */
		System.out.println("char charAt(int index);"+"\n"
				+ "返回当前字符串中指定位置的字符");
		String str4="thing in java";
		char ch=str4.charAt(3);
		System.out.println(ch);
		System.out.println();
		System.out.println("判断是否为回文");
		//查看字符串是否是回文
		String info="上海自来水来自海上";
		System.out.println(info);
		for(int i=0;i<info.length()/2;i++) {
			if(info.charAt(i)!=info.charAt(info.length()-1-i)) {
				System.out.println("不");
				//System.out.println("不是回文");
				//return;
				break;
			}
		}
		System.out.println("是回文");
		System.out.println();
		
		
		/*
		 * boolean startWith(String str)
		 * boolean endsWith(String str)
		 * 判断字符串是否是以给定字符串开始或结尾的
		 */
		System.out.println("boolean startWith(String str)"+"\n"
		 		+ "boolean endsWith(String str)"+"\n"
				 +"判断字符串是否是以给定字符串开始或结尾的");
		String str5="thing in java";
		boolean starts=str5.startsWith("t");
		System.out.println(starts);
		boolean ends=str5.endsWith("A");
		System.out.println(ends);
		System.out.println();
		
		
		
		/*
		 * String toUpperCase()
		 * String toLowerCase()
		 * 将当前字符串中的英文部分转换为全大写或全小写
		 */
		System.out.println("String toUpperCase();"+"\n"
				+ "String toLowerCase();"+"\n"
				+ "将当前字符串中的英文部分转换为全大写或全小写");
		String str6="AbcDeFg";
		String toU=str6.toUpperCase();
		System.out.println(toU);
		String toL=str6.toLowerCase();
		System.out.println(toL);
		System.out.println();
		
		
		/*
		 * static String valueOf(...)
		 * String提供了一组重载的静态方法valueOf
		 * 作用是将java其他类型转换为字符串
		 * 常用于将基本类型转换为字符串
		 */
		System.out.println("static String valueOf(...)"+"\n"
				+ "常用于将基本类型转换为字符串");
		 int i=123;
		 String iStr=String.valueOf(i);
		 System.out.println(iStr);
		 double d=1.23;
		 String dStr=String.valueOf(d);
		 System.out.println(dStr);
		 System.out.println();
		
		 
		 /*
		  * java.lang.StringBuilder
		  * StringBuilder是为了解决频繁修改字符串对系统资源开销问题
		  * StringBuilder内部是一个可变的字符数组，可以通过扩容来实现长度变换
		  * 而不是每次都创建新对象
		  * StringBuilder提供了方便修改字符串内容的方法
		  */
		 System.out.println("StringBuilder"
		 		+ "是为了解决频繁修改字符串对系统资源开销问题");
		 StringBuilder builder=new StringBuilder("努力学习java");
		 		//append()方法是用于将给字符串拼接到当前字符串末尾
				builder.append("为了找好工作!");
				 System.out.println(builder.toString());
				 //replace()将当前字符串中指定范围内的内容替换为给定内容
				 builder.replace(8, 10, "加油");
				 System.out.println(builder.toString());
				 //delete()删除指定范围内的内容
				 builder.delete(8, 14);
				 System.out.println(builder.toString());
				 //insert()在当前字符串指定位置插入
				 builder.insert(2, "努力");
				 System.out.println(builder.toString());
				 //reverse()反转字符串
				 builder.reverse();
				 System.out.println(builder.toString());
		System.out.println();
		
		
		
		//Scanner scan=new Scanner(System.in);
		//String host=getHostName(scan.next());
		String host=getHostName("www.baidu.com");
		System.out.println(host);
	}
	/*
	 *获取给定地址中的域名 
	 */
	public static String getHostName(String host) {
		int start=host.indexOf(".");
		int end=host.lastIndexOf(".");
		String sub=host.substring(start+1,end);
		return sub;
	}
	
	
	
}
