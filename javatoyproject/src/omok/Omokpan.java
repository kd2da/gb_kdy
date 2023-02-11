package omok;

public class Omokpan {
	/*
	 *  싱글톤 생성 시작
	 */
	private static Omokpan current = null;
	
	
	// 한 번 메모리에 객체를 생성하면
	// 추가적으로 새로운 객체를 생성하지 못하게 처리한다.
	// 데이터베이스에서 커넥션풀, 스레드풀, 캐시, 로그 기록 객체 등
	public static Omokpan getInstance() {
		if(current == null) {
			current = new Omokpan();
		}
		return current;
	}
	
	// 메모리 클리어할 때 사용
	public static void freeInstance() {
		current = null;
	}
	
	
	// 코드 구현을 통해(new ) 객체를 추가 생성하지 못하게 장치를 만듦. 
	private Omokpan() {}
	
	/*
	 *  싱글톤 생성 종료
	 */
	
	// 2차원 배열 선언 (고정적으로 사용)
	// 15 * 15 크기의 오목판이지만,
	// 행과 열의 정보를 담을 곳을 포함해서 16 * 16 배열 생성
	private final int ROW = 15;
	private final int COL = 15;
	private String[][] pan = new String[ROW+1][COL+1];
	
	private int currentRowNum;
	private int currentColNum;
	
	public int getCurrentRowNum() {
		return currentRowNum;
	}

	public void setCurrentRowNum(int currentRowNum) {
		this.currentRowNum = currentRowNum;
	}

	public int getCurrentColNum() {
		return currentColNum;
	}

	public void setCurrentColNum(int currentColNum) {
		this.currentColNum = currentColNum;
	}

	public void showPan() {
		String[][] arr = this.pan;
		for(int j=0; j<arr[0].length; j++) {
			System.out.print("____ ");
		}
		System.out.println();

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j] == null) {
					System.out.print("    ");
				} else {
					System.out.printf(" %2s ",arr[i][j]);
				}
				System.out.print("|");
			}
			System.out.println();
			for(int k=0; k<arr[i].length; k++) {
				System.out.print("____|");
			}
			System.out.println("");
		}
	}
	
	public boolean printPan(String player, String rowNum, String colNum) {
		
		this.stringToInt(rowNum, colNum);
		
		// 입력 가능 범위를 벗어 났을 때 처리
		if(this.currentRowNum >= 0 && this.currentRowNum <= 14
				&& this.currentColNum >= 1 && this.currentColNum <= 15) {
			// 해당 위치에 수가 두어진 경우에 처리 
			if(this.pan[this.currentRowNum][this.currentColNum] == null) {
				// 플레이어 1 인 경우 오목판에 1 을 그린다.
				if(player.equals("1")) {
					this.pan[this.currentRowNum][this.currentColNum] = "1";
				} else {
					this.pan[this.currentRowNum][this.currentColNum] = "2";
				}
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
		
	}
	
	
	public void printDefault() {
		int tmp = 15;
		for(int i = 0; i<this.pan.length - 1; i++) {
			this.pan[i][0] = String.valueOf(tmp--); 
		}
		char ch = 'A';
		for(int i = 1; i<this.pan[0].length; i++) {
			this.pan[15][i] = String.valueOf(ch++);
		}
	}
	
	public void stringToInt(String rowNum, String colNum) {
		currentRowNum = 15 - Integer.parseInt(rowNum);
		currentColNum = colNum.toCharArray()[0] - 64;
	}
}
