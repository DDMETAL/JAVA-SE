package day05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * java.io.ObjectInputStream
 * ���������������ڽ��ж������л�
 * ��Ҫע����Ƕ�����������ȡ�����ݱ�����ͨ��
 * ObjectOutputStream���л��Ķ���
 * @author NiCo
 *
 */
public class ObjectInputStreamDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis
			=new FileInputStream("fos.obj");
		ObjectInputStream ois
			=new ObjectInputStream(fis);
		
		Person p=(Person)ois.readObject();
		System.out.println(p);
		ois.close();
		
	}
}
