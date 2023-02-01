package string;

public class Main05 {

	public static void main(String[] args) {
		/*
		 * 주민번호에서 생년월일 추출하기
		 * ex) 8005011234567 -> 1980년 05월 01일 남자
		 *  800501 1
		 *  012345 6
		 * - 성별코드
		 * 	-> 성별코드 1 or 2 : 19 ~
		 * 	-> 성별코드 3 or 4 : 20 ~
		 *  -----------------------
		 *  -> 성별코드 1 or 3 : 남자
		 *  -> 성별코드 2 or 4 : 여자
		 */
		
//		Scanner sc = new Scanner(System.in);
//		String number = sc.nextLine();
		
//		String number = "8005011234567";
		String number = "0212014234567";
		
		String yy = number.substring(0, 2);
		String mm = number.substring(2, 4);
		String dd = number.substring(4, 6);
		String genderNum = number.substring(6, 7);
		
		// 성별
		String genderStr = "";
		if(genderNum.equals("1") || genderNum.equals("3")) {
			genderStr = "남자";
		} else {
			genderStr = "여자";
		}
		
		// 출생년도
		String yyyy = "";
		if(genderNum.equals("1") || genderNum.endsWith("2")) {
			yyyy = "19" + yy;
		} else {
			yyyy = "20" + yy;
		}
		
		System.out.println(yyyy + "년" + mm + "월" + dd + "일" + genderStr );
		
	}

}
