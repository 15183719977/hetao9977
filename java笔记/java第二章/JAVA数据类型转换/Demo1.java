public class Demo1{
	public static void main (String[] args){
		int num = (int)100l;
		System.out.println(num);
		//longǿ��ת��Ϊint��
		int num2 = (int)3.9;
		System.out.println(num2);
		//double-->int ǿ��ת��
		char ziful = 'A';
		System.out.println(ziful+1);
		//������ײ����һ�����֣������ƣ�����ʾ�ַ�A
		byte num3 = 40;
		byte num4 = 50;
		int result = num4+num3;
		System.out.println(result);
		//byte+byte-->int +��������������
	}
}