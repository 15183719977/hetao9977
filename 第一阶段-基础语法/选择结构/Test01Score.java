public class Test01Score{
	public static void main(String[] args){
		long score = 102L;
		if(score>100||score<0){
			System.out.println("�ɼ�����");
		}else if(score>=90&&score<=100){
			System.out.println("����");
		}
		else if(score>=80&&score<90){
			System.out.println("��");
		}
		else if(score>=70&&score<80){
			System.out.println("��");
		}
		else if(score>=60&&score<70){
			System.out.println("����");
		}
		else {
			System.out.println("������");
		}
	}
}