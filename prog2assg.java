package ch5;

import java.util.Scanner;

public class prog2 
{
	static void findAge(int current_date, int current_month, 
			int current_year, int birth_date, 
			int birth_month, int birth_year) 
{ 
int month[] = { 31, 28, 31, 30, 31, 30, 31, 
					31, 30, 31, 30, 31 }; 

// if birth date is greater then current birth_month, then do not count this month 
// and add 30 to the date so as to subtract the date and get the remaining days 
if (birth_date > current_date)
{ 
	current_month = current_month - 1; 
	current_date = current_date + month[birth_month - 1]; 
} 

// if birth month exceeds current month,  then do not count this year and add 
// 12 to the month so that we can subtract and find out the difference 
if (birth_month > current_month) 
{ 
	current_year = current_year - 1; 
	current_month = current_month + 12; 
} 

// calculate date, month, year 
int calculated_date = current_date - birth_date; 
int calculated_month = current_month - birth_month; 
int calculated_year = current_year - birth_year; 

// print the present age 
System.out.println("Present Age"); 
System.out.println("Years: " + calculated_year + 
	" Months: " + calculated_month + " Days: " + 
	calculated_date); 
} 
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int current_date,current_month,current_year,birth_date,birth_month,birth_year;
        
		System.out.println("enter the current date,month,year");
		current_date = sc.nextInt();
		current_month =sc.nextInt();
		current_year = sc.nextInt();
		System.out.println("enter the birth date,month,year");
        		birth_date = sc.nextInt();
        		birth_month = sc.nextInt();
        		birth_year = sc.nextInt();
        		
        		
       findAge(current_date,  current_month,current_year,  birth_date, birth_month, birth_year); 
       
		
	}

}
