package day08.demo;
/*
static���γ�Ա��������̬�������������ڶ���������
ע��
1.���û��static�ؼ��֣���ô�������ȴ�������Ȼ��ͨ���������ʹ����
2.�����ǳ�Ա�������ǳ�Ա�����������static���Σ��Ƽ�ʹ���������е���
��̬����������.��̬����
��̬����������.��̬����()
ע�����
1.��̬����ֱ�ӷ��ʷǾ�̬
��Ϊ���ڴ������о�̬���зǾ�̬������֪�����ˣ����˲�֪�����ˡ�
2.��̬�����в�����this�ؼ���
��Ϊthis����ǰ���󡣵��Ǿ�̬����������޹�
*/
public class Demo2StaticMethod {
    public static void main(String[] args) {
        //��Ա����
        myclass obj=new myclass();
        obj.method();
        //��̬�����ĵ��ã��Ƽ���
        myclass.methodStatic();
        //��̬�����ĵ��ã����Ƽ���
        obj.methodStatic();
        //�����Լ��ľ�̬������ʡ��������
        myMethod();
    }

    public static void myMethod(){
        System.out.println("����һ���Լ��ķ���");
    }
}
