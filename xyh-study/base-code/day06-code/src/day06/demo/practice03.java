package day06.demo;

import java.util.ArrayList;

/*
��Ŀ������һ����ӡ���Ϸ�������ArrayList������Ϊ���󣩣�
ʹ��{}���𼯺ϣ�ʹ��@�ָ�ÿ��Ԫ��
��ʽ���գ�{Ԫ��1@Ԫ��2@Ԫ��3}
*/
public class practice03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("lisa");
        list.add("Dora");
        list.add("Marry");
        list.add("Tommy");
        printArray(list);
        System.out.println();
        System.out.println(list);


    }

    public static void printArray(ArrayList<String> list) {
        int len = list.size();
        System.out.print("{");
        for (int i = 0; i < len; i++) {
            System.out.print(list.get(i) + "@");
            if (i == len - 1) {
                System.out.print(list.get(i));
            }
        }
        System.out.print("}");
    }
}
