/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

public class Problem003 {
	public static void main(String args[]){
		//System.out.print(prime(59));
		long n = 600851475143L;
		int largestPrimeFactor = 0;
		for(int i = 2; i < Math.sqrt(n); i++ ){
			if(n%i == 0 && isPrime(i)){
				largestPrimeFactor = i;
			}
		}
		System.out.println(largestPrimeFactor); //6857
	}
	
	public static boolean isPrime(int n){
		int sqrtN = (int)Math.sqrt(n);
		boolean prime = true;
		
		for(int i = 2; i <= sqrtN; i++){
			if(n%i == 0){
				return false;
			}
		}
		
		
		return prime;
	}
}
