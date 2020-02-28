package ch5;

import java.util.BitSet;

public class NumSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= months.length; i++)
			 System.out.println("Month # " + i);
			 // When you want a set of array indices, use a for loop
			 // starting at 0.
			 for (int i = 0; i < months.length; i++)
			 System.out.println("Month " + months[i]);
			 // For e.g., counting by 3 from 11 to 27, use a for loop
			 for (int i = 11; i <= 27; i += 3) {
			 System.out.println("i = " + i);
			 }
			 // A discontiguous set of integers, using a BitSet
			 // Create a BitSet and turn on a couple of bits.
			 BitSet b = new BitSet();
			 b.set(0); // January
			 b.set(3); // April
			 b.set(8); // September
			 // Presumably this would be somewhere else in the code.
			 for (int i = 0; i<months.length; i++) {
			 if (b.get(i))
			 System.out.println("Month " + months[i]);
			 }
			 // Same example but shorter:
			 // a discontiguous set of integers, using an array
			 int[] numbers = {0, 3, 8};
			 for (int n : numbers)
			 {
				 System.out.println("Month: " + months[n]);
	}

}
	protected static String months[] = { "January", "February", "March", "April", "May", "June", "July", "August","September", "October", "November", "December"};
	}

	
