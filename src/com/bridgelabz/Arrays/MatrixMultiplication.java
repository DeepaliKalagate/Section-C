package com.bridgelabz.Arrays;

import java.util.Scanner;

public class MatrixMultiplication 
{
	   public static void main(String args[])
	   {
	      int a, b, p, q, sum = 0, i, j, k;
	 
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter the number of rows and columns of first matrix");
	      a = scanner.nextInt();
	      b = scanner.nextInt();
	 
	      int first[][] = new int[a][b];
	 
	      System.out.println("Enter elements of first matrix");
	 
	      for (i = 0; i < a; i++)
	         for (j = 0; j < b; j++)
	            first[i][j] = scanner.nextInt();
	 
	      System.out.println("Enter the number of rows and columns of second matrix");
	      p = scanner.nextInt();
	      q = scanner.nextInt();
	 
	      if (b != p)
	         System.out.println("The matrices can't be multiplied with each other.");
	      else
	      {
	         int second[][] = new int[p][q];
	         int multiply[][] = new int[a][q];
	 
	         System.out.println("Enter elements of second matrix");
	 
	         for (i = 0; i < p; i++)
	            for (j = 0; j < q; j++)
	               second[i][j] = scanner.nextInt();
	 
	         for (i = 0; i < a; i++)
	         {
	            for (j = 0; j < q; j++)
	            {  
	               for (k = 0; k < p; k++)
	               {
	                  sum = sum + first[i][k]*second[k][j];
	               }
	 
	               multiply[i][j] = sum;
	               sum = 0;
	            }
	         }
	 
	         System.out.println("Product of the matrices:");
	 
	         for (i = 0; i < a; i++)
	         {
	            for (j = 0; j < q; j++)
	               System.out.print(multiply[i][j]+"\t");
	 
	            System.out.print("\n");
	         }
	      }
	   }
}

