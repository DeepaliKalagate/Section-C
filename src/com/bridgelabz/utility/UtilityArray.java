package com.bridgelabz.utility;

import java.util.ArrayList;

public class UtilityArray
{
	
	 public static void prime()
	 {
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
					System.out.print(j + " ");
			}
		}
	public static boolean isPrime(int n) 
	{
		for (int i = 2; i < n / 2; i++) 
		{
			if (i % n == 0) 
			{
				return false;
			}
		}
		return true;
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
		int sum = 0;
		while (temp != 0) 
		{
			int r = temp % 10;
			sum = sum * 10 + r;
			temp = temp / 10;
		}
		if (sum == n) 
		{
			return true;
		}
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
