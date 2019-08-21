package com.bridgelabz.Searching;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BinarySearch 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		c=scanner.nextInt();
		b=(int) Math.pow(2, c);
		int[] arr=new int[b];
		int n=arr.length;
		
		for(int i=0;i<b;i++)
		{
			arr[i]=i;
		}
		System.out.println("Enter a number between 0 & " +(b-1));
        a=scanner.nextInt();
		
		int result = Utility.binarySearch(arr, 0, n - 1, a); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
        scanner.close();
	}

}
