package day08.demo;
/*static�ڴ��е����*/
public class Demo3StaticStudent {
    public static void main(String[] args) {
        /*���ڷ������е����ľ�̬����*/
        Student.room="101����";
        Student one=new Student("����",20);
        System.out.println("one��������"+one.getName());
        System.out.println("one�����䣺"+one.getAge());
        System.out.println("one�Ľ�ʦ��"+Student.room);
        System.out.println("=======================");
        /*���������Ʒ��ʳ�Ա���������û��ϵ*/
        Student.room="101����";
        Student two=new Student("����",18);
        System.out.println("two��������"+two.getName());
        System.out.println("two�����䣺"+two.getAge());
        System.out.println("two�Ľ�ʦ��"+Student.room);
    }
}
