package practiceProblems;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		
		while(num>0)
		{
			sum = sum +(num%10);
			num = num/10;
			if(num==0 && sum>9)
			{
				num = sum;
				sum =0;
			}
		}
		System.out.println("Sum of Digits is :" +sum);
		
	
	}

}
