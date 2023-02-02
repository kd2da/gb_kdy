package study.java.helper;

import java.util.regex.Pattern;

public class RegexHelper2 {

	// 싱글톤 객체 생성 시작
	private static RegexHelper2 current;
	
	public static RegexHelper2 getInstance() {
		if(current == null) {
			current = new RegexHelper2();
		}
		return current;
	}
	
	public static void freeInstance() {
		current = null;
	}
	
	private RegexHelper2() {}
	
	// 싱글톤 객체 생성 종료
	
	/*
	 *  주어진 문자열이 공백이거나 null인지를 검사
	 *  @param	str		- 검사할 문자열
	 *  @return boolean - 공백, null이 아닐 경우 true 리턴
	 */
	public boolean isValue( String str ) {
		boolean result = false;
		if(str != null ) {
			result = !str.trim().equals("");
		}
		return result;
	}
	
	/*
	 * 숫자 모양에 대한 형식 검사
	 * @param	str		- 검사할 문자열
	 * @return	boolean	- 형식에 맞을 경우 true, 맞지 않을 경우 false 
	 */
	
	public boolean isNum( String str ) {
		boolean result = false;
		if(isValue(str)) {
			result = Pattern.matches("^[0-9]*$", str);
		}
		return result;
	}
	
	/*
	 * 영문으로만 구성되어있는지에 대한 형식 검사
	 * @param	str		- 검사할 문자열
	 * @return	boolean	- 형식에 맞을 경우 true, 맞지 않을 경우 false 
	 */
	
	public boolean isEng( String str ) {
		boolean result = false;
		if(isValue(str)) {
			result = Pattern.matches("^[a-zA-Z]*$", str);
		}
		return result;
	}
	/*
	 * 한글으로만 구성되어있는지에 대한 형식 검사
	 * @param	str		- 검사할 문자열
	 * @return	boolean	- 형식에 맞을 경우 true, 맞지 않을 경우 false 
	 */
	
	public boolean isKor( String str ) {
		boolean result = false;
		if(isValue(str)) {
			result = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", str);
		}
		return result;
	}

	public boolean isPhone( String str ) {
		boolean result = false;
		if(isValue(str)) {
			result = Pattern.matches("^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$", str);
		}
		return result;
	}

	
	public boolean isEmail( String str ) {
		boolean result = false;
		if(isValue(str)) {
			result = Pattern.matches("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$", str);
		}
		return result;
	}
}
