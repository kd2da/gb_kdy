package Abstract;

// 추상 클래스
public abstract class Hello {
	// 멤버변수, 생성자, getter, setter 는 기존 그대로 사용할 수 있다.
	private String msg;


	public Hello(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	// 추상 메서드는 선언만 되고,
	// {...} 구현부를 위한 블록이 없다.
	public abstract void sayHello() ;

}
