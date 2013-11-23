/*
 * Find the greatest product of five consecutive digits in the 1000-digit number.
 * Number is in resources/Problem 8 file
 */

import java.io.FileInputStream;


public class Problem008 {
	
	public static void main(String args[]){
		try {
	        System.setIn(new FileInputStream("resources/Problem 8 file.txt"));
	    } catch (Exception e) {
	        System.err.printf("Exception caught: %s", e.toString());
	        System.exit(0);
	    }
		String file = StdIn.readString();
		int largestProduct = 0;
		for(int i = 0; i<(file.length() - 4);i++){
			String fiveConsecutiveDigits = file.substring(i,i+5);
			int a = ((int)fiveConsecutiveDigits.charAt(0)) - 48;
			int b = ((int)fiveConsecutiveDigits.charAt(1)) - 48;
			int c = ((int)fiveConsecutiveDigits.charAt(2)) - 48;
			int d = ((int)fiveConsecutiveDigits.charAt(3)) - 48;
			int e = ((int)fiveConsecutiveDigits.charAt(4)) - 48;

			int product = a*b*c*d*e;
			if(product>largestProduct){
				largestProduct = product;
			}
		}
		
		System.out.println(largestProduct);  //40824
	}
	
}
