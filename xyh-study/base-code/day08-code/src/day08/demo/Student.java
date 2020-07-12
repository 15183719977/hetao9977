package day08.demo;

public class Student {
    //����
    private String name;
    //����
    private int age;
    //���ڽ���(ͬ��ͬѧ);
    private int id;

    static String room;
    //������
    private static int idCounter=0;//ѧ�ż�������ÿ�������¶���ʱ��������++
    //�޲ι���
    public Student(){
        idCounter++;
    }
    //�вι���
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id=++idCounter;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
