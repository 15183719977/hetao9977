package basic;

import java.util.Scanner;

public class ForControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//di = daily income 
		int di = 1;
		//n = all income;
		int n = 0;
		//d = day;
		int d;
		Scanner s = new Scanner(System.in);
		System.out.println("��������ؤ���˶����죡");
		d = s.nextInt();
		for (int j = 1; j <= d; j++){
			n += di;
			System.out.println("��"+j +"��������"+di+"��Ǯ��");
			di *= 2;
		}
		System.out.println("������"+ n +"��Ǯ");
		s.close();
	}

}
