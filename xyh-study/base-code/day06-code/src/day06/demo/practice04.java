package day06.demo;
/*
��Ŀ����һ���󼯺ϴ���20���������Ȼ��ɸѡ���е�ż��Ԫ�أ��ŵ�С���ϵ��С�
Ҫ��ʹ���Զ���ķ�����ʵ��
* */

import java.util.ArrayList;
import java.util.Random;

public class practice04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int j = 0; j < 20; j++) {
            list.add(r.nextInt(100));
        }
        ArrayList<Integer> result = selectEven(list);
        System.out.println(result);
    }

    public static ArrayList<Integer> selectEven(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num % 2 == 0) {
                result.add(num);
            }
        }
        return result;

    }
}
