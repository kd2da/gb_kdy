package main;

import omok.Omokpan;
import omok.Panjung;
import omok.InputPlayer;

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
		Panjung panJung = new Panjung();
		
		String bDol = "●";
		String wDol = "○";
		
		InputPlayer blackPlayer = new InputPlayer(bDol);
		InputPlayer whitePlayer = new InputPlayer(wDol);
		
		String winPlayer = "";
		
		while(true) {
			
			
			blackPlayer.playerInputRowCol();
			omokPan.showPan();
			panJung.setPan(omokPan.getPan());
			panJung.setRowInt(omokPan.getCurrentRowNum());
			panJung.setColInt(omokPan.getCurrentColNum());
			
			// 승리 여부 판정 
			if(panJung.allCheck()) {
				winPlayer = bDol;
				break;
			}
			
			whitePlayer.playerInputRowCol();
			omokPan.showPan();
			panJung.setPan(omokPan.getPan());
			panJung.setRowInt(omokPan.getCurrentRowNum());
			panJung.setColInt(omokPan.getCurrentColNum());
			
			// 승리 여부 판정 
			if(panJung.allCheck()) {
				winPlayer = wDol;
				break;
			}
			
		}
		System.out.println("플레이어 " + winPlayer + " 가 이겼습니다.");
		
		blackPlayer.closeScanner();
		whitePlayer.closeScanner();
	}

}
