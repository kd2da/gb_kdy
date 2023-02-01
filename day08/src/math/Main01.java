package math;

/*
 * API문서에 java.lang.Math 클래스에 대한 설명을 볼 수 있다.
 * - 수학 관련된 메서드들을 갖고 있는 클래스
 * - 모든 메서드들이 static 형태이기 때문에, 객체를 생성할 필요가 없다.
 */


public class Main01 {

	public static void main(String[] args) {
		// 주어진 두 수에 대한 최대값 구하기
		int max = Math.max(100, 9000);
		System.out.println("최대값 = " + max);
		
		// 주어진 두 수에 대한 최소값 구하기
		int min = Math.min(100, 9000);
		System.out.println("최소값 = " + min);
		
		// 주어진 수에 대한 절대값 구하기
		int abs = Math.abs(-123);
		System.out.println("절대값 = " + abs);
		
		// 소수점 반올림
		long num = Math.round(3.123456);
		System.out.println("반올림 = " + num);
		
		// 원주율
		System.out.println("원주율 = " + Math.PI);
		
		// 지수
		double pow = Math.pow(2, 4);
		System.out.println("지수 = " + pow);
		
		// 제곱근
		double sqrt = Math.sqrt(4);
		System.out.println("제곱근 = " + sqrt);
	}

}
