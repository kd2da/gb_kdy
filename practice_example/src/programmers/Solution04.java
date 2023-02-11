package programmers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.text.DateFormatter;

public class Solution04 {

	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		
					
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



class Solution4 {
	 public int[] solution(String today, String[] terms, String[] privacies) {


	        ArrayList<Integer> aL = new ArrayList<>();



	        String yyyy_today = today.substring(0,4);
	        String mm_today = today.substring(5,7);
	        String dd_today = today.substring(8,10);
	        String string_today = yyyy_today + mm_today + dd_today + "";


	        // System.out.println(terms[0]);
	        for(int i=0; i<privacies.length; i++){
	            String yyyy_priv = privacies[i].substring(0,4);
	            String mm_priv = privacies[i].substring(5,7);
	            String dd_priv = privacies[i].substring(8,10);
	            String str = privacies[i].substring(11);

	            int month = 0;
	            for(int j = 0; j < terms.length; j++){
	                if(str.equals(terms[j].substring(0,1))){
	                    month = Integer.parseInt(terms[j].substring(2));
	                    // System.out.println(month);
	                    break;
	                }
	            }
	            int plus_year = (Integer.parseInt(mm_priv) + month) / 12;
	            int plus_month = (Integer.parseInt(mm_priv) + month) % 12;
	            if (plus_month == 0 ) yyyy_priv = String.valueOf(Integer.parseInt(yyyy_priv) + plus_year - 1);
	            else yyyy_priv = String.valueOf(Integer.parseInt(yyyy_priv) + plus_year);
	            if (plus_month == 0) {
	                mm_priv = "12";
	            } else if (plus_month >= 1 && plus_month <= 9) {
	                mm_priv = "0" + plus_month;
	            } else {
	                mm_priv = "" + plus_month;
	            }
	            /*
	             *  수집 일자(DD) 가 1日 경우,
	             *  DD = 28, MM = MM - 1
	             *  1月 경우 12月 로 변경해줘야 한다.
	             */
	            if(dd_priv.equals("01")){
	                dd_priv = "28";
	                if (mm_priv.equals("01")) {
	                    yyyy_priv = String.valueOf(Integer.parseInt(yyyy_priv) - 1);
	                    mm_priv = "12";
	                } else if (Integer.parseInt(mm_priv) >= 2 && Integer.parseInt(mm_priv) <= 10) {
	                    mm_priv = "0" + String.valueOf(Integer.parseInt(mm_priv) - 1);
	                } else {
	                    mm_priv = String.valueOf(Integer.parseInt(mm_priv) - 1);
	                }
	            } else if(Integer.parseInt(dd_priv) >= 2 && Integer.parseInt(dd_priv) <= 10 ){
	                dd_priv = "0" + String.valueOf(Integer.parseInt(dd_priv) - 1);
	            } else {
	                dd_priv = String.valueOf(Integer.parseInt(dd_priv) - 1);
	            }


	            String string_priv = yyyy_priv + mm_priv + dd_priv + "";
	            // System.out.println(string_priv + " " + string_today);

	            // if(string_today)
	            if(Integer.parseInt(string_priv) < Integer.parseInt(string_today)) {
	                aL.add(i+1);
	            }

	        }

	        int[] answer = new int[aL.size()];

	        for(int i=0; i< answer.length; i++){
	            answer[i] = aL.get(i);
	        }

	        // System.out.print(yyyy_today + " " + mm_today + " " + dd_today);
	        return answer;
	    }
}
