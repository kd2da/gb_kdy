package string;

public class Main06 {

	public static void main(String[] args) {
		/*
		 * D:/photo/2022/travel/food.jpg 라는 파일이 있습니다.
		 * 이 파일의 경로를 data 라는 객체로 생성한 후,
		 * 다음의 형태로 출력
		 * 단, split 사용 금지
		 * ----------------------------------------------
		 * 파일이름	: food
		 * 확장자		: jpg
		 * 폴더명		: D:/photo/2022/travel
		 */
		
		String data = "D:/photo/2022/travel/food.jpg";
		int separator1 = data.lastIndexOf("/");
		
		String folder_name = data.substring(0, separator1);
		String fileFullName = data.substring(separator1+1);
		int separator2 = fileFullName.lastIndexOf(".");
		
		String fileName = fileFullName.substring(0, separator2);
		String extension = fileFullName.substring(separator2+1);
		
		System.out.println("파일이름 : " + fileName
				+ "\n확장자 : " + extension
				+ "\n폴더명 : " + folder_name);
		
	}

}
