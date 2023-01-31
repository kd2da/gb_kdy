package boxing;
/* 3시 15분까지
 * - Unit 부모 클래스 상속
 * - attack() -> override, 부모 메서드 호출
 * - 독자적인 메서드 -> nucleus()
 */
public class Navy extends Unit {

	public Navy(String name) {
		super(name);
	}
	
	@Override
	public void attack() {
		super.attack();
		System.out.println(super.getName() 
				+ ">> 어뢰 발사!!");
	}
	
	public void nucleus() {
		System.out.println(super.getName() 
				+ ">> 핵미사일");
	}

}













