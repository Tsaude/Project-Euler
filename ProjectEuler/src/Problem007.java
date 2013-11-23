/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10,001st prime number?
 */
public class Problem007 {
	public static void main(String args[]){
		int primeNumberCount = 0;
		int i = 2;
		while(true){
			if(Problem003.isPrime(i)){  //Used isPrime function from Problem3
				primeNumberCount++;
				if(primeNumberCount == 10001){
					System.out.print(i);  //104743
					break;
				}
			}
			i++;
		}
	}
}
