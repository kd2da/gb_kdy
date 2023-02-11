package main;

import java.io.Console;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;

import omok.Omokpan;

/*
 * 1. 오막판 Frame 2. 오목판에 행과 열 정보 그리기
 * 3. 플레이어 입력값을 가져온다
 * 4. 가져온 값을 오목판에 그린다.
 * 5. 승리 판정한다.
 * 6. 3 - 5 번을 반복해서 승리할 때까지 진행한다. 
 */

public class Main {

	public static void main(String[] args) {
		
		Omokpan omokPan = Omokpan.getInstance();
		
		omokPan.printDefault();
		omokPan.showPan();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("플레이어 1");
			System.out.print("행 입력 : ");
			String rowPlayer = sc.next();
			System.out.print("열 입력 : ");
			String colPlayer = sc.next();
			omokPan.printPan("1", rowPlayer, colPlayer);
			omokPan.showPan();
			
			
			// 승리 여부 판정 
			if(false) {
				break;
			}
			
			System.out.println("플레이어 2");
			System.out.print("행 입력 : ");
			rowPlayer = sc.next();
			System.out.print("열 입력 : ");
			colPlayer = sc.next();
			omokPan.printPan("2", rowPlayer, colPlayer);
			omokPan.showPan();
			
			// 승리 여부 판정 
			if(false) {
				break;
			}
			
			
			
			break;
		}
	}

}
