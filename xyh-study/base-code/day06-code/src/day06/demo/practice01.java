package day06.demo;

import java.util.ArrayList;
import java.util.Random;

/*
��Ŀ������6��1-33֮������������ӵ����ϣ�����������
* */
public class practice01 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add(r.nextInt(33) + 1);

        }
        //��������
        for (int i = 0; i < list.size(); i++) {
            System.out.println("��" + i + "�������ǣ�" + list.get(i));
        }
    }
}
