
/*
��1-100����ż����
*/
public class Demo12HundredSum{
	public static void main(String [] args){
		int sum=0;
		
		//forѭ��
		for(int i=1;i<=100;i++){
			if(i%2==0){
				sum+=i;
			}
		}
		System.out.println("forѭ��1-100����ż��֮��Ϊ��"+sum);
		System.out.println("===================");
		
		//whileѭ��
		int j=1;
		sum=0;
		while(j<=100){
			if(j % 2==0){
				sum+=j;
			}
			j++;
		}
		System.out.println("whileѭ��1-100����ż��֮��Ϊ��"+sum);
		
		System.out.println("===================");
		//do-whileѭ��
		sum=0;
		int k=1;
		do{
			if(k%2==0){
				sum+=k;
			}
			k++;
		}while(k<=100);
		System.out.println("do-whileѭ��1-100����ż��֮��Ϊ��"+sum);
	}
}