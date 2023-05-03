package practiceProblems;

import java.util.Arrays;

import org.junit.Test;

public class MaxProduct {
	
	
	//Time Complexity : O(n)

	@Test
	public void example1()
	{
		int[] nums= {4,3,2,1};
		arrayProduct(nums);
		
	}
	
	@Test
	public void example2()
	{
		int[] nums= {5,1,1,5};
		int maxProduct=arrayProduct(nums);
		System.out.println(maxProduct);
		
	}
	
	
	
	//using Integer.MIN_VALUE
	public static int arrayProduct(int[] nums)
	{
		int num1=Integer.MIN_VALUE;
		int num2=Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) 
		{
			if (nums[i]>num1)
			{
				num1=nums[i];
			}else if (nums[i]>num2) 
			{
				num2=nums[i];
			}
			}
		
		return (num1-1) * (num2-1);

	}
	
	
	//using Arrays.sort()
	public static void maxProduct(int[] nums)
	{
		int[] num = {5,2,3,4};
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		int max1=num[num.length-2];
		int max2=num[num.length-1];
		int max=(max1-1)*(max2-1);
		System.out.println(max);
	}

}
