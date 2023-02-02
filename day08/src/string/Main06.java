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
		
		String name = data.substring(data.lastIndexOf("/") + 1
										, data.lastIndexOf("."));
		String ext = data.substring(data.lastIndexOf(".") + 1);
		String folder = data.substring(0, data.lastIndexOf("/"));
		
		
		
		System.out.println("파일이름 : " + name
				+ "\n확장자 : " + ext
				+ "\n폴더명 : " + folder);
		
	}

}
