/*
ע�����
1. �����������������֮������Ʋ������ظ�
2. ����float��long���ͣ���׺F��L���ܶ���
3. ע�������Ҳ���ֵ��Χ
4. ֻ�и�ֵ�ı�������ʹ��
5. ����ʹ�ò��ܳ���������Χ
�������򡿣��Ӷ��������һ�п�ʼ��һֱ�������Ĵ����Ž���Ϊֹ��
6. ����ͨ��һ����䴴��������������Ƽ�
*/
public class Test03VariableNotice{
	public static void main(String[] args){
		
		{
			int num1 = 60;
			System.out.println(num1);
		}
		//System.out.println(num1);//������������
		int a,b,c;//ͬʱ������������,�ֱ�ֵ
		a = 10;
		b = 20;
		c = 30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int a1 = 100,b1 = 200,c1 = 300;//ͬʱ������������,ͬʱ��ֵ
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
	}
}