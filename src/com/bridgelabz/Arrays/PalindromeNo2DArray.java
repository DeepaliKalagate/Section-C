package com.bridgelabz.Arrays;

import com.bridgelabz.utility.UtilityArray;

public class PalindromeNo2DArray 
{
	public static void main(String[] args) 
	{
		UtilityArray utility=new UtilityArray();
		int start = 0;
		int end = 100;

		int[][] primePalindromeNumber = new int[10][];

		int j1 = 0, j2 = 0;
		// declaration of array is done
		for (int i = 0; i < 10; i++) 
		{
			for (int j = start; j <= end; j++) 
			{
				if (utility.isPrime(j)) 
				{
					if (utility.isPalindrome(j)) 
					{
						j1++;
					}
					
				}
			}
			primePalindromeNumber[i] = new int[j1];
			start = end + 1;
			end += 100;
			j1 = 0;

		}
		start = 0;
		end = 100;
		j1 = 0;
		// putting values in array
		for (int i = 0; i < 10; i++)
		{
			for (int j = start; j <= end; j++) 
			{

				if (utility.isPrime(j)) 
				{
					if (utility.isPalindrome(j)) 
					{
					primePalindromeNumber[i][j2] = j;
					j2++;
					}
				}

			}
			start = end + 1;
			end += 100;
			j2 = 0;
		}

		// printing array
		for (int i = 0; i < primePalindromeNumber.length; i++) 
		{
			for (int j = 0; j < primePalindromeNumber[i].length; j++)
				System.out.print(primePalindromeNumber[i][j] + " ");
			System.out.println();
		}

	}
}
