package practice;
/*
 * һ���������в�ͬ���͵����ݣ�����������������ͷ�Χ�������
 */
public class Demo05Operator {

	public static void main(String[] args) {
		//��������֮����Խ�����ѧ����
		System.out.println(20+30);//50
		
		//��������֮��Ҳ���Խ�����ѧ����
		int a = 20;
		int b = 30;
		System.out.println(a - b);//-10

		//�����ͳ���֮����Ի��ʹ��
		System.out.println(a*10);//200
		
		int x = 10;
		int y = 3;
		
		int result1 = x/y;
		System.out.println(result1);//3,�����������������������������Ϊ����
	
		int result2 = x % y;
		System.out.println(result2);//1
		
		double result3 = x + 2.5;
		System.out.println(result3);//12.5

/*
 ���������еļӺŵ��÷���
 	1.������ֵ��˵���Ǽӷ�
 	2.�����ַ�char������˵���ڼ���֮ǰ��ͨ��ASCII��ת��Ϊint�ټ���
 	3.�����ַ���String��˵���ӺŴ����ַ������Ӳ���
 */
		//�ַ������ͱ�����ʹ��
		String str1 = "hello";
		System.out.println(str1+"world");//helloworld
		
		//�κ��������ͺ��ַ����������ӵ�ʱ�򣬽���������ַ���
		String str2 = "java";
		System.out.println(str2 + 20);//java20
		
		//���ȼ�����
		System.out.println(str2 + 20 + 30);//java2030
	}

}
