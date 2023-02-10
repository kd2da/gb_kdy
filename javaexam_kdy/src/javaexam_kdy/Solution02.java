package javaexam_kdy;

/*
 *  2. 	1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 의 결과를 계산하시오.(10)
 */
public class Solution02 {

	public static void main(String[] args) {
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum1 += i;
			sum2 += sum1;
		}
		
		System.out.println("1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) = " + sum2);
	}

}
