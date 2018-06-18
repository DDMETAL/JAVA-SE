package day03;

import java.util.HashMap;
import java.util.Map;

/*
 * java.util.Map
 * ���ұ���Key-value�Ե���ʽ�洢Ԫ��
 * ����ʵ���ࣺjava��util.HashMap
 * HashMap:ɢ�б���ɢ���㷨ʵ�ֵ�Map
 * 
 * MapҪ��key�������ظ���
 * �Ƿ��ظ�ȡ����keyԪ��equals�����ȽϵĽ�� 
 *
 */
public class Map_put_get_Demo {
	public static void main(String[] args) {
		Map<String,Integer> map
			=new HashMap<String,Integer>();
		/*
		 * V put(key,value)
		 * ����Ӧ�ļ�ֵ�Դ��뵽Map��
		 * ����MapҪ��Key�����ظ���
		 * ������ʹ�����е�Key�����µ�value��
		 * ���滻��Keyԭ������Ӧ��valueֵ����
		 * ���䷵�أ���ָ����Key��Map�в����ڣ���
		 * ����ֵΪnull
		 */
		map.put("����", 99);
		map.put("��ѧ", 98);
		map.put("Ӣ��", 97);
		map.put("����", 96);
		/*
		 * ������ʹ�û�������ȥ���շ���ֵ��
		 * ��Ϊ������ֵΪnull�������Զ�����ʱ��
		 * �����ָ���쳣
		 */
		Integer num=map.put("��ѧ", 99);
		System.out.println(num);
		
		System.out.println(map);
		
		num=map.put("��ѧ", 98);
		System.out.println(num);
		System.out.println(map);
		
		/*
		 * V get(K k)
		 * ��ȡָ��Key����Ӧ��value
		 * ���ƶ���Key��map�в������򷵻�ֵΪnull
		 */
		num=map.get("����");
		System.out.println("���ģ�"+num);
		num=map.get("����");
		System.out.println("����:"+num);
		
		/*
		 * V remove(K k)
		 * ��������key��Ӧ�ļ�ֵ�Դ�map��ɾ��
		 * ����ֵΪkey��Ӧ��value 
		 */
		num=map.remove("����");
		System.out.println("remove:"+num);
		System.out.println(map);
	}
}	
