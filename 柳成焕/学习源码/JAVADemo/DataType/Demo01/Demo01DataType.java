/*
���������Ͳ�һ��ʱ�����ᷢ����������ת��
1.�Զ�����ת������ʽ��
  �ص㣺���벻��Ҫ���⴦���Զ����
  �������ݷ�Χ��С�������ֽ�����һ����أ���float��long���ͣ����ݷ�Χ��С���󣬷����Զ�����ת����
2.ǿ������ת������ʽ��
  
*/
public class Demo01DataType{
	public static void main(String[] args){
		System.out.println(1024);  //�����һ��������Ĭ��int��
		System.out.println(3.14);  //����һ�������ͣ�Ĭ��double��
		
		//�����long���ͣ��ұ�Ĭ�ϵ���int���ͣ����Ҳ�һ��
		//һ��=����ֵ���������Ҳ��int��������ֵ������long�������д洢
		//int��long�����ݷ�Χ��С���󣬷����Զ�����ת��Ҫ��
		//��һ�з������Զ�����ת��
		long num1=100;  			
		System.out.println(num1); 
		
		//���double���ͣ��ұ߸�������
		//float��long  ���Ϸ�Χ��С����
		double num2=2.5F;
		System.out.println(num2);
		
		//���float���ͣ��ұ�long����
		//float��long�����ݷ�Χ��С���󣬷����Զ�����ת��Ҫ��
		//�˴��������Զ�����ת��
		float num3=200L;
		System.out.println(num3); //�˴�Ӧ�����200.0
	}
}