package coreInterview;

import java.util.ArrayList;
import java.util.List;

public class StaircaseProblem {
	/*
	 * Given a staircase that has 'n' step, and you climb the staircase by
	 * jumping over the steps. You can cover at max of 'k' steps in a single
	 * jump. List all the possible sequence of jumps you could take to climb the
	 * staircase.
	 * 
	 * input: n=4, k=2
	 * 
	 * output: 	1,1,1,1 
	 * 			1,1,2 
	 * 			1,2,1 
	 * 			2,1,1 
	 * 			2,2
	 */
	public static void main(String[] args){
			
			List<List<Integer>> ls = getCombinationOfStairs(4, 2);
			for(List<Integer> lsFromSubStr : ls){
				System.out.println("size " + lsFromSubStr.size());
				for(int num : lsFromSubStr){
					System.out.print(" " + num);
				}
				System.out.println("");
			}
			
		}
		public static List<List<Integer>> getCombinationOfStairs(int totalSteps , int maxSteps){
			List<List<Integer>> ls = null;
			if(totalSteps == 0)
				return ls;
			
			ls = new ArrayList<List<Integer>>();
			for(int i = 1; i <= maxSteps ; i++){
				if(i <= totalSteps){
					int numOfStepsRemaining = totalSteps - i;
					List<List<Integer>> lst = getCombinationOfStairs(numOfStepsRemaining , maxSteps);
					if(lst != null){
						for(List<Integer> lsFromSubStr : lst){
							lsFromSubStr.add(0, i);
							ls.add(lsFromSubStr);
						}
					}else{
						List<Integer> singleElemLst = new ArrayList<Integer>();
						singleElemLst.add(i);
						ls.add(singleElemLst);
					}
						
				}
			}
			
			return ls;
			
		}

}
