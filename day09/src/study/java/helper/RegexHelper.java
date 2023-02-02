package study.java.helper;

import java.util.regex.Pattern;

public class RegexHelper {

	// 싱글톤 객체 생성 시작
	private static RegexHelper current;
	
	public static RegexHelper getInstance() {
		if(current == null) {
			current = new RegexHelper();
		}
		return current;
	}
	
	public static void freeInstance() {
		current = null;
	}
	
	private RegexHelper() {}
	
	// 싱글톤 객체 생성 종료
	
	// 회원가입 validation check 기능
	
	public String validCheck(String name, String age, String email, String phone) {
		if(!Pattern.matches("^[ㄱ-ㅎ가-힣]*$", name)) {
			return "이름이 형식에 맞지 않습니다.";
		} else if (!Pattern.matches("^[0-9]*$", age)){
			return "나이가 형식에 맞지 않습니다.";
		} else if (!Pattern.matches("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$", email)) {
			return "이메일이 형식에 맞지 않습니다.";
		} else if (!Pattern.matches("^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$", phone)) {
			return "전화번호가 형식에 맞지 않습니다.";
		} else {
			return "회원가입 절차를 진행합니다.";
		}
	}
	
}
