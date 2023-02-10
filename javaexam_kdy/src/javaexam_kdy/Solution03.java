package javaexam_kdy;

/*
 *  3. 	while 문과 Math.random() 메소드를 이용해서 두 개의 주사위를 던졌을 때 
 * 		나오는 눈을 (눈1, 눈2) 형태로 출력하고, 
 * 		눈의 합이 5가 아니면 계속 주사위를 던지고, 
 * 		눈의 합이 5이면 실행을 멈추 는 코드를 작성해보세요. 
 * 		눈의 합이 5가 되는 경우는 (1, 4), (4, 1), (2, 3), (3, 2)입니다.(10)
 */
public class Solution03 {

	public static void main(String[] args) {
		int eye1;
		int eye2;
		
		while(true) {
			eye1 = random(1,6);
			eye2 = random(1,6);
			
			if(eye1 + eye2 == 5) {
				System.out.println("(" + eye1 + "," + eye2 +  ")" + "눈의 합이 5 입니다.");
				break;
			}
		}

	}
	
	public static int random(int min, int max) {
		return (int) (Math.random() * (max - min + 1)) + min;
	}

}
