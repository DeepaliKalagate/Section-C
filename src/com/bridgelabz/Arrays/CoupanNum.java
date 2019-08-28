package com.bridgelabz.Arrays;

import java.util.Scanner;

import com.bridgelabz.utility.UtilityArray;

public class CoupanNum
{
	public static void main(String[] args) 
	{
		UtilityArray utility=new UtilityArray();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of coupons to be generated");
		int num=scanner.nextInt();
		int res=utility.couponNumber(num);
		System.out.println("\nNumber of random numbers needed: "+ res);
		
	}
}

