package practice;
/*
�����������++
�Լ��������--

ʹ�÷�ʽ��
	1.����ʹ�ã����������κβ�����ϣ��Լ�������Ϊһ������
	2.���ʹ�ã�������������ϣ������븳ֵ��ϣ����ߴ�ӡ������ϵ�
ʹ������
	1.�ڵ���ʹ��ʱ��++a��a++û������
	2.���ʹ��ʱ��
		a.���ǰ++����ô�����ȣ�1�����������Ĳ���
		b.�����++����ô����������+1
 */
public class Demo06Operator {
	public static void main(String[] args) {
		int num1 = 10;
		System.out.println(num1);//10
		++num1;//����ʹ�ã�ǰ++
		System.out.println(num1);//11
		num1++;//����ʹ�ã���++
		System.out.println(num1);//12
		System.out.println("============");
		
		//���ӡ�������ʹ��ʱ
		int num2 = 20;
		System.out.println(++num2);//21,�ȼ�1�ٴ�ӡ
		System.out.println(num2++);//21,�ȴ�ӡ��+1
		System.out.println(num2);//22
		
		//�븳ֵ�������ʱ
		int num3 = 40;
		int result1 = --num3;//ǰ--
		System.out.println(result1);//39
		System.out.println(num3);//39
		System.out.println("========");
		
		int num4 = 50;
		int result2 = num4--;//��--
		System.out.println(result2);//50
		System.out.println(num4);//49
		System.out.println("=========");
		
		//�����Լ���ϵĸ�������
		int x = 10;
		int y = 20;
		int result3 = ++x + y++;
		System.out.println(result3);//31
		System.out.println(x);//11
		System.out.println(y);//21
	}

}
