package practiceProblems;

import java.util.Arrays;

import org.junit.Test;

public class MergeSortedArray {

	@Test
	public void example1()
	{
		int[] nums1 = {1,2,3,0,0,0};
	    int[] nums2 = {2,5,6};
	    int n=3;
	    int m=3;
	    mergeArray(nums1, n, nums2, m);
	}
	
	@Test
	public void example2()
	{
		int[] nums1 = {1};
	    int[] nums2 = {};
	    int n=1;
	    int m=0;
	    mergeArray(nums1, n, nums2, m);
	}
	
	@Test
	public void example3()
	{
		
		int[] nums1 = {0};
	    int[] nums2 = {1};
	    int n=0;
	    int m=1;
	    mergeArray(nums1, n, nums2, m);
		
	}

	
	public void mergeArray(int[] nums1, int n, int[] nums2, int m)
	{
        int i = n - 1;
        int j = m - 1;
        int k = n+m - 1;
        while (i >= 0 && j >= 0) 
        {
            if (nums1[i] < nums2[j]) 
            {
                nums1[k--] = nums2[j--];
            }
            else
            {
                nums1[k--] = nums1[i--];
            }
        } 
        while (i >= 0)
        {
            nums1[k--] = nums1[i--];
        }
        while (j >= 0)
        {
            nums1[k--] = nums2[j--];
        }
	
	System.out.println(Arrays.toString(nums1));
}
}
