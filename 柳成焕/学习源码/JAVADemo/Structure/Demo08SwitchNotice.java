/*
1.���case���������ֵ�������ظ���
2.switch����С���ŵ���ֻ���������������ͣ�
��1��4�������������ͣ�byte/short/int/char
��2��2�������������ͣ�String�ַ���/enumö��
3.switch�����Ժ���ǰ��˳����Եߵ�������break��仹��ʡ�ԡ�
��ƥ�䵽��һ��case�ʹ���һ��λ������ִ�У�ֱ������break���������Ϊֹ��

*/
public class Demo08SwitchNotice{
	public static void main(String[] args){
		char c='f';
		switch(c){
			case 'a':
				System.out.println("aaa");
				//break;
			default:
				System.out.println("ccc");
				
				//break;
			case 'b':
				System.out.println("bbb");
				break;
			
		}
	}
}