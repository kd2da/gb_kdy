package Abstract;

public class AirForce extends Unit{

	public AirForce(String name) {
		super(name);
	}
//파라미터 있는 생성자
//부모 클래스의 구현되지 않는 메서드

	@Override
	public void attack() {
		System.out.println(super.getName() 
				+ ">> 지상 공격");
	}

	@Override
	public void move() {
		System.out.println(super.getName()
				+ ">> 지상 이동");
	}
}
