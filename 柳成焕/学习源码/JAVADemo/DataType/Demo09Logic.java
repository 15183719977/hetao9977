/*
�߼������ 
	&& || ��
	��&&  ȫ������true����true,�������false
	��||  ����һ����true����true����ȫ����false������false
	��!   ȡ�� 
*/
public class Demo09Logic{
	public static void main(String[] args){
		System.out.println(true && false); //false
		
		System.out.println(5>3 && 1<2);  //true
		
		System.out.println(true || false);  //true
		
		System.out.println(!true); //�������Ϊbooleanֵ
		
		System.out.println("========");
		int a=10;
		//false && ...   ->false  �ұ߲���Ҫִ��
		System.out.println(3>5 && ++a<100); //false
		System.out.println(a);  //10  ˵���ұߴ��벢δִ��
	}
}