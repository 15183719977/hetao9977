package demo2;

public class hannuota {
	public static void main(String[] args) {
		hanoi(10,'a','b','c');
	}
	
	public static void hanoi(int n,char from, char in,char to) {
		if(n==1) {
			System.out.println("��1�����Ӵ�"+from+"�Ƶ�"+to);
		}else {
			//�ƶ����������
			hanoi(1,from,to,in);
			//�ƶ������
			System.out.println("��"+n+"�����Ӵ�"+from+"�Ƶ�"+to);
			//��������������Ӵ��м�λ���ƶ���Ŀ��λ��
			hanoi(n-1,in,from,to);
		}
	}
}
