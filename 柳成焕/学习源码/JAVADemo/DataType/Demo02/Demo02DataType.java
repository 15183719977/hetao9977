/*
ǿ������ת������ʽ��
	1.�ص㣺������Ҫ�������⴦�������Զ����
	2.��ʽ����ΧС���������� ��ΧС�ı�����=����Χ����������ͣ�ԭ����Χ�������;

	ע�����
	1.ǿ������ת��һ�㲻�Ƽ�ʹ�ã��������ܻᷢ�����������С���ᷢ��������ʧ��
	2.byte/short/char���������Ͷ��ɷ�����ѧ���㣬���硰+��
	3.byte/short/char����������������ʱ��������������Ϊint�ͣ�Ȼ���ٽ��м���
	4.boolean���Ͳ��ܷ�����������ת����
*/
public class Demo02DataType{
	public static void main(String[] args){
		//�����int���ͣ��ұ���long����
		//��int��long�����ݷ�Χ���Ǵ�С������˲��ܷ����Զ���������ת����
		//int num=100L;
		
		//2.��ʽ����ΧС���������� ��ΧС�ı�����=����Χ����������ͣ�ԭ����Χ�������;
		int num=(int)100L;
		System.out.println(num);
		
		//int num2=6000000000L;  //20��
		//System.out.println(num2); //����,�����ݵ�����
		
		int num2=(int)6000000000L;
		System.out.println(num2);  //�����1705032704���������������
	
		int num3=(int)3.99;
		System.out.println(num3); //���3���Ⲣ�����������룬���ȶ�ʧ������С��λ��������
		
		char c1='A';  //�ַ��ͱ���
		System.out.println(c1);//���A
		System.out.println(c1+1);//���66,Ҳ����A����65������
		//�������ʹ��һ�����������������ַ�
		//һ��char������ѧ���㣬���ַ��ᰴ��һ�������䷭��Ϊһ������
		
		byte b1=40;  //�ұ�����ֵ���ܳ�����෶Χ  byte��Χ-128~127
		byte b2=50;
		
		//����ע������3������ʱbyte���Ȼ�תΪint�ͣ�Ȼ���ٽ��м���
		//byte+byte  ��  int +int  ����int��ӣ����Ҳ��int,����ұ�Ϊbyte��ᱨ��
		//byte result=b1+b2;  //���� ����: �����ݵ�����: ��intת����byte���ܻ�����ʧ
		
		int result1=b1+b2;
		System.out.println(result1);
		
		short s=60;
		int result2=b1+s;  //byte+short  -->  int +int  -->int ��ȷ
		System.out.println(result2);
		short result3=(short)(b1+s); //��intǿ��ת��Ϊ��short�ͣ���Ҫע����ǣ��������߼��ϱ�֤�����ݷ�Χ��
		System.out.println(result3);
	}
}