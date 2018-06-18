package day05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * java.io.ObjectOutputStream
 * ��������������ڽ�����ת��Ϊһ���ֽں�д��
 * @author NiCo
 *
 */
public class ObjectOutputStream_writeObject {
	public static void main(String[] args) throws IOException   {
		Person p=new Person();
		p.setName("����");
		p.setAge(18);
		p.setGender("��");
		
		List<String> otherInfo
			=new ArrayList<String>();
		otherInfo.add("��һ������Ա");
		otherInfo.add("ϲ������");
		p.setOtherInfo(otherInfo);
		
		FileOutputStream fos
			=new FileOutputStream("fos.obj");
		ObjectOutputStream oos
			=new ObjectOutputStream(fos);
		/*
		 * ����������ת��Ϊһ���ֽں�д��
		 * 
		 * 		������ת��Ϊ�ֽ�
		 * 		   |
		 * ���󡪡�>oos����>fos����>�ļ�
		 * 				|
		 * 			���ֽ�д���ļ�
		 * 
		 * ��һ������ת��Ϊһ���ֽ�д���ļ���
		 * �������������裺
		 * 1.��һ������ת��Ϊһ���ֽ�
		 *   ������̳�Ϊ���������л�
		 * 2.�������ֽ�д���ļ������̣����ñ���
		 * 	 ������̳�Ϊ���־û�
		 */
		
		oos.writeObject(p);
		System.out.println("д�����");
		oos.close();
	}
}
