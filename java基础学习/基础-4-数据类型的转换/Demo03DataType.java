package practice;
/*
 ��������ת�������������Ͳ�һ��ʱ�����ᷢ����������ת��
��������ת����ʽ��Ϊ���Զ�����ת����ǿ������ת��
 �Զ�����ת������ʽ����
 	1���ص㣺���벻��Ҫ�������⴦���Զ����
 	2���������ݷ�Χ��С����
 */
public class Demo03DataType {
	public static void main(String[] args) {
		System.out.println(1024);//����һ��������Ĭ��Ϊint����
		System.out.println(3.14);//����һ����������Ĭ��Ϊdouble����
		
		//�����long���ͣ��ұ���Ĭ�ϵ�int����
		//int -> long�����������ݷ�Χ��С������Զ�ת��Ҫ��
		//�������Զ�����ת��
		long num1 = 100;
		System.out.println(num1);//100
		
		//float -> double,�������Զ�����ת��
		double num2 = 2.5F;
		System.out.println(num2);//2.5
		
		//�����float���ͣ��ұ���long���ͣ��Զ�ת��
		//long -> float����Χ��float����һЩ�������Զ�����ת����С����Ĺ���
		float num3 = 30L;
		System.out.println(num3);//30.0
	}

}
