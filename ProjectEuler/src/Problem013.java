import java.io.FileInputStream;

/*
 * Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 */


public class Problem013 {
	
	public static void main(String[] args){
		String filename = "resources/Problem 13 file.txt";
		
		try {
	        System.setIn(new FileInputStream(filename));
	    } catch (Exception e) {
	        System.err.printf("Exception caught: %s", e.toString());
	        System.exit(0);
	    }
		double returnValue = 0.0;
		while(StdIn.hasNextLine()){
			String readLine = StdIn.readLine();
			double fiftyDigitNum = Double.parseDouble(readLine);
			returnValue+=fiftyDigitNum;
					
		}
		
		System.out.print(String.valueOf(returnValue)); //5.537376230390877E51
		
	}
	
}
