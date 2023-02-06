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
	
	
	
	
}
