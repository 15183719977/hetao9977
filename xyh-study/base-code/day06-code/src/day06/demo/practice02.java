package day06.demo;

import java.util.ArrayList;

//�Զ���4��ѧ��������Ӽ��ϣ�������
public class practice02 {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        //�����ĸ�ѧ������
        Student one = new Student("lisa:", 88.8);
        Student two = new Student("Dora:", 96.5);
        Student three = new Student("Marry:", 63);
        Student four = new Student("Linda:", 75);

        //��ӵ�������
        studentList.add(one);
        studentList.add(two);
        studentList.add(three);
        studentList.add(four);

        //��������
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).getName() + " "
                    + studentList.get(i).getGrade());
        }


    }
}
