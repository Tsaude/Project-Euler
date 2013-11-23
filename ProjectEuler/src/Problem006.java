
/*
 * The sum of the squares of the first ten natural numbers is,
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */


public class Problem006 {
	
	
	public static void main(String args[]){
		System.out.println((squareOfSums(100)-sumOfSquares(100)));//25164150
	}
	
	public static int squareOfSums(int n){
		int squareOfSums = 0;
		for(int i = 0; i<= n; i++){
			squareOfSums += i;
		}
		return (int) Math.pow(squareOfSums, 2);
	}
	
	public static int sumOfSquares(int n){
		int sumOfSquares = 0;
		for(int i= 0; i <= n; i++){
			sumOfSquares += Math.pow(i, 2);
		}
		return sumOfSquares;
	}
}
