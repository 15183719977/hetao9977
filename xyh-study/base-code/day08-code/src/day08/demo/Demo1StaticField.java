package day08.demo;
/*static���������ԣ�����*/
public class Demo1StaticField {
    public static void main(String[] args) {

        Student one=new Student("����",19);
        Student two=new Student("����",16);
        //���������ͬһ������
        one.room="101";
        System.out.println("������"+one.getName()+",���䣺"+one.getAge()+",���ң�"+one.room+",ѧ�ţ�"+one.getId());
        System.out.println("������"+two.getName()+",���䣺"+two.getAge()+",���ң�"+two.room+",ѧ�ţ�"+two.getId());


    }




}
