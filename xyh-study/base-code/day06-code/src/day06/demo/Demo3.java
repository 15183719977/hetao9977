package day06.demo;

import java.util.ArrayList;

/*
ArrayList<e>������
<e>�����ͣ��������е�����Ԫ��ȫ����ͳһ������
ע�⣺
1.���ͱ������������ͣ������ǻ�������
�����д����ArrayList<int> list=new ArrayList<>();
��Ҫʹ��ArrayList�洢�������ͣ�����ʹ�ö�Ӧ�ġ���װ�ࡱ��λ��java.lang���£�
������    ��װ��
byte      Byte
short     Short
int       Integer   �����⡿
long      Long
float     Float
double    Double
char      Character �����⡿
boolean   Boolean

��JDK1.5+��ʼ��֧���Զ�װ�䡢�Զ�����
�Զ�װ�䣺��������->��װ����
�Զ����䣺��װ����->��������
2.ֱ�Ӵ�ӡArrayList����ʾ�Ĳ��ǵ�ַ�������ݣ���û����������[]

���÷����У�
public boolean add(E e),�򼯺������Ԫ�أ������뷺��һ��
public E get(int index),�Ӽ����л�ȡԪ�أ�������������ţ�����ֵ���Ƕ�Ӧλ�õ�Ԫ��
public E remove(int index),�Ӽ�����ɾ��Ԫ�أ�������������ţ�����ֵ���Ǳ�ɾ����Ԫ��
public int size(),��ȡ���ϵĳߴ糤�ȣ�����ֵ���Ǽ����е�Ԫ�ظ���

 */
public class Demo3 {

    public static void main(String[] args) {
        //ʹ�����飬���������ڼ䳤�Ȳ��ܷ����ı�
        Person[] array=new Person[3];
        Person one=new Person("����",18);
        Person two=new Person("����",8);
        Person three=new Person("����",28);
        array[0]=one;
        array[1]=two;
        array[2]=three;
        System.out.println(array[1].getName());
        //���ʹ��ArrayList
        ArrayList<String> list=new ArrayList<>();
        //ֱ�Ӵ�ӡArrayList����ʾ�Ĳ��ǵ�ַ�������ݣ���û����������[]
        System.out.println(list);

        //�򼯺������һЩ����
        list.add("����");
        System.out.println(list);
        //ArrayList���Ԫ��һ�����Գɹ��������������ϲ�һ��
        boolean success=list.add("����");
        list.add("����");
        System.out.println(list);
        System.out.println("�Ƿ���ӳɹ���"+success);

        //�Ӽ����ܻ�ȡԪ�أ�����ֵ��0��ʼ
        System.out.println("=========================");
        System.out.println("��һ��λ���ǣ�"+list.get(0));
        //�Ӽ�����ɾ��Ԫ��
        System.out.println("=========================");
        String whoRemoved=list.remove(0);
        System.out.println("��ɾ�������ǣ�"+whoRemoved);
        System.out.println(list);
        //��ȡ���ϵĳ���
        System.out.println("=========================");
        System.out.println("���ϵĳ����ǣ�"+list.size());
        //��������
        System.out.println("=========================");
        for (int i = 0; i < list.size(); i++) {
            String name=list.get(i);
            System.out.println(name);
        }
        //�洢int��������
        System.out.println("=========================");
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(100);
        list1.add(200);
        System.out.println(list1);





    }

}
