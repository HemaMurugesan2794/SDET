package practiceProblems;

import java.util.Arrays;

public class RemoveDuplicates {
	
	//Time Complexity : O(n)

	public static void main(String[] args)
	{
		 System.out.println(removeDuplicatesFromArray(new int[]{1, 1, 2}));
	     System.out.println(removeDuplicatesFromArray(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
	}
	
	

	private static int removeDuplicatesFromArray(int[] nums) {
		  if (nums.length == 0) {
	            return 0;
	        }
	        
	        int uniqueCount = 1;
	        
	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] != nums[uniqueCount - 1]) {
	                nums[uniqueCount] = nums[i];
	                uniqueCount++;
	            }
	        }
	        System.out.println(Arrays.toString(nums));
	        return uniqueCount;
	    }
}
	
	


