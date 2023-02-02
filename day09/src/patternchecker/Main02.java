package patternchecker;


import study.java.helper.RegexHelper2;

public class Main02 {

	public static void main(String[] args) {
		/*
		 * 이름, 나이, 이메일, 전화번호를 입력받고
		 * RegexHelper를 이용한 validation check하는
		 * 회원가입 절차 작성 
		 */
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("이름 : ");
//		String name = sc.nextLine();
//		System.out.print("나이 : ");
//		String age = sc.nextLine();
//		System.out.print("이메일 : ");
//		String email = sc.nextLine();
//		System.out.print("전화번호 : ");
//		String phone = sc.nextLine();
//		
//		System.out.println(
//				RegexHelper.getInstance().validCheck(name, age, email, phone));
		
		
		String name = "자바학생";
		String age = "19";
		String email = "forever89829@naver.com";
		String phone = "01040072415";
		
		if(!RegexHelper2.getInstance().isKor(name)) {
			System.out.println("이름을 한글로 입력해주세요.");
			return;
		}
		if(!RegexHelper2.getInstance().isNum(age)) {
			System.out.println("나이는 숫자로만 입력해주세요.");
			return;
		}
		if(!RegexHelper2.getInstance().isEmail(email)) {
			System.out.println("이메을을 형식에 맞게 입력해주세요.");
			return;
		}
		if(!RegexHelper2.getInstance().isPhone(phone)) {
			System.out.println("전화번호를 형식에 맞게 입력해주세요.");
			return;
		}
	}
}
