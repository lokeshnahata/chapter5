package ch5;

import java.util.Scanner;

public class prog5_1 
{

	public static void main(String[] args)
	{
		String anumber  = args[0];
		
		/*String anumber;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the string ");
		anumber = sc.next();
		*/
		double result;
		
		try
		{
			result = Double.parseDouble(anumber);
			System.out.println("Number is  "+ result);
		}catch(NumberFormatException exc) {
			System.out.println("invalid number "+anumber);
			return;
		}
		

	}

}
