package basic;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height;
		double weight;
		double bmi;
		
		Scanner s = new Scanner(System.in);
		System.out.println("���������أ�");
		weight = s.nextDouble();
		System.out.println("��������ߣ�");
		height = s.nextDouble();
		bmi = weight/(height * height);
		System.out.println(bmi);
		/*
		if (bmi < 18.5) 
			System.out.println("���ع��ᣡ");
		else if (bmi>=18.5 && bmi<24)
			System.out.println("������Χ��");
		else if (bmi>=24 && bmi<27)
			System.out.println("���ع��أ�");
		else if (bmi>=27 && bmi<30)
			System.out.println("��ȷ��֣�");
		else if (bmi>30 && bmi<35)
			System.out.println("�жȷ��֣�");
		else
			System.out.println("�ضȷ��֣�");
		*/

		s.close();
	}

}
