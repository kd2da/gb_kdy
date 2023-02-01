package wrapperclass;

public class Main01 {

	public static void main(String[] args) {
		String a = "20";
		String b = "3.14";
		
		// 문자열을 실제 데이터 형으로 변환하는 기능
		int num_a = Integer.parseInt(a);
		float num_b = Float.parseFloat(b);

		// 변환된 값은 사칙 연산이 가능하다.
		int v1 = num_a + 100;
		float v2 = num_b + 100;
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);
		
		System.out.println(num_a + num_b);
		
		// 기본 데이터형의 객체화
		// deprecated : 추후 자바 버전 업그레이드 될 때 문제가 될 수 있는 부분
		Integer i = new Integer(100);
		
	}

}
