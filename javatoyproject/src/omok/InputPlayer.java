package omok;

import java.util.Scanner;

public class InputPlayer {
	
	Scanner sc = new Scanner(System.in);
	
	private String pName;
	
	public InputPlayer(String pName) {
		super();
		this.pName = pName;
	}

	public void playerInputRowCol() {
		
		while(true) {
			
			System.out.println("[[[[[[[[플레이어 "+ this.pName +"]]]]]]]]");
			
			System.out.print("행 입력 : ");
			String rowPlayer = sc.next();
			
			System.out.print("열 입력 : ");
			String colPlayer = sc.next();
			
			TransInfo.getInstance().stringToInt(rowPlayer, colPlayer);
			
			boolean result = Omokpan.getInstance().printPan(this.pName);
			if(result) break;
			System.out.println(" 행/열 정보를 다시 입력해주세요.");
			
		}
	}
	public void closeScanner() {
		sc.close();
	}
	
}
