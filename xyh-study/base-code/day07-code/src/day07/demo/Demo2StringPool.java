package day07.demo;
/*
�ַ���������(�ڶ��ڴ���)��������ֱ��д��˫�����ַ����������ַ�����������
���ڳ�����˵��==�ǽ�����ֵ�Ƚ�
��������������˵��==�ǽ��е�ֵַ�Ƚ�
��ʾ��ͼ��
*/
public class Demo2StringPool {
    public static void main(String[] args) {
        String str1="abc";
        String str2="abc";
        char [] array={'a','b','c'};
        String str3=new String(array);
        System.out.println(str1==str2);
        System.out.println(str2==str3);
        System.out.println(str1==str3);
    }
}
