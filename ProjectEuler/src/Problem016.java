import java.math.BigInteger;


public class Problem016 {
	public static void main(String[] args){
		BigInteger n = BigInteger.valueOf(2).pow(1000);
		String x = n.toString();
		int v = 0;
		for(int i = 0; i<x.length(); i++){
			v+= ((int)x.charAt(i)) - 48;
		}
		System.out.print(v);
		
	}
}
