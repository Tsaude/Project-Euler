/*
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 * 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem004 {

	public static void main(String[] args) {
		int largestPalindrome = 0;
		 for (int i =999; i>0; i--){
			 for(int j = 999; j>0; j--){
				 int product = i*j;
				 if(palindrome(String.valueOf(product))&& product>largestPalindrome){
					 largestPalindrome = product;
				 }
			 }
		 }
		 System.out.println(largestPalindrome); //906609

	}
	
	public static boolean palindrome(String s){
		if(s.equals("")||s.length() ==1 ){
			return true;
		}

		else if(s.charAt(0) != s.charAt(s.length()-1)){

			return false;
		}
		else{

			return palindrome(s.substring(1, s.length()-1));
		}
	}

}
