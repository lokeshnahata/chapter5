package ch5;

public class LogBase
{

	public static void main(String[] args)
	{
		double d = LogBase.log_base(10,1000);
		System.out.println("log10(1000) = "+d);
	}
	public static double log_base(double base, double value) {
		return Math.log(value) / Math.log(base);
		}

}
