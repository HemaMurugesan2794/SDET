package practiceProblems;

import org.junit.Test;

public class MissingNumber {
	@Test
	public void example1()
	{
		int[]  nums = {1,0,3};
		System.out.println( missingNumber(nums));
	}
	
	@Test
	public void example2()
	{
		int[]  nums = {0,1};
		System.out.println( missingNumber(nums));
	}
	
	@Test
	public void example3()
	{
		int[]  nums = {9,6,4,2,3,5,7,0,1};
		System.out.println( missingNumber(nums));
	}
	
	
	private static int missingNumber(int nums[])
	{
		int sum =0;
		for (int i = 0; i < nums.length; i++) 
		{
			sum = sum+nums[i];
			
		}
		int actualsum= nums.length * (nums.length +1)/2;
		int missingNumber=actualsum-sum;
		return missingNumber;
		
		

}
}
