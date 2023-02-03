package scanner;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("int type 입력 : ");
		int i = scanner.nextInt();
		System.out.println("int 결과 : " + i);
		
		System.out.print("double type 입력 : ");
		double d = scanner.nextDouble();
		System.out.println("double 결과 : " + d);
		
		System.out.println("String type 입력 : ");
		String s = scanner.next();
		System.out.println("String 결과 : " + s);
		
		
		
		// 메모리 낭비를 줄일 수 있다.
		// 한번 닫으면 해당 소스에서 다시 열어서 사용할 수 없다.
		// static 으로 선언해서 한번만 닫는 방법 고안해보기
		scanner.close();
		
	}

}
