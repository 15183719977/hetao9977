/*
(1)��׼��ʽ
do{
	ѭ����
}while(�����ж�);

(2)��չ��ʽ
��ʼ����䣻
do{
	ѭ���壻
	������䣻
}while(�����ж�);
*/

public class Demo11DoWhile{
	public static void main(String [] args){
		for(int i=1;i<=10;i++){
			System.out.println("�������ȥˣѼ��"+i);
		}
		
		System.out.println("------------------");
		int j=1;
		do{
			System.out.println("�������ȥˣѼ��"+j);
			j++;
		}while(j<=10);
		
		System.out.println("------------------");
		int k=1;
		do{
			System.out.println("�������ȥˣѼ��"+k);   //����ִ��һ��
			j++;
		}while(j<=0);
	}
}