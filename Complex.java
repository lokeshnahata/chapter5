package ch5;

public class Complex
{
	/** The real part */
	private double r;
	/** The imaginary part */
	private double i;
	/** Construct a Complex */
	Complex(double rr, double ii)
	{
	r = rr;
	i = ii;
	}
	public String toString() {
		StringBuffer sb = new StringBuffer().append(r);
		if (i>0)
		sb.append('+');
		
		return sb.append(i).append('i').toString();
		}
		
		public double getReal() 
		{
		return r;
		}
		
		public double getImaginary() 
		{
		return i;
		}
		
		public double magnitude() 
		{
		return Math.sqrt(r*r + i*i);
		}
		public Complex add(Complex other) {
			return add(this, other);
			}
			
			public static Complex add(Complex c1, Complex c2) {
			return new Complex(c1.r+c2.r, c1.i+c2.i);
			}
			
			public Complex subtract(Complex other) {
			return subtract(this, other);
			}
			
			public static Complex subtract(Complex c1, Complex c2) {
			return new Complex(c1.r-c2.r, c1.i-c2.i);
			}
			public Complex multiply(Complex other) {
				return multiply(this, other);
			}
			
			public static Complex multiply(Complex c1, Complex c2) {
				return new Complex(c1.r*c2.r - c1.i*c2.i, c1.r*c2.i + c1.i*c2.r);
				}
				
				public static Complex divide(Complex c1, Complex c2) {
				return new Complex(
				(c1.r*c2.r+c1.i*c2.i)/(c2.r*c2.r+c2.i*c2.i),
				(c1.i*c2.r-c1.r*c2.i)/(c2.r*c2.r+c2.i*c2.i));
				}
				/* Compare this Complex number with another
				*/
				public boolean equals(Object o)
				{
				if (o.getClass() != Complex.class) 
				{
				throw new IllegalArgumentException("Complex.equals argument must be a Complex");
				}
				Complex other = (Complex)o;
				return r == other.r && i == other.i;
				}
				
				public int hashCode() 
				{
				return (int)(r) | (int)i;
				}
				
				public static void main(String[] args)
				{
					Complex c = new Complex (3, 5);
					Complex d = new Complex (2,-2);
					System.out.println(c);
					System.out.println(c+" .getReal() = "+ c.getReal());
					System.out.println(c+ " + "+d+" = "+c.add(d));
					System.out.println(c+" = "+d+" = "+Complex.add(c,d));
					System.out.println(c+" * "+d+ " = "+c.multiply(d));
					System.out.println(Complex.divide(c,d));
					
				}
				}
				

