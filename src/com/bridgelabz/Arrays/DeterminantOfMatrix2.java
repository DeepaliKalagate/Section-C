package com.bridgelabz.Arrays;

public class DeterminantOfMatrix2 
{
	public static void main(String[] args) 
	{
		int[][] M = { { 1, 0, 5 }, { 2, 1, 6 }, { 3, 4, 0 } };
		int det = M[1][1] * M[2][2] - M[2][1] * M[1][2];
		for (int i = 1; i < 3; i++) 
		{
			for (int j = 1; j < 3; j++) 
			{
				System.out.print(M[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Determinant " + det);

		det = M[1][0] * M[2][2] - M[2][0] * M[1][2];
		for (int i = 1; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++)
			{
				if (j != 1) 
				{
					System.out.print(M[i][j] + " ");
				}

			}
			System.out.println();
		}
		System.out.println("Determinant " + det);

		det = M[1][0] * M[2][1] - M[2][0] * M[1][1];
		for (int i = 1; i < 3; i++) 
		{
			for (int j = 0; j < 2; j++) 
			{

				System.out.print(M[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println("Determinant " + det);

		det = M[0][1] * M[2][2] - M[2][1] * M[0][2];
		for (int i = 0; i < 3; i++)
		{
			for (int j = 1; j < 3; j++)
			{
				if (i != 1)
					System.out.print(M[i][j] + " ");
			}
			if (i != 1)
				System.out.println();
		}
		System.out.println("Determinant " + det);
		
		det = M[0][0] * M[2][2] - M[2][0] * M[0][2];
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				if (i != 1 && j!=1)
					System.out.print(M[i][j] + " ");
			}
			if (i != 1)
				System.out.println();
		}
		System.out.println("Determinant " + det);
		
		det = M[0][0] * M[2][1] - M[2][0] * M[0][1];
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++) 
			{
				if (i != 1 && j!=2)
					System.out.print(M[i][j] + " ");
			}
			if (i != 1)
				System.out.println();
		}
		System.out.println("Determinant " + det);
		
		det = M[0][1] * M[1][2] - M[1][1] * M[0][2];
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				if (i != 2 && j!=0)
					System.out.print(M[i][j] + " ");
			}
			if (i != 2)
				System.out.println();
		}
		System.out.println("Determinant " + det);
		
		det = M[0][0] * M[1][2] - M[1][0] * M[0][2];
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				if (i != 2 && j!=1)
					System.out.print(M[i][j] + " ");
			}
			if (i != 2)
				System.out.println();
		}
		System.out.println("Determinant " + det);
		
		det = M[0][0] * M[1][1] - M[1][0] * M[0][1];
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				if (i != 2 && j!=2)
					System.out.print(M[i][j] + " ");
			}
			if (i != 2)
				System.out.println();
		}
		System.out.println("Determinant " + det);

	}
}
