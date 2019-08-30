package com.bridgelabz.Arrays;

import java.time.LocalDate;
import java.util.Random;

public class BirthDay
{
	public static void main(String[] args)
	{
		int n = 10;
		int month[] = new int[n];
		int year[] = new int[n];
		int date[] = new int[n];

		String individual[] = new String[n];
		for (int i = 0; i < n; i++)
		{
			int MonthValue = (int) (Math.random() * 12) + 1;
			int YearValue = (int) (Math.random() * 2) + 92;
			int DateValue = (int) (Math.random() * 31) + 1;

			month[i] = MonthValue;
			year[i] = YearValue;
			date[i] = DateValue;

			individual[i] = MonthValue + " / " + DateValue + " / " + YearValue;

		}
		int count[] = new int[12];

		for (int i = 0; i < n; i++)
		{
			System.out.println(individual[i]);
		}
		System.out.println();

		for (int i = 0; i < n; i++) 
		{
			if (month[i] == 1)
			{
				count[0]++;

			} 
			else if (month[i] == 2)
			{
				count[1]++;

			} 
			else if (month[i] == 3)
			{
				count[2]++;

			} 
			else if (month[i] == 4) 
			{
				count[3]++;

			}
			else if (month[i] == 5) 
			{
				count[4]++;

			} 
			else if (month[i] == 6)
			{
				count[5]++;

			} 
			else if (month[i] == 7)
			{
				count[6]++;

			}
			else if (month[i] == 8)
			{
				count[7]++;

			} 
			else if (month[i] == 9) 
			{
				count[8]++;

			} 
			else if (month[i] == 10) 
			{
				count[9]++;

			} 
			else if (month[i] == 11) 
			{
				count[10]++;

			} 
			else if (month[i] == 12) 
			{
				count[11]++;

			} 
			else
			{
				System.out.println("no month has been repeated ");
			}
		}

		for (int i = 0; i < count.length; i++) 
		{

			if (count[i] > 1) 
			{
				System.out.println("Month " + (i + 1) + " has occured " + count[i] + " times");

			}

		}

	}

}
