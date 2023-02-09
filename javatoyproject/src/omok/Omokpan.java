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
	
	
	public void showPan() {
	}
	
	public void printPan() {
		
	}
}
