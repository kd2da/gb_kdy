package Abstract;


/*
 * Navy, AirForce class 생성
 *  -> unit 상속
 *  -> move, attack 재작성
 */
public class Main01 {

	public static void main(String[] args) {
		Army army = new Army("육군");
		Navy navy = new Navy("해군");
		AirForce airForce = new AirForce("공군");
		
		army.move();
		army.attack();
		
		navy.move();
		navy.attack();
		
		airForce.move();
		airForce.attack();

	}

}
