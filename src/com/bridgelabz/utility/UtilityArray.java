package com.bridgelabz.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
	
	public static boolean isAnagram(int num1, int num2)
	{
		String str1, str2;
		str1 = String.valueOf(num1);
		str2 = String.valueOf(num2);
		if (str1.length() != str2.length()) 
		{
			return false;
		} 
		else
		{
			char[] ch1 = new char[str1.length()];
			for (int i = 0; i < ch1.length; i++) 
			{
				ch1[i] = str1.charAt(i);
			}
			char[] ch2 = new char[str2.length()];
			for (int i = 0; i < ch2.length; i++) 
			{
				ch2[i] = str2.charAt(i);
			}
			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (Arrays.equals(ch1, ch2))
			{
				return true;
			} 
			else 
			{
				return false;
			}
		}
	}

	public static boolean isPalindrome(int num1)
	{
		int sum = 0;
		int r;
		int temp=num1;
		if (num1 <= 10) 
		{
			return false;
		}
		else 
		{
			while (num1 > 0)
			{
				r = num1 % 10;
				sum = (sum * 10) + r;
				num1 = num1 / 10;
			}
			if (temp == sum)
				return true;
			else
				return false;
		}
	}

	public static int findRepeatedInArray(int[] arr) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i + 1; j < arr.length; j++) 
			{
				if (arr[i] == arr[j]) 
				{
					return arr[i];
				}
			}
		}
		return 0;
	}

	
	public static int couponNumber(int num)
	{
		Random random=new Random();
		int distinct=0,count=0;
		boolean coupon[]=new boolean[num];
		while(distinct<num)
		{
			int no=random.nextInt(num);
			count++;
			if(!coupon[no])
			{
				distinct++;
				System.out.print("\t"+distinct);
				coupon[no]=true;
			}
		}
		return count;
	}
	public void gamling(int stake, int goal, int day) 
	{
		int tempstake = stake;
		int win = 0;
		int loss = 0;
		for (int i = 0; i < day; i++) 
		{
			while (tempstake > 0 && tempstake < goal) 
			{
				if (Math.random() < 0.5) 
				{
					tempstake++;
					win++;
				} 
				else 
				{
					tempstake--;
					loss++;// lose
				}
				if (tempstake == goal)
				{
					win++;
				}
			}
		}

		int arr[][] = new int[2][1];
		arr[0][0] = win;
		arr[1][0] = loss;

		System.out.println("the number of times the game won is " + arr[0][0]);
		System.out.println("The number of times the game loss is " + arr[1][0]);

	}

	public int randomNumber(int range)
	{
		Random random = new Random();
		return (int) random.nextInt(range) + 1;
	}
	
	
}