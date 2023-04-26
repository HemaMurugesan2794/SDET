package practiceProblems;

import java.util.Scanner;

import org.junit.Test;

public class PowerOfTwo {

	
	@Test
	public void example1()
	{
		int n =16;
		boolean power=PowerOfTwo(n);
		System.out.println(power);
		
	}
	@Test
	public void example2()
	{
		int n =1;
		boolean power=PowerOfTwo(n);
		System.out.println(power);
		
	}
	@Test
	public void example3()
	{
		int n =3;
		boolean power=PowerOfTwo(n);
		System.out.println(power);
		
	}
		
		
		
		private static boolean PowerOfTwo(int n)
		    {
		        if (n == 0)
		            return false;
		 
		        while (n != 1) {
		            if (n % 2 != 0)
		                return false;
		            n = n / 2;
		        }
		        return true;
		    }

	}


