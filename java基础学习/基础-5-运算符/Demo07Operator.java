package practice;
/*
��ֵ�������
	������ֵ�������=�������Ҳ�����ݽ������ı���
	���ϸ�ֵ�������+=��-=��*=��/=��%=
ע�⣺
	1.ֻ�б�������ʹ�ø�ֵ��������������ܷ��ڸ�ֵ��������
	2.���ϸ�ֵ���������������һ��ǿ������ת��
 */
public class Demo07Operator {
	public static void main(String[] args) {
		int a = 10;
		a += 10;
		System.out.println(a);//20
		
		int x = 10;
		x %= 3;
		System.out.println(x);//1

/*
�Ƚ��������>��<��>=��<=��==��!=
ע�����
	1.�Ƚ�������Ľ��һ����һ��booleanֵ
	2.������ж���жϣ���������д���粻��д1<x<3
 */
		System.out.println(10 > 5);//true
		int num1 = 10;
		int num2 = 12;
		System.out.println(num1<num2);//true
		System.out.println(num2>100);//false
	}

}
