package day06.demo;

import java.util.Random;
import java.util.Scanner;

/*�������ϰ�⣺ģ�������С��Ϸ*/
public class Demo2 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("��������Ĳ²�����֣�");
            int guessnum = sc.nextInt();
            if (guessnum < num) {
                System.out.println("�����������̫С");
            } else if (guessnum > num) {
                System.out.println("�����������̫��");
            } else {
                System.out.println("��ϲ������ˣ�");
                break;
            }


        }

        System.out.println("��Ϸ����");

    }
}
