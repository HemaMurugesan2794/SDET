package practiceProblems;

import java.util.Arrays;

import org.junit.Test;

public class ReverseVowel {
	
	/* Create vowel method to find the character is a vowel or not
	 * Create left & right pointer
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	
	// Time & Space Complexity : O(n)
	
	@Test
	public void example1()
	{
		String s="hello";
		String vowel=reverseVowels(s);
		System.out.println(vowel);
	}
	
	@Test
	public void example2()
	{
		String s="leetcode";
		String vowel=reverseVowels(s);
		System.out.println(vowel);
	}

	public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        int i = 0;
        int j = charArray.length - 1;

       
            while (i < j && !isVowel(charArray[i])) {
                i++;
            }

            while (i < j && !isVowel(charArray[j])) {
                j--;
            }

            if (i < j) {
                char temp = charArray[i];
                charArray[i++] = charArray[j];
                charArray[j--] = temp;
              
            }
        

        return new String(charArray);
    }

    private boolean isVowel(char c) {
        
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
        	   c== 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

}
