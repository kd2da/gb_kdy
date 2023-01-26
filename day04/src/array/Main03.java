package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main03 {

	public static void main(String[] args) {
		/*
		 * 문1.
		 * 배열 num = {22, 3, 8, 12}의
		 * 각 배열의 요소의 합을 구하여라.
		 */
		
		int[] num = new int[] {22, 3, 8, 12};
		
		int sum = 0;
		int avg = 0;
		for(int i=0; i<num.length; i++) {
			sum += num[i];
		}
		
		System.out.println("문제1");
		System.out.println("합계 :" + sum);
		System.out.println("----------");
		
		/*
		 * 문2.
		 * 배열 num2 = {60, 95, 88}
		 * 각 배열의 요소의 합과 평균을 구하여라.
		 */
		int[] num2 = new int[] {60, 95, 88};
		
		sum = 0;
		for(int i=0; i<num2.length; i++) {
			sum += num2[i];
		}
		
		avg = sum / num2.length;
		
		System.out.println("문제2");
		System.out.println("합계 : " + sum + ", 평균값 : " + avg);
		System.out.println("----------");
		
		/*
		 * 문3.
		 * 배열 num3 = {94, 85, 95, 88, 90}
		 * 서로 다른 각 배열의 요소 중 최대값을 출력하는 프로그램 작성
		 */
		
		int[] num3 = new int[] {94, 85, 95, 88, 90};
		int max = 0;
		
		for(int i=0; i<num3.length; i++) {
			if(num3[i] > max) {
				max = num3[i];
			}
		}
		
		System.out.println("문제3");
		System.out.println("최대값 : " + max);
		System.out.println("----------");
		

//		ArrayList<Integer> aL = new ArrayList<>();
//		aL.add(94);
//		aL.add(85);
//		aL.add(95);
//		aL.add(88);
//		aL.add(90);
//		
//		Collections.sort(aL);
//		
//		for(int i: aL) {
//			System.out.println(i);
//		}
//		
//		Arrays.sort(num3);
//		
//		for(int i: num3) {
//			System.out.println(i);
//		}
		
		/*
		 * 문4.
		 * 배열 num4 = {22, 3, 8, 12, 5}
		 * 각 요소의 홀수와 짝수의 합을 각각 구하는 프로그램 작성
		 */
		
		int[] num4 = new int[] {22, 3, 8, 12, 5};
		
		int oddSum = 0;
		int evenSum = 0;
		for(int i = 0; i < num4.length; i++	) {
			if(num4[i]%2 == 1) {
				oddSum += num4[i];
			} else {
				evenSum += num4[i];
			}
		}
		System.out.println("문제4");
		System.out.println("홀수 요소들의 합 : " + oddSum + " 짝수 요소들의 합 : " + evenSum);
	}
}
