package day07.demo;
/*
��Ŀ:
����һ��������������{1��2��3}����ָ����ʽƴ�ӳ�һ���ַ�������ʽ��������
[word1#word2#word3]
*/
public class practice01 {
    public static void main(String[] args) {
        int [] array={1,2,3};

        System.out.println(fromArrayToString(array));

    }

    public static String fromArrayToString(int[] array) {

        String str="[";
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1){
                //����ת����string+int->string
                str+="world"+array[i]+"]";
            }else {
                str += "world" + array[i] + "#";
            }

        }

            return str;
    }
}