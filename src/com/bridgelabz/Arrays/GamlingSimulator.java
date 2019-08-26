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
		gamling(stake,goal,tries);
		scanner.close();
	}
	public static void gamling(int stake, int goal, int tries) 
	{
		int win=0;
		 int trails=0;
		 for(int i=0;i<tries;i++) 
		 {
			 int money=stake;
			 while(money>0 && money<goal)
			 {
				 if(Math.random()>0.5) 
				 {
					 money++;
					 trails++;
				 }
				 else 
				 {
				 		money--;
				 		trails++;
				 	}
			 }
			 if(money==goal)
				 win++;	
		 }
		 System.out.print(win+"\t");
		 System.out.print((tries-win));
		 
	}
}
