package day07.demo;

/*

==�ǽ����ַ����ĵ�ֵַ�Ƚ�
��Ҫʹ���ַ������ݱȽϣ���������������
1.public boolean equals(Object obj)
�����������κζ���ֻ��������һ���ַ�������������ͬʱ�Ż᷵��ture�����򷵻�false
2.public booliean equalsIngnoreCase(String str)
���Դ�Сд�Ƚ��ַ������ݣ�ֻ�к���Ӣ����ĸ�Ĵ�Сд
ע��
1.�κζ��󶼿���ʹ��Object���н���
2.equals�������жԳ��ԣ���a.equals(b) ��b.equals(a)Ч��һ��
3.����Ƚ��Ϸ�һ������һ�������Ƽ��ѳ����ַ���д��ǰ��"abc".equals(str1)
 */
public class Demo3StringEquals {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        char[] array = {'h', 'e', 'l', 'l', 'o'};
        String str3 = new String(array);

        System.out.println(str1.equals(str2));//ture
        System.out.println(str1.equals(str3));//ture
        System.out.println(str2.equals("hello"));//ture
        System.out.println("hello".equals(str1));//true
        System.out.println(str1.equals("Hello"));//false
        System.out.println("==================================");

        String str5 = null;
        //�Ƽ�д��
        System.out.println("abc".equals(str5));//false
        //���Ƽ�д��
        //System.out.println(str5.equals("abc"));//������ָ���쳣NullPointerException
        System.out.println("==================================");
        System.out.println("java".equalsIgnoreCase("jAVA"));//ture
    }

}
