package com.bridgelabz.Arrays;

import java.util.Scanner;

public class PowerOf2 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number which is greater than 10");
		//Scanner scan = new Scanner(System.in);
	     int n = scanner.nextInt();
	     int power =(int) Math.pow(2, n);
	     System.out.println("2^"+n+"="+power);
	    int  unit = power;
	    int ten = power;
	    int hundred = power;
		int mat[][] = new int[2][2];

	    while(10 < unit)          // take digit position as unit
	     {
	    	 unit = unit / 10;
	    	 
	     }
	     while( 100 < ten)        // take digit position as ten
	     {
	    	 ten = ten/10;
	    	
	     }
	     while(1000 < hundred)   // take digit position as hundred
	     {
	    	 hundred = hundred/10;
	     }
	     
	     
	    System.out.println("Unit of"+power+"="+unit);
	    System.out.println("ten of"+power+"="+ten);
	    System.out.println("hundred of"+power+"="+hundred);
	   
	}

}



