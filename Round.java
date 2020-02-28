package ch5;

public class Round
{
    public static final Double THRESHOLD = 0.54;
    
    public static int round (double d) 
    {
    	return (int)Math.floor(d+1.0 - THRESHOLD);
    	
    }
	public static void main(String[] args) 
	{
	 for(double d = 0.1;d<=1.0;d+=0.05)	 
	 {
    System.out.println(" my way : "+d+" -> "+ round(d));
    System.out.println("math way : "+d+ " -> "+Math.round(d)); 
	 }
   }
}
