package method;

public class Main02 {

	public static void main(String[] args) {
		plus(10, 20);
		plus(20, 35);
		plus(60, 25);
		
		minus(6, 1);
	}
	
	public static void plus( int x, int y ) {
		int z = x + y;
		System.out.println(z);
	}
	
	//minus, int x, int y, x - y 의 결과값을 출력하는 메서드 생성
	//
	public static void minus( int x, int y) {
		System.out.println(x - y);
	}
}
