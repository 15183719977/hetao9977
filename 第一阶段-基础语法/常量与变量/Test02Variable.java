/*
�������ڳ��������ڼ䣬���ݿ��Է����ı����

����һ����������ʹ�õĸ�ʽ��

�������� �������ƣ�//������һ������
�������� = ����ֵ��//��ֵ

һ����λ�ĸ�ʽ��

�������� �������� = ����ֵ��//��������ֵ
*/
public class Test02Variable{
	public static void main(String[] args){
		//��һ�ִ�����������ֵ
		int num1;
		num1 = 10;
		System.out.println(num1);
	    //��ӡ��������ʱ������ʾ������
		
		//�ı�����б��������֣�����µ�
		num1 = 20;
		System.out.println(num1);
		
		//�ڶ��ִ�����������ֵ
		int num2 = 26;
		System.out.println(num2);
		
		System.out.println("================");
		byte num3;//-128-127
		num3 = 30;//ע���Ҳ���ֵ�ķ�Χ���ܳ�����ߵĶ���ֵ��Χ
		System.out.println(num3);
		
		short num5 = 50;
		System.out.println(num5);
		
		long num6 = 300000000L;
		System.out.println(num6);
		
		float num7 = 2.5F;
		System.out.println(num7);
		
		double num8 = 3.14;
		System.out.println(num8);
		
		char zifu1 = 'A';
		System.out.println(zifu1);
		zifu1 = '��';//�ַ���������дһ���й���
		System.out.println(zifu1);
		
		boolean var1 = true;
		System.out.println(var1);
		
		boolean var2;
		var2 = var1;//�Ҳ��Ѵ��ڣ���trueֵ���󽻸�var2���д洢
		System.out.println(var2);
	}
}