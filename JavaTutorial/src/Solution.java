import java.util.ArrayList;
import java.util.List;

public class Solution { //created a class with methods
	public int findNum(int[] nums) {
		System.out.println("Inside the findNum Function");
		
		return 1;
	}
	
	public double mypow(double x, int num) {
		double result = 1.0;	
		
		while(num != 0) { //check if the exponent is not zero
			result *= x;
			--num;
		}		
		return result;	
	}
	
	public List<Integer> cellcompete(int[] states, int days){
		
		List<Integer>res = new ArrayList<>();
		
		int act = 1;
		
		//loop through the list
		for(int i = 0; i<states.length;i++) {
			//System.out.println(states[i]);
			if(states[i]== 0 || states[i+1]==1) {
				res.add(act);				
			}
			//res.add(states[i]);			
		}	
		return res;	
	}

}
