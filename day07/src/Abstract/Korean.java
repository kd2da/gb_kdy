package Abstract;

// 추상 클래스를 상속받는 과정은 일반 클래스의
// 상속 과정과 동일하게 'extends' 키워드를 사용한다.
public class Korean extends Hello {
	
	//부모클래스의 파라미터 있는 생성자를 정의
	public Korean(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}
	
	//추상클래스의 메서드를 Override 하라는 자동 구현
	/*
	 * 추상 메서드를 상속 받고 에러를 해결하는 과정에서
	 * 부모가 정의하고 있는 메서드들을 재정의하게 된다.
	 * 추상 클래스는 이와 같이 자식 클래스가 정의해야 하는
	 * 규격을 강제하기 위하여 사용한다.
	 */
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		
	}

}
