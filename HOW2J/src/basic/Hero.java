package basic;

public class Hero {

	String name;
	float hp;
	float armor;
	int moveSpeed;
	
	int killed=0;
	int dead=0;
	int assist=0;
	int gold=0;

	void keng(int k,int d){
		if (k < d) {
			System.out.println("�Ӷ��ѵ���!");
		}
		if (k >= d) {
			System.out.println("�����ѵ���!");
		}
	}
	
	void lengendary(){
		if (killed > 9) {
			System.out.println("�����ˣ�");
		}
		if (dead > 9) {
			System.out.println("�����ˣ�");
		}
	}
	
	
	float getArmor(){
		return armor;
	}
	
	void addSpeed(int speed){
		moveSpeed = moveSpeed + speed;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero garen = new Hero();
		garen.name = "����";
		garen.hp = 500.00f;
		garen.armor = 400.00f;
		garen.moveSpeed = 330;
		garen.killed = 10;
		garen.dead = 1;
		garen.assist = 10;
		garen.gold = 3000;

		
		Hero teemo = new Hero();
		teemo.name = "��Ī";
		teemo.hp = 488.98f;
		teemo.armor = 399.88f;
		teemo.moveSpeed = 320;
		teemo.killed = 1;
		teemo.dead = 10;
		teemo.assist = 1;
		
		garen.keng(garen.killed, garen.dead);
		
		teemo.keng(teemo.killed, teemo.dead);
		
		System.out.println(teemo.armor);
		
		teemo.armor -= 100f;
		
		float temp = teemo.getArmor();
		
		System.out.println(temp);
		
		garen.addSpeed(100);
		System.out.println(garen.moveSpeed);
		
		garen.lengendary();
		
		teemo.lengendary();
	}
}
