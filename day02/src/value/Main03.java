package value;

public class Main03 {

	public static void main(String[] args) {
		//일반 변수
		int width = 100;
		
		//상수
		final double PI = 3.14D;
		
		
		System.out.println("width : " + width);
		System.out.println("PI : " + PI);
		
		// 값의 변경
		width = 200;
		System.out.println("width = " + width);
		
		//이 라인은 상수이기 때문에 에러가 발생
		//PI = 3.141582D;
		
		System.out.println("PI : " + PI);
	}

}
