package test;

import java.util.Random;
import java.util.Scanner;

public class GuGuQuizTest {

	public static void main(String[] args) {
		/*
		 * break 문 사용 예제
		 */
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("구구단 문제를 맞추세요. 그만하려면 0 입력");
			int a = ran.nextInt(9)+1;
			int b = ran.nextInt(9)+1;
			
			
			System.out.print(a + " * " + b + " = ");
			
			int answer = sc.nextInt();
			
			if(answer == 0) break;
			
			else {
				if( a * b == answer) {
					System.out.println("정답입니다.");
				} else {
					System.out.println("떙! 정답은 바로바로 ~ " + a * b + " 입니다.");
				}
			}
		}
		sc.close();
	}

}
