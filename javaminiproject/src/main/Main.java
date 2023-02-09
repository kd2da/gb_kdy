package main;

import java.util.Scanner;

import omokpan.PrintOmokPan;
import omokrole.omokRole1;

public class Main {

	public static void main(String[] args) {
		PrintOmokPan printOmokPan = PrintOmokPan.getInstance();
//		printOmokPan.printOmokPan(printOmokPan.getOmokPan());

		printOmokPan.printDefault(printOmokPan.getOmokPan());		
		
		omokRole1 or = new omokRole1();
		
		printOmokPan.stringToInt("7", "H");
		printOmokPan.printPlayer("1", printOmokPan.getCurrentRowNum(), printOmokPan.getCurrentColNum());
//		System.out.println(or.checkRole("1" ,printOmokPan.getCurrentRowNum(), printOmokPan.getCurrentColNum()));
		printOmokPan.stringToInt("8", "H");
		printOmokPan.printPlayer("1", printOmokPan.getCurrentRowNum(), printOmokPan.getCurrentColNum());
//		System.out.println(or.checkRole("1" ,printOmokPan.getCurrentRowNum(), printOmokPan.getCurrentColNum()));
		printOmokPan.stringToInt("9", "H");
		printOmokPan.printPlayer("1", printOmokPan.getCurrentRowNum(), printOmokPan.getCurrentColNum());
//		System.out.println(or.checkRole("1" ,printOmokPan.getCurrentRowNum(), printOmokPan.getCurrentColNum()));
		printOmokPan.stringToInt("10", "H");
		printOmokPan.printPlayer("1", printOmokPan.getCurrentRowNum(), printOmokPan.getCurrentColNum());
//		System.out.println(or.checkRole("1" ,printOmokPan.getCurrentRowNum(), printOmokPan.getCurrentColNum()));
		printOmokPan.stringToInt("11", "H");
		printOmokPan.printPlayer("1", printOmokPan.getCurrentRowNum(), printOmokPan.getCurrentColNum());
		System.out.println(printOmokPan.getCurrentRowNum() + " " + printOmokPan.getCurrentColNum());
		System.out.println(or.checkRole("1" ,6, 8));
		printOmokPan.stringToInt("1", "H");
		printOmokPan.printPlayer("2", printOmokPan.getCurrentRowNum(), printOmokPan.getCurrentColNum());
		printOmokPan.stringToInt("2", "I");
		printOmokPan.printPlayer("2", printOmokPan.getCurrentRowNum(), printOmokPan.getCurrentColNum());
		printOmokPan.stringToInt("3", "J");
		printOmokPan.printPlayer("2", printOmokPan.getCurrentRowNum(), printOmokPan.getCurrentColNum());
		printOmokPan.stringToInt("4", "K");
		printOmokPan.printPlayer("2", printOmokPan.getCurrentRowNum(), printOmokPan.getCurrentColNum());
		printOmokPan.stringToInt("5", "L");
		printOmokPan.printPlayer("2", printOmokPan.getCurrentRowNum(), printOmokPan.getCurrentColNum());

//		
//		Scanner sc = new Scanner(System.in);
		
//		
//		String player1_row;
//		String player1_col;
//		String player2_row;
//		String player2_col;
//		int i = 0;
//		while(true) {
//			i++;
//			System.out.print("플레이어 1의 행 입력 : ");
//			player1_row = sc.next();
//			System.out.print("플레이어 1의 열 입력 : ");
//			player1_col = sc.next();
//			
//			// 2차원 배열에 입력 메서드 수행
//			printOmokPan.printPlayer("1", player1_row, player1_col);
//			// 오목 규칙에 따라 승리 여부 판단
//			
//			// 승리 못했을 시, 플레이어 2 입력 진행
//			System.out.print("플레이어 2의 행 입력 : ");
//			player2_row = sc.next();
//			System.out.print("플레이어 2의 열 입력 : ");
//			player2_col = sc.next();
//			
//			printOmokPan.printPlayer("2", player2_row, player2_col);
//			if(i == 5) {
//				break;
//			}
//		}
		/*
		 * while 무한루프를 통해서 Player1, Player2 입력 값을 계속 진행하고
		 * 각 플레이어가 수를 둘 때마다 boolean checkWin() 메서드를 통해서 true 값일 때 break 를 수행해서 
		 * 무한루프문을 빠져 나오게 한다. 
		 */
		
		
		
		printOmokPan.printOmokPan(printOmokPan.getOmokPan());
		

	}

}
