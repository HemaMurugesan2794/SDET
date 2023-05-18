package week1.day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class ArrayIntersection {
	
	
	/* Create two pointers and create hash set 
	 * Sort both the arrays
	 * Using while loop , traverse both the arrays 
	 * if left pointer is less than the right pointer , increment left pointer
	 * if left pointer is greater than the right pointer , increment right pointer
	 * else add the common items into the created set
	 * convert the result set into array
	 */
	
	
	//Time Complexity : O(nlogn)
	//Space Complexity: O(n)
	
	@Test
	public void example1()
	{
		int[] nums1 = {1, 2, 2, 1};
		int[] nums2 = {2, 2};
		int[] result = intersection( nums1,  nums2);
		System.out.println(Arrays.toString(result));
	}
	
	@Test
	public void example2()
	{
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		int[] result = intersection( nums1,  nums2);
		System.out.println(Arrays.toString(result));
	}
	
	
	
	
	public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i = 0;
        int j = 0;
        Set<Integer> resultSet = new HashSet<>();
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                resultSet.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] result = new int[resultSet.size()];
        int k = 0;
        for (int num : resultSet) {
            result[k++] = num;
        }
        
        return result;
    }
}
