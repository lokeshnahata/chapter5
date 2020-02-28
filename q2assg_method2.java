package chap5;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class q2
{
	
	public static void main(String args[])

{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter dob dd/mm/yy");
	int dd=sc.nextInt();
	int mm=sc.nextInt();
	int yy=sc.nextInt();
	LocalDate now = LocalDate.now();
	LocalDate bday = LocalDate.of(yy, mm, dd);
	Period diff = Period.between(bday,now);
	
	System.out.println(diff.getYears());
	}
	
	
	}
	
