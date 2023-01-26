package ch04;

public class ContinueTest {

	public static void main(String[] args) {

		System.out.println("1~1000까지의 정수 중 3의 배수의 합은?");
		
		int i = 1;
		int sum = 0;
		
		while(i<=1000) {
			
			if(i%3 != 0) {
				i++;
				continue;
			}		
			sum += i;
			i++;
		}
		System.out.println("1~1000까지의 정수 중 3의 배수의 합 : " + sum);
	}

}
