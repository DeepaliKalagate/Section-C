package com.bridgelabz.Arrays;

import java.util.Arrays; 
public class RepeatedNumber
{
  public static void main(String[] args) 
    {
	  int array[] = new int[101];
	   
	    for (int i = 1; i <= 100; i++)
	    {
	        array[i] = i;
	    }
	    array[90]=2;
 
        for (int i = 0; i < array.length-1; i++)
        {
            for (int j = i+1; j < array.length; j++)
            {
                if ((array[i] == array[j]) && (i != j))
                {
                    System.out.println("Repeated Number  : "+array[j]);
                }
            }
        }
    }    
}