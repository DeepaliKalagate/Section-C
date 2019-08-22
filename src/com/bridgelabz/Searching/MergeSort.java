package com.bridgelabz.Searching;

import com.bridgelabz.utility.Utility;

public class MergeSort 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		String[] first= {"Java","Cpp","Css","Html","AngularJS"};
		String[] second= {"Mango","Apple","Banana","Orange","Pineapple"};
		String[] third=new String[first.length+second.length];
		utility.mergeSort(first);
		utility.mergeSort(second);
		
		utility.merge(third,first,second);
		utility.merge(third);
		
		System.out.println("Merged Array is: \n");
		for(String fourth:third)
		{
			System.out.print(" " +fourth);
		}
	}
}
