package com.bridgelabz.Arrays;

import java.util.Scanner;

import com.bridgelabz.utility.UtilityArray;



public class GamlingSimulator {

	public static void main(String[] args) 
	{
		UtilityArray utility=new UtilityArray();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter stake number which you want :");
		int stake=scanner.nextInt();
		System.out.println("Enter goal number : ");
		int goal=scanner.nextInt();
		System.out.println("Enter number of Tries do you want to play: ");
		int tries=scanner.nextInt();
		utility.gamling(stake,goal,tries);
		scanner.close();
	}
	
}
