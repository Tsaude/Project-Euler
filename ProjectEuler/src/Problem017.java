
public class Problem017 {
	public static String[][] wordMap = {{"", "one","two","three","four","five","six", "seven","eight","nine"}, //zero
			{"ten","eleven", "twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"},//one
			{"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"}};//2
	
	
	public static void main(String[] args){
		StringBuilder x= new StringBuilder();
		for(int i = 1; i<= 1000;i++){
			x.append(intToString(i));
		}
		System.out.print(x.toString().length());
	}
	public static String intToString(int n){
		String x = String.valueOf(n);
		if(x.length() == 4){
			return "onethousand";
		}else if(x.length()==3){
			
			int digitOne = Integer.parseInt(x.substring(0,1));
			int digitTwo = Integer.parseInt(x.substring(1,2));
			int digitThree = Integer.parseInt(x.substring(2));
			if(digitTwo == 0){
				if(digitThree== 0){
					System.out.println(wordMap[0][digitOne]+"hundred");
					return wordMap[0][digitOne]+"hundred";
				}
				System.out.println( wordMap[0][digitOne] +"hundredand" + wordMap[0][digitThree]);
				return wordMap[0][digitOne] +"hundredand" + wordMap[0][digitThree];
			}
			if(digitTwo!= 1){
				System.out.println( wordMap[0][digitOne]+"hundredand" + wordMap[2][digitTwo-2] + wordMap[0][digitThree]) ;
				return wordMap[0][digitOne]+"hundredand" + wordMap[2][digitTwo-2] + wordMap[0][digitThree] ;
			}
			else{

				 System.out.println( wordMap[0][digitOne]+"hundredand" + wordMap[1][digitThree]);
				 return wordMap[0][digitOne]+"hundredand" + wordMap[1][digitOne];
			}			
		}else if(x.length()==2){
			int digitOne = Integer.parseInt(x.substring(0,1));
			int digitTwo = Integer.parseInt(x.substring(1));
			if(digitOne!=1){
				System.out.println( wordMap[2][digitOne-2] + wordMap[0][digitTwo]);
				return wordMap[2][digitOne-2] + wordMap[0][digitTwo];
			}
			else{
				System.out.println(wordMap[1][digitTwo]);
				return wordMap[1][digitTwo];
			}
		}
		else{
			System.out.println(wordMap[0][n]);
			return wordMap[0][n];
		}
	}
}
	

