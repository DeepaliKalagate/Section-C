package com.bridgelabz.Searching;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Register 
{
	public static void main(String[] args) 
	{	
		//First Name
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First name: ");
		String name=s.nextLine();
		Pattern pattern = Pattern.compile("[A-Z][a-z]+{3,20}");
		Matcher matcher = pattern.matcher(name);
		String st2=new String("Your name is:<<firstName>>");
		if (matcher.matches()) 
		{
			st2=st2.replaceAll("<<firstName>>",name);
		    System.out.println(st2);
		}
		else
		{
		    	  System.out.println("Your name Should be only letters");
		}	
	/*	//Last Nmae
		System.out.println("Enter Last name: ");
		String name1=s.nextLine();
		Pattern pattern1 = Pattern.compile("[A-Z][a-z]+");
		Matcher matcher1 = pattern.matcher(name1);
		String st=new String();
		if (matcher.matches()) 
		{
			st=st.replaceAll("<<LastName>>",name1);
			System.out.println(st);
	    }
	    else
	    {
	    	  System.out.println("Your name Should be only letters");
	    }
	
		//Email
		System.out.println("Enter email: ");
		String email=s.nextLine();
		Pattern pattern2 = Pattern.compile("^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@”+”[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$”+");
		Matcher matcher2 = pattern.matcher(email);
		String st1=new String();
		if (matcher.matches()) 
		{
			st1=st1.replaceAll("<<Email>>",email);
			System.out.println(st1);
	    }
	    else
	    {
	    	  System.out.println("Enter Valid Email ID");
	    }
		
		//Mobile Number
				System.out.println("Enter mobile number: ");
				String mobno=s.nextLine();
				Pattern pattern3 = Pattern.compile("\\d{3}-\\d{7}");
				Matcher matcher3 = pattern.matcher(mobno);
				String st3=new String();
				if (matcher.matches()) 
				{
					
					st3=st3.replaceAll("<<mobileNumber>>",mobno);
				    	  System.out.println(st3);
				      }
				      else
				      {
				    	  System.out.println("Phone Number must be in the form XX-XXXXXXXX");
				      }
				
		//User Id
				System.out.println("Enter User name: ");
				String user=s.nextLine();
				Pattern pattern4 = Pattern.compile("[A-Z][a-z]+([A-Z][a-z]+)");
				Matcher matcher4 = pattern4.matcher(user);
				String stn=new String();
				if (matcher4.matches()) 
				{
					stn=stn.replaceAll("<<UserName>>",user);
				    System.out.println(stn);
				}
				else
				{
				    	  System.out.println("Your name Should be only letters");
				}	
		//Password
				
		System.out.println("Enter Password: ");
		String password=s.nextLine();
		Pattern pattern5 = Pattern.compile("((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,20})");
		Matcher matcher5 = pattern5.matcher(password);
		String stn1=new String();
		if (matcher5.matches()) 
		{
			stn1=stn1.replaceAll("<<Password>>",password);
			System.out.println(stn1);
			
		}
		else
		{
			System.out.println("Your password Should be minimum 8 characters");
		}	*/
		System.out.println("Thank you for register!");	
	}
}
