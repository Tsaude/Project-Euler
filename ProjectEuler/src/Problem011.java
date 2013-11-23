
/*
 * What is the greatest product of four adjacent numbers in the same direction (up, down, left, right, or diagonally) in the 20×20 grid?
 */

import java.io.FileInputStream;


public class Problem011 {
	
	public static void main(String[] args){
		int[][] table = getTable("resources/Problem 11 file.txt");
		printTable(table);
		int maxProduct=0;
		int N = table.length;
		int M = table[0].length;
		
		for(int i = 0; i<N; i++){
			for(int j =0; j<M; j++){
				int downProduct= 0;
				int rightProduct= 0;
				int upDiagonally= 0;
				int downDiagonally= 0;
				
				//down
				if(j+3<M){
					downProduct = table[i][j]*table[i][j+1]*table[i][j+2]*table[i][j+3];
				}
				//right
				if(i+3<N){
					rightProduct = table[i][j]*table[i+1][j]*table[i+2][j]*table[i+3][j];
				}
				//upDiagonally
				if(i+3<N && j-3>0){
					upDiagonally = table[i][j]*table[i+1][j-1]*table[i+2][j-2]*table[i+3][j-3];
				}
				
				//downDiagonally
				if(i+3<N && j+3<M){
					downDiagonally = table[i][j]*table[i+1][j+1]*table[i+2][j+2]*table[i+3][j+3];
				}
				
				int tempMaxProduct = Math.max(downProduct, Math.max(rightProduct, Math.max(upDiagonally, downDiagonally)));
				if(tempMaxProduct>maxProduct){
					maxProduct = tempMaxProduct;
				}
			}
		}
		
		System.out.print(maxProduct); //70600674
		
		
	}
	
	public static int[][] getTable(String filename){
		
		try {
	        System.setIn(new FileInputStream(filename));
	    } catch (Exception e) {
	        System.err.printf("Exception caught: %s", e.toString());
	        System.exit(0);
	    }
		
		int[][] table = new int[20][20];
		int lineNumber = 0;
		while(StdIn.hasNextLine()){
			String aline = StdIn.readLine();
			String[] aSplitLine = aline.split(" ");
			for(int i = 0; i<aSplitLine.length;i++){
				table[lineNumber][i] = Integer.parseInt(aSplitLine[i]);
			}
			lineNumber++;
		}
		
		return table;
		
	}
	
	public static void printTable(int[][] table){
		for(int i = 0;i<table.length;i++){
			for(int j = 0; j<table[i].length; j++){
				System.out.printf("%2d ", table[i][j] );
			}
			System.out.println();
		}
	}
	
}
