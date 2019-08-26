package com.bridgelabz.Arrays;
import java.util.Scanner;


public class Exp 
{
	public static void main(String args[])
		   {
		
		int array[] = new int[101];
		   
	    for (int i = 1; i <= 100; i++)
	    {
	        array[i] = i;
	    }
	    array[8]=2;
	    array[90]=2;
	    
		checkNumber(array);
		      
		   }
		      public static int checkNumber(int [] array)
				{
					int i,j;
					
					for(i=0;i<array.length-1;i++)
					{
						for(j=i+1;j<array.length;j++)
						{
							if(array[i]==array[j])
							{
								
								System.out.println(array[i]);
								break;
							}
							
						}
					}
					
					return array[i];
				}
		   
}
