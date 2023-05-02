package practiceProblems;

import java.util.Arrays;

import org.junit.Test;

public class RemoveElement {

	@Test
	public void example1()
	{
		int[] nums= {3,2,2,3};
		int val = 3;
		 System.out.println(removeElementFromArray(nums,val));
	    
	}
	
	@Test
	public void example2()
	{
		int[] nums= {0,1,2,2,3,0,4,2};
		int val = 2;
		 System.out.println(removeElementFromArray(nums,val));
	    
	}
	
	@Test
	public void example3()
	{
		int[] nums= {};
		int val = 2;
		 System.out.println(removeElementFromArray(nums,val));
	    
	}
	
	
	    public static int removeElementFromArray(int[] nums, int val)
	    {
	    	if (nums.length == 0) {
	            return 0;
	        }
	        int uniqueCount = 0;
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] != val) {
	                nums[uniqueCount] = nums[i];
	                uniqueCount++;
	            }
	        }
	        System.out.println(Arrays.toString(nums));
	        return uniqueCount;
	    }

	    
	}


