package com.bridgelabz.Arrays;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityArray;

public class Prime 
{
	public static void main(String[] args)
	{
		UtilityArray utility=new UtilityArray();
		System.out.println("Prime between 0 to 1000");
		utility.prime();
		System.out.println("Prime no between 0 to 1000 also pallindrome");
		utility.primePallindrome();
		System.out.println("\nPrime and Anagrams");
		utility.primeAnagrams();
	}
}

