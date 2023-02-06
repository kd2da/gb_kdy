package main;

import omokpan.PrintOmokPan;

public class Main {

	public static void main(String[] args) {
		PrintOmokPan printOmokPan = PrintOmokPan.getInstance();
//		printOmokPan.printOmokPan(printOmokPan.getOmokPan());
		
		String[][] temp = printOmokPan.getOmokPan();
		printOmokPan.printDefault(temp);
		

		temp[1][1] = "1";
		temp[2][2] = "1";
		temp[3][3] = "1";
		temp[4][4] = "1";
		temp[5][5] = "1";
		/*
		 * while 무한루프를 통해서 Player1, Player2 입력 값을 계속 진행하고
		 * 각 플레이어가 수를 둘 때마다 boolean checkWin() 메서드를 통해서 true 값일 때 break 를 수행해서 
		 * 무한루프문을 빠져 나오게 한다. 
		 */
		
		
		printOmokPan.setOmokPan(temp);
		
		printOmokPan.printOmokPan(printOmokPan.getOmokPan());
	}

}
