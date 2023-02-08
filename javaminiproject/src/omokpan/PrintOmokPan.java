package omokpan;

public class PrintOmokPan {

	// 싱글톤 생성 시작
	private static PrintOmokPan current = null;
	
	public static PrintOmokPan getInstance() {
		if(current == null) {
			current = new PrintOmokPan();
		}
		return current;
	}
	
	public static void freeInstance() {
		current = null;
	}
	
	private PrintOmokPan() {
		super();
	}
	// 싱글톤 생성 종료
	
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

	private final int ROW = 16;
	private final int COL = 16;
	//15*15 오목판 구성
	private String[][] omokPan = new String[ROW][COL];

	public String[][] getOmokPan() {
		return omokPan;
	}

	public void setOmokPan(String[][] omokPan) {
		this.omokPan = omokPan;
	}

	public int getROW() {
		return ROW;
	}

	public int getCOL() {
		return COL;
	}
	// 오목판 객체를 생성 행 번호와 열 번호를 매겨주는 역할 메소드
	public void printDefault(String[][] arr) {
		int tmp = 15;
		for(int i = 0; i<arr.length - 1; i++) {
			arr[i][0] = String.valueOf(tmp--); 
		}
		char ch = 'A';
		for(int i = 1; i<arr[0].length; i++) {
			arr[15][i] = String.valueOf(ch++);
		}
	}
	
	public void printOmokPan(String[][] arr) {
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
	
	public void stringToInt(String rowNum, String colNum) {
		currentRowNum = 15 - Integer.parseInt(rowNum);
		currentColNum = colNum.toCharArray()[0] - 64;
	}
	
	
	public void printPlayer(String player, int rowNum, int colNum) {
		// 해당 위치에 수가 두어진 경우에 처리 
		
		// 오목판의 범위를 벗어 났을 때 처리
		
		
		if(player.equals("1")) {
			this.omokPan[rowNum][colNum] = "1";
		} else {
			this.omokPan[rowNum][colNum] = "2";
		}
	}
}
