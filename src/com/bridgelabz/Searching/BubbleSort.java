package com.bridgelabz.Searching;

import com.bridgelabz.utility.Utility;

public class BubbleSort
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
        int arr[] = {94, 78, 55, 12, 33, 44, 88};
        System.out.println("Before Sorted : ");
        for(int str : arr)
        	System.out.print(" "+str);
        System.out.println("\nSorted array: ");
        
        Utility.bubbleSort(arr);
        Utility.printArray(arr);
	}

}
