package day07.demo;
/*
�ָ��ַ����ķ�����
public String[] split(String regex):���ղ����Ĺ��򣬽��ַ����зֳ����ɲ���
ע������ʵ����������ʽ��
*/
public class Demo7StringSplit {
    public static void main(String[] args) {
        String str1="aaa bbb ccc ddd";
        String[] array1=str1.split(" ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("=================");
        String str2="aaa.bbb.ccc.ddd";
        //"."�����򻯱��ʽ�������⺬�塣
        String[] array2=str2.split("\\.");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
