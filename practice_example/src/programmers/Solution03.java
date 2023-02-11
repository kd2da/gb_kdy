package programmers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class Solution03 {

	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		
					
		String today = "2022.05.19";
		String[] terms1 = {"A 6", "B 12", "C 3"};
		String[] privacies1 = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		
		int[] arr1 = sol.solution(today, terms1, privacies1);
		
		today = "2020.01.01";
		String[] terms2 = {"Z 3", "D 5"};
		String[] privacies2 = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
		
		int[] arr2 = sol.solution(today, terms2, privacies2);

		//13
		//145
	}

}



class Solution3 {
    public int[] solution(String today, String[] terms, String[] privacies) {

    	
    	List<Integer> arrL = new ArrayList<Integer>();
    	
    	
    	Calendar cal = Calendar.getInstance();
    	
//    	cal.set(2023,11,29);
//    	System.out.println(cal.get(Calendar.MONTH) + 1 );
//    	System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//    	
		cal.set(Integer.parseInt(today.substring(0,4))
				, 	Integer.parseInt(today.substring(5, 7)) - 1
				,	Integer.parseInt(today.substring(8,10)));
    	
    	int todayStr = Integer.parseInt(calToString(cal));
    	
    	System.out.println(todayStr);
    	
    	for(int i = 0; i < privacies.length; i++) {
    		cal.set(Integer.parseInt(privacies[i].substring(0,4))
    				, 	Integer.parseInt(privacies[i].substring(5, 7)) - 1
    				,	Integer.parseInt(privacies[i].substring(8,10)));
    		
    		for(int j = 0; j < terms.length; j++) {
    			if(privacies[i].substring(11).equals(terms[j].substring(0,1))) {
    				cal.add(cal.MONTH, Integer.parseInt(terms[j].substring(2)));
    				cal.add(cal.DAY_OF_MONTH, -1);
    				if( cal.get(cal.DAY_OF_MONTH)>= 29) {
    					cal.set(cal.DAY_OF_MONTH, 28);
    				}
    			}
    		}
    		int termsStr = Integer.parseInt(calToString(cal));
    		System.out.println(termsStr);
    		if(todayStr > termsStr) arrL.add(i+1);
    		
    		
    	}
    	
    	for(int i: arrL) {
    		System.out.println(i);
    	}
    	
    	int[] answer = arrL.stream().mapToInt(Integer::intValue).toArray();
//    	
//    	
//    	
    	return answer;
        
    }
    
    public String calToString(Calendar cal) {
    	String yyyy = String.valueOf(cal.get(cal.YEAR));
    	String mm = String.valueOf(cal.get(cal.MONTH));
    	if(cal.get(cal.MONTH) >= 0 && cal.get(cal.MONTH) <= 8) {
    		mm = "0" + String.valueOf(cal.get(cal.MONTH) + 1);
    	} else {
    		mm = String.valueOf(cal.get(cal.MONTH) + 1);
    	}
    	String dd;
    	if(cal.get(cal.DAY_OF_MONTH) >= 1 && cal.get(cal.DAY_OF_MONTH) <= 9) {
    		dd = "0" + String.valueOf(cal.get(cal.DAY_OF_MONTH));
    	} else {
    		dd = String.valueOf(cal.get(cal.DAY_OF_MONTH));
    	}
    	return yyyy+mm+dd;
    }
}
