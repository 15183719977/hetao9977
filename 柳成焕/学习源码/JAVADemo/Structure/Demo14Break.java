/*
break�ؼ��ֵĳ����÷������֣�
1.������switch�У�һ��ִ�У�����switch�������������
2.����ѭ������У�һ��ִ��ô����ѭ��������̽��������ѭ����

*/
public class Demo14Break{
	public static void main(String[] args){
		for(int i=1;i<=10;i++){
			//�ӵ��Ĵο�ʼ���ѭ���������ѭ������Ҫ�ˣ�ֱ���˳�
			if(i==4){
				break;
			}
			System.out.println("Hello"+i);
		}
	}
	
}