/*
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 * 
 */
public class Problem010 {
	public static void main(String args[]){
		long sumOfPrimes = 2;
		
		for(int i = 3; i<2000000; i+= 2){
			if(Problem003.isPrime(i)){ //check if prime number
				sumOfPrimes += i;
			}
		}
		System.out.print(sumOfPrimes); //142913828922
	}
}
