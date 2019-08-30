package com.bridgelabz.Arrays;

import java.util.Random;
import java.util.Scanner;

public class RandomWalker 
{
	public static int counter = 0;
	public static int grid;
	public static boolean end = false;
	public static int leftMove = 0, rightMove = 0, topMove = 0, bottomMove = 0;
	public static char[][] board;

	public static void main(String[] args)
	{
		System.out.println("Please enter grid size in odd number from 3 to 9");
		Scanner scanner = new Scanner(System.in);
		grid = scanner.nextInt();

		if (grid % 2 != 0 && grid <= 9 && grid >= 1)
		{
			board = new char[grid][grid];
			for (int i = 0; i < board.length; i++) 
			{
				for (int j = 0; j < board[i].length; j++) 
				{
					board[i][j] = '-';
				}
			}
			if (grid == 3) 
			{
				board[1][1] = 'X';
				printBoard();
			} 
			else if (grid == 5)
			{
				board[2][2] = 'X';
				printBoard();
			} 
			else if (grid == 7)
			{
				board[3][3] = 'X';
				printBoard();
			} 
			else 
			{
				// for grid=9
				board[4][4] = 'X';
				printBoard();
			}
			while (!end) 
			{
				move();
				printBoard();
			}
			if(end) 
			{
				System.out.println("Calculating probability");
				int totalmove=leftMove+rightMove+topMove+bottomMove;
				double prob=totalmove/(counter-1);
				System.out.println("Probability is :"+prob);
				System.out.println("Printing board");
				printBoard();
			}

		} 
		else
			System.out.println("Please enter valid grid");

		scanner.close();
	}

	private static void printBoard()
	{
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++)
		{
			for (int j = 0; j < board[i].length; j++) 
			{
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void move() 
	{
		Random random = new Random();
		int f = random.nextInt(4);// generate 0 to 3
		if (f == 0) 
		{
			moveLeft();
		} 
		else if (f == 1) 
		{
			moveRight();
		} 
		else if (f == 2) 
		{
			moveTop();
		} 
		else 
		{
			moveBottom();
		}
		counter++;
		if (counter == grid * grid) 
		{
			end = true;
		}
	}

	private static void moveBottom() 
	{
		System.out.println("Moving Bottom:");
		for (int i = 0; i < board.length; i++) 
		{
			for (int j = 0; j < board[i].length; j++) 
			{
				if (board[i][j] == 'X') 
				{
					if(i==board.length-1) 
					{
						System.out.println("cannot move further");
						break;
					}
					else
					{
						board[i][j] = '-';
						board[i + 1][j] = 'X';
					}
					
				}
				
			}
		}
		bottomMove++;
	}

	private static void moveTop()
	{
		System.out.println("Moving Top");
		for (int i = 0; i < board.length; i++) 
		{
			for (int j = 0; j < board[i].length; j++) 
			{
				if (board[i][j] == 'X') 
				{
					if(i==0) 
					{
						System.out.println("cannot move further");
						break;
					}
					else
					{
						board[i][j] = '-';
						board[i - 1][j] = 'X';
					}
					
				}
				
			}
		}
		topMove++;
	}

	private static void moveRight() 
	{
		System.out.println("Moving Right");
		for (int i = 0; i < board.length; i++)
		{
			for (int j = 0; j < board[i].length; j++)
			{
				
				if (board[i][j] == 'X')
				{
					if(j==board[i].length-1) 
					{
						System.out.println("cannot move further");
						break;
					}
					else 
					{
						board[i][j] = '-';
						board[i][j + 1] = 'X';
					}
					
				}
			}
		}
		rightMove++;
	}

	private static void moveLeft() 
	{
		System.out.println("Moving Left");
		for (int i = 0; i < board.length; i++) 
		{
			for (int j = 0; j < board[i].length; j++) 
			{
				if (board[i][j] == 'X') 
				{
					if(j==0) 
					{
						System.out.println("cannot move further");
						break;
					}
					else
					{
						board[i][j] = '-';
						board[i][j - 1] = 'X';
					}
					
				}
			}
		}
		leftMove++;
	}
}
