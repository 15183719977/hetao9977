
/*
���ֺ��ַ��Ķ�Ӧ��ϵ�������
ASCII���Amarican Standard Code for Information Interchange������Ϣ������׼����
Unicode�������룬Ҳ�����ֺ��ַ��Ķ�Ӧ��ϵ��0-127��ASCII�����ͬ
48--��0��  65--��A��   97--'a'
*/

public class Demo03DataChar{
	public static void main(String [] args){
		char c1='1';
		System.out.println(c1+0); //49
		
		char c2='c';
		
		//char-->int ���ݷ�Χ��С���󣬷����Զ�����ת��
		//�����Զ�����ת��
		int num=c2;  //99
		System.out.println(num);
		
		char c3='��';
		System.out.println(c3+0); //20013
	}
}