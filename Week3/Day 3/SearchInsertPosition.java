package practiceProblems;

import org.junit.Test;

public class SearchInsertPosition {
	
	
	
	//TimeComplexity:O(logn)
	
	@Test
	public void example1()
	{
		int[] nums = {1,3,5,6};
		int target=5;
		int position=searchInsert(nums,target);
		System.out.println(position);
	}
	@Test
	public void example2()
	{
		int[] nums = {1,3,5,6};
		int target=2;
		int position=searchInsert(nums,target);
		System.out.println(position);
	}
	@Test
	public void example3()
	{
		int[] nums = {1,3,5,6};
		int target=7;
		int position=searchInsert(nums,target);
		System.out.println(position);
	}
	

	public int searchInsert(int[] nums, int target) {
        int start = 0;
		int end = nums.length-1;
        while(start<=end) {
            int mid = (start+end)/2;
            if(nums[mid] == target) 
                return mid;
            else if(nums[mid] > target) 
            	end = mid-1;
            else 
            	start = mid+1;
        }
        return start;  
    }
	
	
	
	
	
	
	
	
	
	
	
	

}
