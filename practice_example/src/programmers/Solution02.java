package programmers;

import java.util.HashMap;

public class Solution02 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int [] arr = {2, 1, 2, 6, 2, 4, 3, 3};
		for(int i :s.solution(5, arr)) {
			System.out.print(i);
		}
	}
	

}
/*
 *  LEVEL 1. 실패율
 */

class Solution2 {
	 public int[] solution(int N, int[] stages) {
	        int[] answer = new int[N];
	        double[] temp = new double[N];
	        
	        int cnt;
	        int callengeP;
	        
	        for(int i=1; i<=N; i++) {
	            cnt = 0;
	            callengeP = 0;
	            for(int j=0; j<stages.length; j++) {
	                if(stages[j] == i){
	                    cnt++;
	                }
	                if(stages[j] >= i){
	                    callengeP++;
	                }
	            }
	            if(callengeP == 0) {
	                temp[i-1] = 0;
	            } else {
	                temp[i-1] = (double) cnt / (double)  callengeP;    
	            }           
	            
	        }

	        double max = -1;
	        
	        for(int l = 0; l < answer.length ; l++){
	            
	            for(int i=0; i<temp.length; i++){
	                max = Math.max(max,temp[i]);
	            }
	        
	            for(int i=0; i<temp.length; i++){
	                if(max == temp[i]){
	                    answer[l] = i + 1;
	                    max = -1;
	                    temp[i] = -1;
	                    break;
	                }
	            }
	        
	        }
	        
	        return answer;
	    }
}
