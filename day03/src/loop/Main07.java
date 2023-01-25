package loop;

public class Main07 {

	public static void main(String[] args) {
		/*
		 * 구구단 7단
		 * 7
		 * 14
		 * ...
		 * 63
		 */
		
		int i = 1;
		do {
			System.out.println(7*i++);
		} while (i<10);
	}

}
