package com.bridgelabz.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityArray;

public class AnagramNo2DArray
{
	public static void main(String[] args)
	{
		UtilityArray utility=new UtilityArray();
		int start = 0;
		int end = 100;

		int[][] primeAnagramNumber = new int[10][];

		int j1 = 0, j2 = 0;
		// declaration of array is done
		for (int i = 0; i < 10; i++) 
		{
			for (int j = start; j <= end; j++)
			{
				if (utility.isPrime(j)) 
				{
					for (int k = j + 1; k < end; k++) 
					{
						if (utility.isPrime(k)) 
						{
							if (utility.isAnagram(j, k)) 
							{
								j1 += 2;
							}
						}
					}
				}
			}
			primeAnagramNumber[i] = new int[j1];
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
					for (int k = j + 1; k < end; k++) 
					{
						if (utility.isPrime(k))
						{
							if (utility.isAnagram(j, k))
							{
								primeAnagramNumber[i][j2]=j;
								primeAnagramNumber[i][j2+1]=k;
								j2 += 2;
							}
						}
					}

				}
			}
			start = end + 1;
			end += 100;
			j2 = 0;
		}

		// printing array
		for (int i = 0; i < primeAnagramNumber.length; i++) 
		{
			for (int j = 0; j < primeAnagramNumber[i].length; j++)
				System.out.print(primeAnagramNumber[i][j] + " ");
			System.out.println();
		}
	}
}

