package com.bridgelabz.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Utility
{
	public static String[] fileRead(File f) throws IOException
	{
		String word= "";
		ArrayList<String> s1=new ArrayList<String>();
		FileReader fr=new FileReader(f);
		int c;
		while((c=fr.read())!=-1)
		{
			if(c==32)
			{
				s1.add(word);
				word="";
			}
			else
			{
				word=word+String.valueOf((char) c);
			}
		}
		fr.close();
		String[] s=new String[s1.size()];
		s1.toArray(s);
		return s;
	}

	public static int binary(String[] arr, String s1)
	{
		int high=arr.length-1, low=0,mid;
		bubbleSortForBinary(arr);

		while (low <= high) {
			mid = (low + high) / 2;
			if (s1.equalsIgnoreCase(arr[mid])) 
			{
				return mid;
			} 
			else if (arr[mid].compareToIgnoreCase(s1) < 0) 
			{
				low = mid + 1;
			} 
			else 
			{
				high = mid - 1;
			}
		}
		return -1;
	}

	private static void bubbleSortForBinary(String[] arr) 
	{
		String temp;
		for( int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].compareToIgnoreCase(arr[j])>0)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void insertionSort(Comparable[] stringarr)
	{
		Comparable temp;
		for(int i=0;i<stringarr.length;i++)
		{
			temp = stringarr[i];
            int j = 0;
            for(j = i; j > 0; j--)
                 if(temp.compareTo(stringarr[j - 1]) < 0)
                      stringarr[j] = stringarr[j - 1];
                 else
                     break;
            stringarr[j] = temp;
		}
		
	}
	
	
	public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
	public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

	public static int binarySearch(int[] arr, int i, int j, int k)
	{
		if (j >= i)
		{ 
            int mid = i + (j - i) / 2;             
            if (arr[mid] == k) 
                return mid; 
            if (arr[mid] > k) 
                return binarySearch(arr, i, mid - 1, k); 
            return binarySearch(arr, mid + 1, j, k); 
        } 
       return -1; 
  	}
}