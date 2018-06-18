package day03;
/**
 * Ӱ��ɢ�б��ѯ���ܵ�һ����Ҫԭ��
 * ����HashMap�в�������
 * �����������Ҫ��������֣�
 * 1.Ԫ�ض࣬�������⣨ͨ���������ӽ��,��������rehash��
 * 2.��ΪkeyԪ��equals������hashcode��������д����
 * ������key��hashcodeֵ��ͬʱ��������HashMap�ڲ�
 * ���飨ɢ��Ͱ���е�λ�þ���ͬ����������key��equals
 * �����Ƚ�Ϊfalseʱ�ͻ��������
 * 
 * ��һ��������дequals����ʱ��Ӧ����ͬ��дhashcode
 * ������������ѭ����ԭ��
 * 	�ȶ��ԣ���һ���������equals�Ƚϵ�����ֵû�з���
 * 			�ı��ǰ���£���ε���hashcodeֵ���ص�����
 * 			������ͬ�������������
 * һ���ԣ�����������equals�Ƚ�Ϊtrueʱ��hashcodeֵ
 * 		  Ҫ��ȡ�����������������hashcodeֵ���
 * 	  	  equals����ҲӦ��Ϊture������Ȼ����ܻ�
 * 		  ��HashMap�г�������Ӱ��������ܡ�
 * @author NiCo
 *
 */
public class Key {
	private int x;
	private int y;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
}
