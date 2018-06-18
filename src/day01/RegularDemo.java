package day01;
/**
 * 字符串的正则规则
 * 正则本身也是字符串
 * 用于匹配字符串中字符次序的“规则字符串”
 * 很多编程语言都支持正则表达式
 * 常用API：
 * 		String.matches()规则检查方法
 * 		String.split()切分字符串
 * 		String.replaceAll()全局替换
 * 用途：用户表单数据检验
 * 		字符串规则检查
 * @author NiCo
 *
 */
public class RegularDemo {

	public static void main(String[] args) {
		/*
		 * java String API 方法matchs()
		 * 用于测试字符串整体是否符合正则规则
		 * 相当于包含^ $边界检查
		 * 检查"a"是否符合[abc]规则
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
		 * 分组用于匹配一组字符序列，经常与|连用
		 * 用于多个多组字符序列多选一
		 * （序列1|序列2|序列3）的其中一个
		 */
		reg="\\w+\\.(png|jpg|gif|jpeg)";
		System.out.println("demo.png".matches(reg));
	
		
		/*
		 * String[] data=str.split(正则表达式)
		 * 将字符串按照匹配到的位置切开
		 * 并且切除匹配到的字符，将切开的结果保存到数组
		 */
		String str="Tom,119,tom@qq.com,北京";
		String[] data=str.split(",");
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[2]);
		System.out.println(data[3]);

		
		/*
		 * 拆分IP地址：192.168.1.100
		 */
		String str1="192.168.1.100";
		String[] ip=str1.split("\\.");
		System.out.println(ip[0]);
		System.out.println(ip[1]);
		System.out.println(ip[2]);
		System.out.println(ip[3]);
	
		
		/*
		 * 匹配手机号正则
		 * 手机号头部(0086|\+86)?\s?或((00|\+)86)?\s?
		 * 1\d{10}
		 *(0086|\+86)?\s?1\d{10}\b  \b单词末尾
		 */
		reg="(0086|\\+86)?\\s?1\\d{10}";
		System.out.println("+86 18392618766".matches(reg));
		
		
		/*
		 * String 提供了替换方法，
		 * 将正则表达式能够匹配上的字符串替换为新字符串
		 * 新字符串=源字符串。replace All(正则，替换)
		 * 
		 */
		 reg="(卧槽|fuck)";
		String str2="卧槽fuck啊";
		System.out.println(str2.replaceAll(reg, "**"));
		
		
		
		
	}

}
