//�ֱ�ʹ����Ԫ�������if-else���ʵ��ȡ�����������ֵ
public class Demo05Max{
	public static void main(String[] args){
		int num1=10;
		int num2=20;
		int max=num1>num2?num1:num2;
		System.out.println("���ֵΪ��"+max);
		
		System.out.println("----------------");
		if(num1>num2){
			max=num1;
		}else{
			max=num2;
		}
		System.out.println("���ֵΪ��"+max);
	}
}