package day08.demo;

public class myclass {
    //��Ա����
    String var="��Ա����";
    //��̬����
    static String  varStatic="��̬����";
    //��Ա����
    public void  method(){
        System.out.println("����һ����ͨ�ĳ�Ա���������Է���");
        //��Ա�������Է��ʳ�Ա����
        System.out.println(var);
        //��Ա�������Է��ʾ�̬����
        System.out.println(varStatic);
    }
    //��̬����
    public static void methodStatic(){
        System.out.println("����һ����̬���������Է���");
        //��̬�������ܷ��ʳ�Ա����
        //System.out.println();
        //��̬�����ܷ��ʾ�̬����
        System.out.println(varStatic);
    }
}
