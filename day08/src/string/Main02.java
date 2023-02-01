package string;

public class Main02 {

	public static void main(String[] args) {
		/*
		 * - 이메일 주소에서 아이디와 도메인을 구별하기
		 * 		student@java.com
		 * 		-> email_id : student
		 * 		-> email_domain : java.com
		 * - String 클래스의 메소드를 사용해서 구현하기
		 * - 단, split 사용 금지
		 */
		
		String email = "student@java.com";
		
		// "@"가 나타나는 위치 얻기
		int separater = email.indexOf("@");
		
		// 처음부터 "@"가 나타나는 위치까지 자르기 -> 아이디
		String email_id = email.substring(0, separater);
		
		// "@"가 나타나는 위치 다음부터 끝까지 자르기 -> 도메인
		String email_domain = email.substring(separater + 1);
		
		System.out.println("email_id : " + email_id 
				+ "\nemail_domain : " + email_domain);
	}

}
