/*
��ֵ�������
	������ֵ�������=
	���ϸ�ֵ�������+= -= *= /= %=
	+=:  a+=10; --> a=a+10;
	-=:  b-=20; --> b=b-20;
	*=:  c*=30; --> c=c*30;
	/=:  d/=40; --> d=d/40;
	%=:  e%=50; --> e=e%50;
	
	ע�����
		1.ֻ�б�������ʹ�ø�ֵ��������������ܽ��и�ֵ  
		2.���ϸ�ֵ�����������һ��ǿ������ת����
*/

public class Demo07Operator{
	public static void main(String[] args){
		int a=10;
		a+=5; //a=15
		System.out.println(a);
		
		int b=20;
		b%=6;   //b=b%6  
		System.out.println(b);
		
		byte c=30;
		//c=c+5;
		//byte+int  -->  int + int -->int
		//c=(byte)int  �˴���һ��ǿ������ת��
		c+=5;
		System.out.println(c);
		
		byte d=20;
		//d=d+2.5;
		//byte+double  -->int + double
		//int ->double ���ݷ�Χ��С���󣬷����Զ�����ת��
		//int+double  -->  double + double  ->double 
		//d=(byte)double;
		d+=2.5;
		System.out.println(d); //22
	}
}