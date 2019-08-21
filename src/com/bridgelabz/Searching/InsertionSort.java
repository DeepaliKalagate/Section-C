package com.bridgelabz.Searching;

import com.bridgelabz.utility.Utility;

public class InsertionSort 
{
	public static void main(String[] args) 
	{
		String[] stringarr= {"Java","CPP","Html","Css","Javascript"};
		System.out.println("Unsorted array :");
		for(String string : stringarr)
		{
			System.out.print(" "+string);
		}
		System.out.println();
		Utility.insertionSort(stringarr);
		System.out.println("Sorted Array : ");
		for(String string : stringarr)
		{
			System.out.print(" "+string);
		}
		System.out.println();
	}

	

}
