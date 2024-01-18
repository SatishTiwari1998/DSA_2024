package pepcoding_Recursion_Backtracking_1;

public class print_subsequence {

	public static void main(String[] args) {
		
		printSubsequence("ghy","");
		
		


	}
	
	public static void printSubsequence(String str, String ans) {
		
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		
		char ch=str.charAt(0);
		String remainingString=str.substring(1);
		
		printSubsequence(remainingString,ans+"");
		printSubsequence(remainingString,ans+ch);
	}

}
