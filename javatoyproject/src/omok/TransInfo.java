package omok;

public class TransInfo {
	//싱글턴 생성 시작
	private static TransInfo current;
	
	public static TransInfo getInstance() {
		if(current == null) {
			current = new TransInfo();
		}
		return current;
	}
	
	public static void freeInstance() {
		current = null;
	}
	
	private TransInfo() {}
	
	//싱글턴 생성 종료
	
	
	public void stringToInt(String rowNum, String colNum) {
		try {
			Omokpan.getInstance().setCurrentRowNum(15 - Integer.parseInt(rowNum));
		} catch(NumberFormatException e) {
			Omokpan.getInstance().setCurrentRowNum(-1);
		} catch(Exception e) {
			System.out.println("알 수 없는 에러");
		}
		Omokpan.getInstance().setCurrentColNum(colNum.toCharArray()[0] - 64);
	}
}
