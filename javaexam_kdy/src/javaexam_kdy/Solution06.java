package javaexam_kdy;

/*
 * 6.	2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.(15)
 * 		[배열] int[][] arr = { { 5, 5, 5, 5, 5}, {10,10,10,10,10}, {20,20,20,20,20}, {30,30,30,30,30} };
 *  	[출력 결과] total=325 average=16 
 */
public class Solution06 {

	public static void main(String[] args) {
		int[][] arr = { { 5, 5, 5, 5, 5}, {10,10,10,10,10}, {20,20,20,20,20}, {30,30,30,30,30} };
		
		int sum = 0;
		int cnt = 0;
		int average = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				cnt++;
			}
		}
		if(cnt != 0) {
			average = sum / cnt;
		} 
		System.out.println("total = " + sum + " average = " + average);
	}

}
