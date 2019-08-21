package com.bridgelabz.Searching;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BinarySerch 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		File f=new File("home/bridgelabz/test.txt");
		try
		{
		  Scanner scanner=new Scanner(System.in);
		  String arr[]=Utility.fileRead(f);
		  for(String string : arr)
		  {
			  System.out.println(string);
		  }
		  System.out.println("Enter word to search : ");
		  String s1=scanner.nextLine();
		  int i=Utility.binary(arr,s1);
		  if(i < 0)
		  {
			  System.out.println("Word Not Found");
		  }
		  else
		  {
			  System.out.println("Word Found");
		  }
	  }
	  catch(Exception e)
	  {
		 e.printStackTrace();
		 System.out.println("Exception");
	  }
	}
}
