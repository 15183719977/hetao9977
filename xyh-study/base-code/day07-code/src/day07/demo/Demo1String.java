package day07.demo;
/*
String��
java.lang.String
����������˫�����ַ���������String��Ķ���
�ַ������ص㣺
1.�ַ����ǳ��������ݲ��ɱ�
2.�ַ������Թ���ʹ��
3.�ַ���Ч���൱��char[]�ַ����飬���ǵײ�ԭ����byte[]�ֽ�����
�����ַ����ĳ���3+1�ַ�ʽ
���ֹ��췽��
public String():����һ���հ��ַ������������κ�����
public String(char[] array):�����ַ���������ݣ���������Ӧ���ַ���
public String(byte[] array):�����ֽ���������ݣ���������Ӧ���ַ���
һ��ֱ�Ӵ���
String str="hello";
*/
public class Demo1String {
    public static void main(String[] args) {
        //�������ַ���
        String str1=new String();
        System.out.println("��һ���ַ����ǣ�"+str1);
        //�����ַ����鴴���ַ���
        char[] charArray={'A','B','C'};
        String str2=new String(charArray);
        System.out.println("�ڶ����ַ����ǣ�"+str2);
        //�����ֽ����鴴���ַ���
        byte[] byteArray={97,98,99};
        String str3=new String(byteArray);
        System.out.println("�������ַ����ǣ�"+str3);
        //ֱ�Ӵ���������new��new����һ���ַ�������
        String str4="hello";
        System.out.println("���ĸ��ַ����ǣ�"+str4);




    }
}
