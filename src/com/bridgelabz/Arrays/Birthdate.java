package com.bridgelabz.Arrays;

import java.time.LocalDate;
import java.util.Random;

public class Birthdate 
{
    public static void main(String[] args) 
    {
    	System.out.println("Birthdates are : ");
    	for (int i = 0; i < 50; i++) 
        {
            LocalDate randomDate = createRandomDate(1992, 1993);
            System.out.println(randomDate);
        }
        System.out.println("\nThank You!...");
    }

    public static int createRandomDate1(int start, int end) 
    {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public static LocalDate createRandomDate(int startYear, int endYear)
    {
        int day = createRandomDate1(1, 28);
        int month = createRandomDate1(1, 12);
        int year = createRandomDate1(startYear, endYear);
        return LocalDate.of(year, month, day); 
    }
}
