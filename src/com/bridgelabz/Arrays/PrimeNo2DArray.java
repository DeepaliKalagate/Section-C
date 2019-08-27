package com.bridgelabz.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityArray;

public class PrimeNo2DArray
{
	public static void main(String args[])throws IOException
	{
		UtilityArray utility=new UtilityArray();
		PrimeNo2DArray ob = new PrimeNo2DArray();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number of rows : ");
		int m=Integer.parseInt(br.readLine());
		System.out.print("Enter the number of columns : ");
		int n=Integer.parseInt(br.readLine());
		int A[][]=new int[m][n];
		int B[] = new int [m*n];
		int i = 0, j;
		int k = 1; 
		while(i < m*n)
		{
			if(utility.isPrime(k)==true)
			{
				B[i] = k;
				i++;
			}
			k++;
		}
		int x = 0;
		for(i=0; i<m; i++)
		{
			for(j=0; j<n; j++)
			{
				A[i][j] = B[x];
				x++;
			}
		}
		System.out.println("The Final Array is : ");
		for(i=0; i<m; i++)
		{
			for(j=0; j<n; j++)
			{
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
	}
}