package pepcoding_Recursion_Backtracking_1;

public class stringReverse {

	public static void main(String[] args) {
		String str=" Hey harsha, How are you now? Feeling better?";
		reverse(str,0);
	}
	
	public static void reverse(String str,int index) {
		if(index==str.length()) return;
		reverse(str,index+1);
		System.out.print(str.charAt(index));
	}

}
