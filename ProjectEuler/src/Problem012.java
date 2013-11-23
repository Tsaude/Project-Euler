/*
 * What is the value of the first triangle number to have over five hundred divisors?
 */
public class Problem012 {
	
	public static void main(String[] args){
        int triangleNumber = 1;
		while(true){
        	if(countFactors(triangleNumber(triangleNumber))>500){
        		System.out.print(triangleNumber(triangleNumber)); //76576500
        		break;
        	}
        	triangleNumber++;
        }
		
		
	}
	
	public static int triangleNumber(int n){
		int accumulator = 0;
		for(int i = 0; i<=n; i++){
			accumulator += i;
		}
		return accumulator;
	}
	
	
	public static boolean isFactor(int n, int factor){
		if(n%factor == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static int countFactors(int n){
		
		int numberOfFactors = 0;
		for(int i = 1; i<=Math.sqrt(n);i++ ){
			if(isFactor(n,i)){
				numberOfFactors +=2;
			}
		}
		return numberOfFactors;
	}
	
}
