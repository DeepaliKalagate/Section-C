package com.bridgelabz.utility;

import java.util.ArrayList;

public class UtilityArray
{
	public boolean isPrime(int n) 
	{
		int c = 0;
		for(int i = 1; i<=n; i++)
		{
			if(n%i == 0)
				c++;
		}
		if(c == 2)
			return true;
		else
			return false;
	}
	
	
	

	
	public static void primePallindrome() 
	{
		System.out.println();
		boolean b;
		System.out.println("Palindrome Numbers:");
		for (int j = 2; j <= 1000; j++) 
		{
			b = true;
			for (int i = 2; i < j / 2; i++) 
			{
				if (j % i == 0) 
				{
					b = false;
					break;
				}
			}
			if (b && isPallindrome(j))
				
				System.out.print(j + " ");
		}
	}

	/**
	 * Function to check if no is anagram or not
	 */
	public static void primeAnagrams()
	{
		ArrayList<Integer> ar = new ArrayList<Integer>();
		System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) 
		{
			b = true;
			for (int i = 2; i < j / 2; i++) 
			{
				if (j % i == 0) 
				{
					b = false;
					break;
				}
			}
			if (b)
				ar.add(j);
		}
		for (int i = 0; i < ar.size(); i++) 
		{
			for (int j = i + 1; j < ar.size(); j++)
			{
				if (anagram(ar.get(i), ar.get(j))) 
				{
					System.out.println(ar.get(i) + "  " + ar.get(j));
				}
			}
		}
	}
	public static boolean isPallindrome(int n) 
	{
		int temp = n;  
		int sum=0;
		  while(n>0)
		  {    
		 int r=n%10;  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   return true; 
		  else    
		   return false;

		
	}
	public static boolean anagram(int n1, int n2) 
	{
		int[] n1count = count(n1);
		int[] n2count = count(n2);
		for (int i = 0; i < n2count.length; i++) 
		{
			if (n1count[i] != n2count[i]) 
			{
				return false;
			}
		}
		return true;
	}
	public static int[] count(int n) 
	{
		int[] count = new int[10];
		int temp = n;
		while (temp != 0)
		{
			int r = temp % 10;
			count[r]++;
			temp = temp / 10;
		}
		return count;
	}
}
