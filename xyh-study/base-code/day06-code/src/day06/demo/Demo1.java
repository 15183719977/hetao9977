package day06.demo;

import java.util.Random;

/*
  Random���������������
  1.����
  import java.util.Random;
  2.����
  Random r=new Random();
  3.ʹ��
  int num=r.nextInt();
  ��ȡһ��int�͵�������֣���Χ��int���з�Χ����������
  int num=r.nextInt(3);[0,3),Ҳ����0~2֮��
  ��ȡһ��int�͵�������֣���������Χ������ҿ���

*/
public class Demo1 {

    public static void main(String[] args) {
        //int�޷�Χ
        Random r=new Random();
        int num1=r.nextInt();
        System.out.println("������ǣ�"+num1);

        //int�з�Χ
        for (int i = 0; i <20 ; i++) {
            int num2 = r.nextInt(10);
            //�����Χ��[0,10)
            System.out.println(num2);
        }

        //����һ�����������Χ��[1,n]
        int n=5;
        System.out.println("===========================");
        for (int i1 = 0; i1 < 20; i1++) {
            //[0,n)+1 ->[1,n+1) ->[1,n]
            int result=r.nextInt(n)+1;
            System.out.println(result);

        }
    }
}


