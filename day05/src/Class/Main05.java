package Class;

/*
 *  계산기 클래스 생성
 *  +, -, /, * 메서드 각각 생성, 파라미터 두개(int x, int y)
 *  main() => 각각의 메서드 결과 출력
 */

class Calculate {
	
	int plus(int x, int y) {
		return x + y;
	}	
	int minus(int x, int y) {
		return x - y;
	}
	int multi(int x, int y) {
		return x * y;
	}
	int div(int x, int y) {
		if(y != 0 ) {
			return x / y;
		} else {
			return 0;			
		}
	}
	
}


public class Main05 {

	public static void main(String[] args) {
		Calculate calc = new Calculate();
		
		System.out.println(calc.plus(128, 2));
		System.out.println(calc.minus(128, 2));
		System.out.println(calc.multi(128, 2));
		System.out.println(calc.div(128, 0));
	}

}
