package exception;

public class Main05 {

	public static void main(String[] args) {
		

		try {
			String year2 = "2013";
			int age2 = 2023 - Integer.parseInt(year2);
			System.out.println(age2);
			
			int[] arr = new int[3];
			for(int i = 0; i<5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("에러발생");
			System.out.println("원인 : " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("에러발생");
			System.out.println("원인 : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("알 수 없는 에러 발생");
			System.out.println("윈인 : " + e.getMessage());
		}
		
		System.out.println("--프로그램을 종료합니다--");

	}

}


