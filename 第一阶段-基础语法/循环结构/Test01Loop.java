public class Test01Loop{
	
	public static void main(String[] args){
		forMethod();
		whileMethod();
		doWhileMethod();
		breakMethod();
		continueMethod();
	}
	
	//forѭ��
	public static void forMethod()
	{
		for(int i = 1;i <= 10;i++){
			System.out.println("for�Ҵ�����"+i);
		}
		System.out.println("forѭ��ֹͣ");
	}
	
	//whileѭ��
	public static void whileMethod()
	{
		int i = 1;
		while(i<=10){
			System.out.println("while�Ҵ�����"+i);
			i++;
		}
		System.out.println("whileѭ��ֹͣ");
	}
	
	//dowhileѭ��
	public static void doWhileMethod()
	{
		int i = 1;
		do{
			System.out.println("dowhile�Ҵ�����"+i);
			i++;
		}while(i<=10);
		System.out.println("dowhileѭ��ֹͣ");
	}
	
	//break
	public static void breakMethod()
	{
		for(int i = 1;i <= 10;i++){
			if(i == 4){
				break;
			}
			System.out.println("break�Ҵ�����"+i);
		}
		System.out.println("breakѭ��ֹͣ");
	}
	
	//continue
	public static void continueMethod()
	{
		for(int i = 1;i <= 10;i++){
			if(i == 4){
				continue;
			}
			System.out.println("continue�Ҵ�����"+i);
		}
		System.out.println("continueѭ��ֹͣ");
	}
}
