package day05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * java.io.ObjectOutputStream
 * 对象输出流，用于将对象转换为一组字节后写出
 * @author NiCo
 *
 */
public class ObjectOutputStream_writeObject {
	public static void main(String[] args) throws IOException   {
		Person p=new Person();
		p.setName("张三");
		p.setAge(18);
		p.setGender("男");
		
		List<String> otherInfo
			=new ArrayList<String>();
		otherInfo.add("是一名程序员");
		otherInfo.add("喜欢旅行");
		p.setOtherInfo(otherInfo);
		
		FileOutputStream fos
			=new FileOutputStream("fos.obj");
		ObjectOutputStream oos
			=new ObjectOutputStream(fos);
		/*
		 * 将给定对象转换为一组字节后写出
		 * 
		 * 		将对象转换为字节
		 * 		   |
		 * 对象——>oos——>fos——>文件
		 * 				|
		 * 			将字节写入文件
		 * 
		 * 将一个对象转换为一组字节写到文件中
		 * 经历了两个步骤：
		 * 1.将一个对象转换为一组字节
		 *   这个过程称为：对象序列化
		 * 2.将这组字节写入文件（磁盘）长久保存
		 * 	 这个过程成为：持久化
		 */
		
		oos.writeObject(p);
		System.out.println("写出完成");
		oos.close();
	}
}
