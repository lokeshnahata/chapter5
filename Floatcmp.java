package ch5;

public class Floatcmp 
{
	final static double EPSILON = 0.0000001;
	
	public static void main(String[] args) 
	{
		double da = 3 * .3333333333;
		double db = 0.99999992857;
		
		     if (da == db) 
		     {
			System.out.println("Java considers " + da + "==" + db);
			
			}
		    else if (equals(da, db, 0.0000001)) 
		    {
			System.out.println("Equal within epsilon " + EPSILON);
			} 
		     else 
		     {
			System.out.println(da + " != " + db);
			}
			System.out.println("NaN prints as " + Double.NaN);
			
			double nan1 = Double.NaN;
			double nan2 = Double.NaN;
			
			if (nan1 == nan2)
			System.out.println("Comparing two NaNs incorrectly returns true.");
			
			else
			System.out.println("Comparing two NaNs correctly reports false.");
			
			if (new Double(nan1).equals(new Double(nan2)))
			System.out.println("Double(NaN).equals(NaN) correctly returns true.");
			
			else
			System.out.println("Double(NaN).equals(NaN) incorrectly returns false.");
			
			}
	  public static boolean equals(double a, double b, double eps) 
	   {
		if (a==b) return true;
		
		return Math.abs(a - b) < eps;
		}
	  
	  public static boolean equals(double a, double b) 
	  {
		  return equals(a, b, EPSILON);
	  }
	}

