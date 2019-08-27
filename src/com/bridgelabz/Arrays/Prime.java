package com.bridgelabz.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityArray;

public class Prime 
{
	public static void main(String[] args)
	{
		UtilityArray utility=new UtilityArray();
		System.out.println("Prime no between 0 to 1000 also pallindrome");
		utility.primePallindrome();
		System.out.println("\nPrime and Anagrams");
		utility.primeAnagrams();
	}
}

