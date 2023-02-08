package omokrole;

import omokpan.PrintOmokPan;

public class omokRole1 {
	
	
	// 승리 룰 체크
	// 오목 승리 룰 판정시, true 리턴
	public boolean checkRole(String playerNum, int cRowNum, int cColNum){
		
		int temp = cRowNum;
		
		PrintOmokPan omokPan = PrintOmokPan.getInstance();
		
		// 위, 아래 (행)
		// {-1,0} , {1,0}
		int cnt = 1;
		while(true) {
			--temp;
			if( omokPan.getOmokPan()[temp][cColNum] == null
					||!omokPan.getOmokPan()[temp][cColNum].equals(playerNum)) {
				break;
			} else cnt++;
		}
		temp = cRowNum;
		while(true) {
			++temp;
			if(omokPan.getOmokPan()[temp][cColNum] == null
					|| !omokPan.getOmokPan()[temp][cColNum].equals(playerNum)) {
				break;
			} else cnt++;
		}
		System.out.println(cRowNum + "  " + cColNum + "  " + cnt);
		if(cnt == 5) {
			return true;
		}
		
		// 왼쪽, 오른쪽 (열)
		
		// 우 상향 대각선 (행 + 열)
		
		// 우 하향 대각선 (행 + 열)
		
		return false;
	}
	
	// 3 X 3 룰 체크
	
	
}
