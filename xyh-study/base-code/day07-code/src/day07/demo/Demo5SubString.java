package day07.demo;

import jdk.swing.interop.SwingInterOpUtils;

/*
�ַ����Ľ�ȡ����
public String substring(int index):��ȡ�Ӳ���λ��һֱ���ַ�ĩβ���ַ���������
public String substring(int begin,int end):��ȡ��begin��ʼ��һֱ��end����,���ر���ȡ���ַ���
ע��[begin,end)
 */
public class Demo5SubString {
    public static void main(String[] args) {
        String str1="HelloWorld";
        String str2=str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);
        String str3=str1.substring(4,7);
        System.out.println(str3);

        //������������ַ���������Ȼû�иı�
        //StrA�б�����ǵ�ַ
        //������ַ��Hello��0x666
        //������ַ�����JAVA��0x999
        String strA="Hello";
        System.out.println(strA);
        strA="JAVA";
        System.out.println(strA);
    }
}
