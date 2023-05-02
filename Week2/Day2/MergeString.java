package practiceProblems;

import org.junit.Test;

public class MergeString {

	
	@Test
	public void example1() throws Exception
	{
		String str1="abc";
		String str2="def";
		String result = mergeString(str1, str2);
		System.out.println(result);
		
	}
	
	@Test
	public void example2() throws Exception
	{
		String str1="abc";
		String str2="def123";
		String result = mergeString(str1, str2);
		System.out.println(result);
	}
	
	@Test
	public void example3() throws Exception
	{
		String str1="";
		String str2="";
		String result = mergeString(str1, str2);
		System.out.println(result);
	}
	
	public static String mergeString(String str1, String str2) throws Exception 
	{

		int i = 0,j=0;
		StringBuilder mergedString = new StringBuilder();
		if(str1.length() <1 && str2.length() <1)
		{
			throw new Exception("Empty String ");
		}
		while(i<str1.length() && j<str2.length())
		{
			mergedString=mergedString.append(str1.charAt(i));
			i++;
			mergedString=mergedString.append(str2.charAt(j));
			j++;
		}
		mergedString.append(str1.substring(i));
		mergedString.append(str2.substring(j));
		return mergedString.toString();
		
	}
	
	}


