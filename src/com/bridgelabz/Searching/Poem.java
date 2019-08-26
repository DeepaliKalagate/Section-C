package com.bridgelabz.Searching;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;
public class Poem 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		char userinput;
		Scanner scanner=new Scanner(System.in);
		System.out.println("please select menu");
		System.out.println("a. Chicks ­ chick\n"
					+ "b. Duck ­ quack\n"
					+ "c. Turkey ­ gobble\n"
					+ "d. Pig ­ oink, oink\n"
					+ "e. Cow ­ moo, moo\n"
					+ "f. Cat ­meow, meow\n"
					+ "g. Mule ­ Heehaw\n" 
					+ "h. Dog ­ bow wow\n" 
					+ "i. Turtle ­ nerp, nerp\n"
					);
		userinput=scanner.next().charAt(0);
		switch (userinput)
		{
			case 'a':
				utility.poem("Chicks", "chick");
				break;
			case 'b':
				utility.poem("Duck", "quack");
				break;
			case 'c':
				utility.poem("Turkey", "gobble");
				break;
			case 'd':
				utility.poem("Pig", "oink");
				break;
			case 'e':
				utility.poem("Cow", "moo");
				break;
			case 'f':
				utility.poem("Cat", "meow");
				break;
			case 'g':
				utility.poem("Mule", "Heehaw");
				break;
			case 'h':
				utility.poem("Dog", "bow");
				break;
			case 'i':
				utility.poem("Turtle", "nerp");
				break;
			default:
				System.out.println("Select proper input");
				break;
			}
			scanner.close();
	}
}

