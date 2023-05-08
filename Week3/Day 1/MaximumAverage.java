package week3.day2;

import org.junit.Test;

public class MaximumAverage {
	
	//Time Complexity: O(n)
	
	
		@Test
		public void example()
		{
			int[] arr= {1,3,5,6,4};
			int k=3;
			double maxsum=maxsum(arr,k) ;
			System.out.println(maxsum);
		}
		
		@Test
		public void example1()
		{
			int[] arr= {4};
			int k=1;
			double maxsum=maxsum(arr,k) ;
			System.out.println(maxsum);
		}

		public static double  maxsum(int[] arr,int k) 
		{
			int maxSum=0;
			int sum=0;
			for (int i = 0; i < k; i++) 
			{
				sum = sum+arr[i];
			}
			//System.out.println(sum);
			maxSum=sum;
			for (int i = k; i < arr.length; i++)
			{
				
				sum = sum+arr[i]- arr[i - k];
				maxSum = Math.max(maxSum, sum);
				
			}
			
			return maxSum/k;
			
		}

	}



