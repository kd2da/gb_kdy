package javaexam_kdy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution07 {

//	7. 문제의 내용을 꼼꼼히 읽고 프로그래밍 하시오.
//	7-1. Calc 클래스를 생성 한다.
//	7-2. private 접근제어의 String 타입의 전역변수 생성하고 getter, setter, 파라미터가 있는 생성자를 생성한다.
//	7-3. int 타입의 파라미터를 2개받아와서 int 타입의 덧셈의 결과를 return해주는 메서드를 생성 한다.
//	7-4. int 타입의 파라미터를 2개받아와서 int 타입의 뺄셈의 결과를 return해주는 메서드를 생성 한다.
//	7-5. int 타입의 파라미터를 2개받아와서 int 타입의 곱셈의 결과를 return해주는 메서드를 생성 한다.
//	7-6. int 타입의 파라미터를 2개받아와서 int 타입의 나눗셈 몫의 결과를 return해주는 메서드를 생성한다.
//	7-7. main 메서드를 포함하는 클래스를 생성 한다.
//	7-8. 2개의 정수를 입력 받는다.(스캐너 or 변수선언 둘 다 가능)
//	7-9. 입력 받은 정수를 각각 출력 한다.
//	7-10. main 메서력 받은 정수를 각각 출력 한다.드에서 Calc 클래스 객체 생성시 본인의 이름을 매개변수 값으로 넘긴다.
//	7-11. main 메서드에서 본인의 이름을 출력한다.
//	7-12. Calc 클래스 객체를 사용하여 plus, minus 메소드를 사용하여 사칙 연산
//	결과를 각각 출력 한다.
//	7-13. Calc 클래스 객체를 사용하여 times, divide 메소드를 사용하여 사칙 연산 결과를 각각 출력 한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int num1 = sc.nextInt();
			System.out.println("num1 : " + num1);
			int num2 = sc.nextInt();
			System.out.println("num2 : " + num2);
			Calc calC = new Calc("고대열");
			
			System.out.println(calC.getMember());
			
			System.out.println(num1 + " + " + num2 + " = " + calC.plus(num1, num2));
			System.out.println(num1 + " - " + num2 + " = " + calC.minus(num1, num2));
			System.out.println(num1 + " * " + num2 + " = " + calC.times(num1, num2));
			System.out.println(num1 + " / " + num2 + " = " + calC.divide(num1, num2));
			
		} catch(InputMismatchException e) {
			e.printStackTrace();
			System.out.println("int 형의 데이터를 입력하시오.");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("알수 없는 에러 발생");
		} finally {
			sc.close();
		}
		
	}

}
