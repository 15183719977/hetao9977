package practice;
/*
ǿ������ת����
	1.�ص㣺������Ҫ��������ĸ�ʽ���������Զ����
	2.��ʽ����ΧС������ ��ΧС�ı����� = ����ΧС�����ͣ�ԭ����Χ�������
ע�⣺
	1.ǿ������ת��һ�㲻�Ƽ�ʹ�ã���Ϊ�п��ܷ���������ʧ���������
 	2.byte��short��char���������Ͷ����Է�����ѧ���㣬����ӷ���+��
 	3.byte��short��char����������������ʱ���ᱻ����������Ϊint�����ټ���
 	4.boolean�����ǲ��ܷ�����������ת��
 */

public class Demo04DataType {

	public static void main(String[] args) {
		//���int���ұ�long��int���ݷ�ΧС��long�������Զ�����ת��
		//�����ǿ������ת��
		int num = (int)100L;
		System.out.println(num);//100
		
		//longǿ��ת��Ϊint����
		//��long���͵���ֵ������int����ֵ��Χ��ǿ��ת���Ժ������������
		int num2 = (int)6000000000L;
		System.out.println(num2);//1705032704

		//double --> int��ǿ������ת��
		int num3 = (int)3.99;
		System.out.println(num3);//3,�����˾�����ʧ�����е�С��λ���ᱻ����
		
		char var = 'A';
		//char��������ʱ�������һ��ASCII���ת��
		System.out.println(var+1);//66,A��ASCII����65
		
		byte num4 = 40;
		byte num5 = 50;
		//byte+byte �ȼ��� int+int����Ϊbyte������ʱ��������Ϊint
		int result1 = num4 + num5;
		System.out.println(result1);//90
		
		short num6 = 60;
		//byte+short --> int+int 
		int result2 = num4+num6;
		System.out.println(result2);
		
		//��Ҫʹ��ǿ��ת��Ҳ���ԣ������뱣֤���ᷢ���������
		short result3 = (short)(num4+num6);
		System.out.println(result3);//Ҳ�����100
	}
	

}
