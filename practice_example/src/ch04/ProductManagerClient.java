package ch04;

import java.util.Scanner;

public class ProductManagerClient {
	
	private final String line = "**********************************************************";
	String mainMenu = "현황조회(L)\t상품등록(R)\t상품판매(S)\t종료(X)\t";
	Scanner scanner = new Scanner(System.in);
	
	public void displayMainMenu() {
		
		while(true) {
			System.out.println(line);
			System.out.println(mainMenu);
			System.out.println(line);
			String st = scanner.next();
			if(st.equalsIgnoreCase("X")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			switch(st){
			case "L":
				System.out.println("현황을 조회합니다.");
				break;
			case "R":
				System.out.println("상품을 등록합니다.");
				break;
			case "S":
				System.out.println("상품을 판매합니다.");
				break;
			default :
				System.out.println("잘못 입력했습니다.");
			}
		}		
		
	}	
	
	public static void main(String[] args) {
		ProductManagerClient PC = new ProductManagerClient();
		PC.displayMainMenu();
	}

}
