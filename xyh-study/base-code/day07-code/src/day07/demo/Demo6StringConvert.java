package day07.demo;
/*
String ������ת����صĳ��÷���

public char[] toCharAarray():����ǰ�ַ�����ֳ�Ϊ�ַ�������Ϊ����ֵ
public byte[] getBytes():��ȡ��ǰ�ַ����ײ���ֽ�����
public String replace(CharSequence oldString,CharSequence newString)��
�����г��ֵ����ַ����滻�����ַ����������滻֮��Ľ�����ַ���
ע��CharSequence���Խ����ַ�������
*/
public class Demo6StringConvert {
    public static void main(String[] args) {
        char [] chars="Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("======================");
        byte[] bytes="abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("======================");
        String str1 ="How do you do ?";
        String str2=str1.replace("o","*");
        System.out.println(str1);
        System.out.println(str2);
    }
}
