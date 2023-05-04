package practiceProblems;

import java.util.Arrays;

import org.junit.Test;

public class ReversePrefix {

	@Test
	public void example1()
	{
		String str = "abcdefd";
		char c= 'd';
		String prefix=  reversePrefix(str, c);
		System.out.println(prefix);
 	}
	
	@Test
	public void example2()
	{
		String str = "xyxzxe";
		char c= 'z';
		String prefix=  reversePrefix(str, c);
		System.out.println(prefix);
	}
	
	@Test
	public void example3()
	{
		String str = "abcd";
		char c= 'z';
		String prefix=  reversePrefix(str, c);
		System.out.println(prefix);
	}
	
	
	public static String reversePrefix(String str, char c) 
	{
        char[] arr = str.toCharArray();
        int i = 0;
        int j = str.indexOf(c);

        while (i < j) 
        {
            char temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;      
        }
       
        return new String(arr);
    }
}
