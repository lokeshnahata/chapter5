package ch5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class prog4 {

	public static void main(String[] args) 
	{
		String pattern = "\\d+";
		Scanner sc = new Scanner(System.in);
		String s;
		int sum=0;
		s = sc.next();
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(s);
		while(m.find())
		{  String s1 =m.group();
			sum = sum+ Integer.parseInt(s1);
		}
		System.out.println(sum);
	}

}
