package day07.demo;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;

/*
String�������ȡ��صĳ��÷�����
1.public int length():��ȡ�ַ������к��е��ַ����������ַ�������
2.public String concat(String str):����ǰ�ַ����Ͳ����е��ַ���ƴ�ӳ��µ��ַ���������
3.public Char charAt(int index):��ȡָ������λ�õĵ����ַ���
4.public int indexOf(String str):���Ҳ����ַ����ڱ��ַ������״γ��ֵ�����λ�ã����û�з���-1
* */
public class Demo4StringGet {
    public static void main(String[] args) {
        //��ȡ�ַ�����ĳ���
        String str="addffdfdfdfidfjlaifha";
        int len=str.length();
        System.out.println(len);
        //ƴ���ַ���
        String str1="Hello";
        String str2="World";
        String str3=str1.concat(str2);
        System.out.println(str1);//Hello
        System.out.println(str2);//World
        System.out.println(str3);//�µ��ַ���
        //��ȡָ������λ�õĵ����ַ�
        char ch="Hello".charAt(1);
        System.out.println(ch);

        //���Ҳ����ַ����ڱ����ַ������г��ֵĵ�һ������λ��
        String original="HelloWorld";
        int index=original.indexOf("ll");
        System.out.println(index);
    }
}
