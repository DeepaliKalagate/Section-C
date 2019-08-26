package com.bridgelabz.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Utility
{
	// Method for Binary Searching-Find word from File
	public static int binarySerch(String[] arr, String x) 
    { 
		 int l = 0, r = arr.length - 1; 
	        while (l <= r) { 
	            int m = l + (r - l) / 2; 
	  
	            int res = x.compareTo(arr[m]); 
	  
	            // Check if x is present at mid 
	            if (res == 0) 
	                return m; 
	  
	            // If x greater, ignore left half 
	            if (res > 0) 
	                l = m + 1; 
	  
	            // If x is smaller, ignore right half 
	            else
	                r = m - 1; 
	        } 
	  
	        return -1; 
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

	//Method for Insertion Sort
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
	
	//Method for Bubble Sort
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

	//Method for Binary Search
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

	public void mergeSort(String[] first) 
	{
		
		
	}

	public void merge(String[] third, String[] first, String[] second) 
	{
		 int a = 0;
	        int b = 0;
	        for (int i = 0; i < third.length; i++) 
	        {
	            if (b >= second.length || (a < first.length && first[a].compareToIgnoreCase(second[b]) < 0)) 
	            {
	            	third[i] = first[a];
	                a++;
	            } else 
	            {
	            	third[i] = second[b];
	                b++;
	            }
	        }
		
	}

	public void merge(String[] third) 
	{
		if (third.length > 2) 
		{
            String[] left = new String[third.length / 2];
            String[] right = new String[third.length - third.length / 2];

            for (int i = 0; i < left.length; i++) 
            {
                left[i] = third[i];
            }

            for (int i = 0; i < right.length; i++) 
            {
                right[i] = third[i + third.length / 2];
            }

            mergeSort(left);
            mergeSort(right);
            merge(third, left, right);
        }
		
	}

	public static void sort(String[] arr)
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
	public void poem(String animal,String sound) 
	{
		String str="Old MACDONALD had a farm\n" + 
				"E-I-E-I-O\n" + 
				"And on his farm he had a ANIMAL\n" + 
				"E-I-E-I-O\n" + 
				"With a SOUND SOUND here\n" + 
				"And a SOUND SOUND there\n" + 
				"Here a SOUND, there a SOUND\n" + 
				"Everywhere a SOUND SOUND\n" + 
				"Old MacDonald had a farm\n" + 
				"E-I-E-I-O";
		String replaceString=str.replaceAll("ANIMAL", animal);
		String replaceString2=replaceString.replaceAll("SOUND", sound);
		
		System.out.println(replaceString2);
	}
	
	
		
	
}
