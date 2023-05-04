package practiceProblems;

import org.junit.Test;

public class DIstring {
	
	
	
	
	
	//@Test
	public void example1()
	{
		String str = "IDID";
	    int[] result = diStringMatch( str);
	    for (int num : result)
	    {
	        System.out.print(num + " ");
	    }
 	}
	
	//@Test
	public void example2()
	{
		String str = "III";
	    int[] result = diStringMatch( str);
	    for (int num : result)
	    {
	        System.out.print(num + " ");
	    }
		
	}
	
	@Test
	public void example3()
	{
		String str = "DDI";
	    int[] result = diStringMatch( str);
	    for (int num : result)
	    {
	        System.out.print(num + " ");
	    }
	}
	

	public static int[] diStringMatch(String str) 
	{
	    int length = str.length();
	    int[] word = new int[length + 1];

	    int left = 0;
	    int right = length;

	    for (int i = 0; i < length; i++)
	    {
	        if (str.charAt(i) == 'I') {
	            word[i] = left++;
	        } else {
	            word[i] = right--;
	        }
	        
	    }
        word[length]= left;
	    return word;
	}

}
