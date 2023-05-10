package practiceProblems;

import org.junit.Test;

public class ReverseEachWord {

	
	   //  Time complexity ==> O(n) 
		
		//@Test
		public void example1() 
		{
			String str = "Let's take LeetCode contest";
			System.out.println(reverseWords(str));
		}

		//@Test
		public void example2() 
		{
			String str = "God Ding";
			System.out.println(reverseWords(str));
		}

		@Test
		public void example3() 
		{
			String str = " ";
			System.out.println(reverseWords(str));
		}

	
		public String reverseWords(String s) 
		{
	        String[] words = s.split(" ");
	        StringBuilder result = new StringBuilder();
	    for (String word : words)
	    {
	            StringBuilder temp=new StringBuilder(word);
	            temp.reverse();
	            result.append(temp);
	            result.append(" ");
	     }
	    return result.toString();
	    
		}

}
