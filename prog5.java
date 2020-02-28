package ch5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    String s,s2="", s1="";
	   System.out.println("enter real number in the string");
	   s = sc.next();
	   StringTokenizer st = new StringTokenizer(s,".");
	    
	     while (st.hasMoreElements())
	     {
	    	 
	    	s1 =  (String) st.nextElement();
	    	s2 =  (String) st.nextElement();
	    	System.out.println(s1+" "+s2);
	     }
	     int i = Integer.parseInt(s1);
	     int f= Integer.parseInt(s2);
	     System.out.println("sum of real part and fractional part = "+(i+f));
	}

}
