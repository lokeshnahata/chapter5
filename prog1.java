package ch5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
    String s,s2="", s1="";
    int d=0,sum=0,d1=0,sum1=0;
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
     
     while(i>0)
     {
    	 d=i%10;
    	 sum+=d;
    	 i=i/10;
     }
     System.out.println("sum of real part"+sum);
     while(f>0)
     {
    	 d1=f%10;
    	 sum1+=d1;
    	 f=f/10;
     }
     System.out.println("sum of fractional part"+sum1);
     }
    
	}

