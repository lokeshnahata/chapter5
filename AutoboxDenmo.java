package ch5;

public class AutoboxDenmo
{

	public static void main(String[] args)
	{
	  int i = 42;
	  int result = foo(i);
	  System.out.println(result);
	}
	
	public static Integer foo (Integer i)
	{
		System.out.println(" OBJECT =  "+i);
		return Integer.valueOf(123);
 	}

}
