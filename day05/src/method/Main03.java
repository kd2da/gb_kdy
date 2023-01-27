package method;

public class Main03 {

	public static void main(String[] args) {
		int result = plus(10,20);
		
		System.out.println(result);
		System.out.println(minus(50,25));
	}
	
	public static int plus(int x, int y) {
		return x + y;
	}
	
	// minus, int x, int y, return x-y
	// main에서 minus 호출하는 결과값 출력
	
	public static int minus(int x, int y) {
		return x -y;
	}
}
