package com.bridgelabz.Arrays;

import java.util.Scanner;
public class MatrixMultiplication
{
    public static void main(String args[])
    {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of squared matrices");
        n = scanner.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];
        int[][] d= new int[n][n];
        System.out.println("Enter the elements of 1st martix row wise \n");
        for (int i = 0; i < n; i++)
        {
        	for (int j = 0; j < n; j++)
            {
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd martix row wise \n");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                b[i][j] = scanner.nextInt();
            }
        }
        //Multiplying the matrices...
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                for (int k = 0; k < n; k++)
                {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
       System.out.println("The  Array Of  A*B Answer is:");
       for (int i = 0; i < n; i++)
       {
           for (int j = 0; j < n; j++)
           {
               System.out.print(c[i][j] + " ");
           }
           System.out.println();
       }
        //System.out.println("The Result is : ");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                for (int k = 0; k < n; k++)
                {
                    d[i][j] = d[i][j] + b[i][k] * a[k][j];
                }
            }
        }
        System.out.println("The Array of B*A Answer is:");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();

    }

}
