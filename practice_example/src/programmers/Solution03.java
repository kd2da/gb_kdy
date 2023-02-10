package programmers;

import java.sql.Date;
import java.util.Calendar;

import javax.swing.text.DateFormatter;

public class Solution03 {

	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		
					
		String today = "2022.05.19";
		String[] terms1 = {"A 6", "B 12", "C 3"};
		String[] privacies1 = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		
		int[] arr1 = sol.solution(today, terms1, privacies1);
		
//		today = "2020.01.01";
//		String[] terms2 = {"Z 3", "D 5"};
//		String[] privacies2 = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
//		
//		int[] arr2 = sol.solution(today, terms2, privacies2);
//		
//		for(int i:arr1) {
//			System.out.print(i);
//		}
//		
//		System.out.println();
		
//		for(int i:arr2) {
//			System.out.print(i);
//		}
		
		//13
		//145
	}

}



class Solution3 {
    public int[] solution(String today, String[] terms, String[] privacies) {
    	int[] answer = {};
    	
    	Calendar cal = Calendar.getInstance();
    	
    	
    	
    	cal.set(Integer.parseInt(today.substring(0,4))
    				, 	Integer.parseInt(today.substring(5, 7))
    				,	Integer.parseInt(today.substring(8,10)));
    	
    	System.out.println(cal.get(cal.YEAR) 
    			+ " " + cal.get(cal.MONTH)
    			+ " " + cal.get(cal.DAY_OF_MONTH));
    	
    	
    	cal.add(cal.MONTH, 6);
    	
    	System.out.println(cal.get(cal.YEAR) 
    			+ " " + cal.get(cal.MONTH)
    			+ " " + cal.get(cal.DAY_OF_MONTH));
    	
 
    	
    	
    	
    	return answer;
        
    }
}
