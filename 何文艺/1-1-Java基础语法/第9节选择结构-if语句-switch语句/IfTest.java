//ʹ����Ԫ������ͱ�׼��if-else���ֱ�ʵ�֣�ȡ���������еĽϴ�ֵ
public class IfTest {
	public static void main(String[] args) {
		int a,b;
		a = 5;
		b = 10;
		if(a >  b) {
			System.out.println("�ϴ�ֵ��" + a);
		} else {
			System.out.println("�ϴ�ֵ��" + b);
		}
		System.out.println("�ϴ�ֵ��" + (a > b ? a : b));
	}
}