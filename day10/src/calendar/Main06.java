package calendar;

import java.util.Calendar;

public class Main06 {

	public static void main(String[] args) {
		/*
		 * 2월 달력을 만드시오.
		 */
		
		// MONTH
		// 0 : 1월 ~ 11: 12월
		// DAY_OF_WEEK
		// 1 : 일 2 : 월 3 : 화 4 : 수 5 : 목 6 : 금 7 : 토
		Calendar cal = Calendar.getInstance();
		
		/*
		 * 1. Calendar 객체를 불러온다.
		 * 2. 2023년 2월 달력을 만들기 위해서 23년 2월 1일로 Calendar 객체를 세팅
		 * 3. 2월의 최대 주 수 를 구한다.
		 * 4. 행 : 2월 최대 주 수 / 열 : 일~토 총 7 : 배열을 만든다.
		 * 5. 2월 1일가 무슨 요일인지 파악
		 * 6. 2월 1일은 1 번째 주 이고, 4(수) 요일 인걸 확인하고, 2차원 행렬에 조건문을 생성
		 */
		
		cal.set(2023, 01, 01);
		
//		System.out.println(cal.getActualMaximum(Calendar.WEEK_OF_MONTH));
//		// 5주
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//		// 2월 1일의 요일 ? 4 -> 수
//		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
//		// 2월의 최대일?
		
		String[] day_of_week = {"일","월","화","수","목","금","토"};
		String[][] arr = new String[cal.getActualMaximum(Calendar.WEEK_OF_MONTH) + 1][7];
		
		for(int i=0; i< day_of_week.length; i++) {
			System.out.printf("\t%2s",day_of_week[i]);
		}
		System.out.println();
		
		try {
			int count = 1;
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[0].length; j++) {
					if(i == 0 && j == cal.get(Calendar.DAY_OF_WEEK)-1) {
						arr[i][j] = String.valueOf(count++);
					} else if (count >= 2 && count <= cal.getActualMaximum(Calendar.DAY_OF_MONTH)) {
						arr[i][j] = String.valueOf(count++);
					} 
					if(arr[i][j] == null) System.out.print("\t");
					else System.out.printf("\t%2s",arr[i][j]);
				}
				System.out.println();	
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 초과 에러");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("알 수 없는 에러");
			e.printStackTrace();
		}
			
	}

}
