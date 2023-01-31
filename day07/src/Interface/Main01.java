package Interface;

public class Main01 {
	public static void main(String[] args) {
		
		Monster mon = new Monster("몬스터");
		Character ch = new Character("캐릭터");
		
		ch.walk();
		ch.walk();
		ch.run();
		ch.attack();
		ch.shield();
		ch.attack();
		ch.shield();
		ch.pickup();
		
		System.out.println("-----------------");
		
		mon.walk();
		mon.run();
		mon.walk();
		mon.run();
		mon.attack();
		mon.shield();
		mon.attack();
		
	}

}
