package multi;

public class Main04 {

	public static void main(String[] args) {
		// 구구단 2단 ~ 9단 까지 결과 값만을 출력
		/*
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * ...
		 * 2 * 9 = 18
		 * ----------
		 * 3 * 1 = 3
		 * ...
		 * 3 * 9 = 27
		 * ----------
		 * ...
		 * 
		 */
		
		
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println("-----------");
		}

	}

}
