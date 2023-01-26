package multi;

public class Main05 {

	public static void main(String[] args) {
		// 문1.
		// 구구단 결과값을 출력, 2중 while문 으로 출력(2단 ~9단)
		System.out.println("문제 1번");
		
		int i = 2;
		int j;
		while(i<10) {
			j = 1;
			while(j<10) {
				System.out.println(i * j);
				j++;
			}
			i++;
		}
		
		// 문2. for
		// 1~10까지의 숫자 합
		System.out.println("문제 2번");
		
		int sum = 0;
		for(int k = 1; k <= 10; k++) {
			sum += k;
		}
		System.out.println(sum);
		
		// 문3. for
		// 1~10까지의 홀수 합
		System.out.println("문제 3번");
		
		sum = 0;
		for(int k = 1; k <= 10; k++) {
			if(k%2==0) continue;
			sum += k;
		}
		System.out.println(sum);
		
		// 문4. for
		// 1~10까지의 짝수 합
		System.out.println("문제 4번");
		
		sum = 0;
		for(int k = 1; k <= 10; k++) {
			if(k%2==1) continue;
			sum += k;
		}
		System.out.println(sum);
		
		
		// 문5. (8X8)
		// ★★★★★★★★
		// ★★★★★★★★
		// ★★★★★★★★
		// ★★★★★★★★
		// ★★★★★★★★
		// ★★★★★★★★
		// ★★★★★★★★
		// ★★★★★★★★
		// System.out.println("");   -> ln 엔터
		// System.out.print("★");      -> 엔터없이 출력
		System.out.println("문제 5번");
		
		for(int k = 1; k < 9; k++) {
			for(int l = 1; l < 9; l++) {
				System.out.print("★");
			}
			System.out.println();
		}
		 
	      /*
	       * 문6.
	       * ★★★★★★★★
	         ★★★★★★★
	         ★★★★★★
	         ★★★★★
	         ★★★★
	         ★★★
	         ★★
	         ★
	       */
		System.out.println("문제 6번");
		
		for(int k = 8; k > 0; k--) {
			for(int l = k; l > 0; l--) {
				System.out.print("★");
			}
			System.out.println();
		}
		
	      /*
	       * 문7.
	       * ★
	         ★★
	         ★★★
	         ★★★★
	         ★★★★★
	         ★★★★★★
	         ★★★★★★★
	         ★★★★★★★★
	       */
		System.out.println("문제 7번");
		
		for(int k = 1; k < 9; k++) {
			for(int l = k; l > 0; l--) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		
	      /*
	       * 문8.while
	       * "10번찍어 안넘어 가는 나무 없다."
	       * [결과 값]
	       * 나무를 1번 찍었습니다.
	       * 나무를 2번 찍었습니다.
	       * ...
	       * 나무를 10번 찍었습니다.
	       * 나무가 넘어갑니다.
	       */
		System.out.println("문제 8번");
	    
		int p = 1;
		while(true) {
			System.out.printf("나무를 %d번 찍었습니다.\n", p);
			if(p == 10) {
				System.out.println("나무가 넘어갑니다.");
				break;
			}
			p++;
		}
	}

}
