package day07.demo;

import java.util.Scanner;

/*
��Ŀ��
��������һ���ַ�������ͳ�Ƹ����ַ����ֵĴ���
�����У���д��ĸ��Сд��ĸ�����֡�����
*/
public class practice02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        method(str);

    }

    public static  void method(String str){
       int len=str.length();
       int d=0;
       int x=0;
       int n=0;
       int q=0;
        for (int i = 0; i < len; i++) {
            char a=str.charAt(i);
            if(a>='A'&&a<='Z'){
                d++;
            }else if(a>='a'&&a<='z') {
                x++;
            }else if(a>='0'&&a<='9'){
                n++;
            }else{
                q++;
            }
        }
        System.out.println("��д��ĸ�У�"+d+"��");
        System.out.println("Сд��ĸ�У�"+x+"��");
        System.out.println("�����У�"+n+"��");
        System.out.println("�����У�"+q+"��");

    }
}
