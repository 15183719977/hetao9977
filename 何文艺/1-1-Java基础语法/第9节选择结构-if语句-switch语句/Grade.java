public class Grade {
    public static void main(String[] args) {
        int score = 100;
        if(score < 0 || score > 100) {
            System.out.println("��ĳɼ��Ǵ����!");
        } else if(score < 60) {
            System.out.println("������!");
        } else if(score < 70) {
            System.out.println("����");
        } else if(score < 80) {
            System.out.println("����");
        } else if(score < 90) {
            System.out.println("�ã�");
        } else {
            System.out.println("���㣡");
		}
    }
}