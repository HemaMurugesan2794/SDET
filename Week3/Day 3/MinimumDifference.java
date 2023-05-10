package practiceProblems;

import java.util.Arrays;

import org.junit.Test;

public class MinimumDifference {
	
	
	//Time complexity: O(nlogn)
	
	
	@Test
	public void example1()
	{
		int[] nums = {90};
		int k=1;
		int min=minimumDifference(nums,k);
		System.out.println(min);
	}
	@Test
	public void example2()
	{
		int[] nums = {9,4,1,7};
		int k=2;
		int min=minimumDifference(nums,k);
		System.out.println(min);
	}


	public int minimumDifference(int[] nums, int k) {
        if (k == 1) return 0;

        Arrays.sort(nums);
		
        int i = 0, j = k - 1, 
        min = Integer.MAX_VALUE;

        while (j < nums.length)
        {
            min = Math.min(min, nums[j] - nums[i]);
            i++;
            j++;
        }

        return min;
    }

}
