
public class Problem014 {
	
	
	public static void main(String[] args){
		int longestLength = 0;
		int producingNumber = 0;
		System.out.println("Start");
		for(int i = 500000; i<= 1000000; i++){
			int iCollatzLength = lengthOfCollatzSequence(i);
			if(iCollatzLength>longestLength){
				longestLength = iCollatzLength;
				producingNumber = i;
			}
			//System.out.println(i);
		}
		
		System.out.println(longestLength);
		System.out.println(producingNumber);
		
		System.out.println(lengthOfCollatzSequence(910107));
		System.out.println(lengthOfCollatzSequence(837799));
		
		System.out.println(lengthOfCollatzSequence(13));
	}
	
	public static int lengthOfCollatzSequence(double n){
		int count = 1;
		while(n>1){
			if(n%2 == 0){
				n=n/2;
			}
			else{
				n=3*n+1;
			}
			count++;
			//System.out.println(n);

		}
		
		return count;
	}

}
