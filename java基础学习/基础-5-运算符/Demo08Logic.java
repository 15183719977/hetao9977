package practice;
/*
�߼��������%%(��)��||(��)��!(��)
ע�⣺
	1.�߼������ֻ������booleanֵ
	2.�롢����Ҫ���Ҹ�����һ��booleanֵ������ȡ��ֻҪ��Ψһ��һ��booleanֵ����
	3.�롢�����������������ж����������������д���磺����A && ����B && ����C
	���� 1<x<3�������Ӧ������ʾ��
		int x = 2;
		1 < x && x <3
 */
public class Demo08Logic {

	public static void main(String[] args) {
		System.out.println(3<4 && 10>5);//true

		//&&��||���ж�·Ч�����������������Ѿ������жϵõ����ս������ô�ұߵĴ��뽫����ִ��
		int a = 10;
		System.out.println(3>4 && ++a <100);//false
		System.out.println(a);//10
	}

}
