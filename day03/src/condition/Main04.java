package condition;

public class Main04 {

	public static void main(String[] args) {
		int point = 55;
		
		/* 25분까지
		 * 만약 point가 90 초과이고, 100 이하 이면 "A" 출력
		 * 만약 point가 80 초과이고, 90 이하 이면 "B" 출력
		 * 만약 point가 70 초과이고, 80 이하 이면 "C" 출력
		 * 나머지 "F" 출력
		 */
		
		if( 90 < point && point <= 100 ) {
			System.out.println("A");
		} else if( 80 < point && point <= 90 ) {
			System.out.println("B");
		} else if( 70 < point && point <= 80 ) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
		
		
		
	}

}






