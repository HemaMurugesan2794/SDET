package practiceProblems;

import org.junit.Test;

public class DivisorSubString {
	
	
	/*  Time Complexity: O(n)
	 *  Space Complexity:O(1)
	 
	 * Convert the number to string 
	 * Declare variable for two pointers ,and  to count the kbeauty
	 * Extract the substring and convert the string to integer
	 * If the num is not equal to zero and divisor of the num then increment the counter 
	 * increment the pointers
	 */
	 

	
	
	@Test
	public void example1()
	{
		int num =240;
		int k=2;
		int kBeautyCount=findKBeauty(num,k);
		System.out.println(kBeautyCount);
	}
	
	@Test
	public void example2()
	{
		int num =430043;
		int k=2;
		int kBeautyCount=findKBeauty(num,k);
		System.out.println(kBeautyCount);
	}
	
	
	
	public int findKBeauty(int num, int k) {
	    String numString = String.valueOf(num);
	    int kBeautyCount = 0;

	    int i = 0;
	    int j = k - 1;

	    while (j < numString.length()) {
	        String substring = numString.substring(i, j + 1);
	        int substringNum = Integer.parseInt(substring);

	        if (substringNum != 0 && num % substringNum == 0) {
	            kBeautyCount++;
	        }

	        i++;
	        j++;
	    }

	    return kBeautyCount;
	}


}
