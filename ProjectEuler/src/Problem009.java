
public class Problem009 {

	public static void main(String[] args){
		System.out.print((int)bruteForce());
	}
	
	public static double bruteForce(){
		for(int a = 1; a<1000; a++){
			for(int b = a+1; b<1000; b++){
				int cSquared = (int)Math.pow(a, 2) + (int)Math.pow(b, 2);
				double c = Math.sqrt(cSquared);
				if(a+b+c == 1000){
					return (a*b)*c;//31875000
					
				}
			}
		}
		return -1; //didnt work
	}
	
}
