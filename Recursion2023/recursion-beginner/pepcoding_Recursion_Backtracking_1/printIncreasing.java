package pepcoding_Recursion_Backtracking_1;

public class printIncreasing {
	
	// High level thinking----> set your expectation, set your faith -----> Link them both
	// Low level thinking-----> create running stack.....helps to determine the base case.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printIncreasing(7);
	}
	
	public static void printIncreasing(int n) {	
		if(n==0) return;
		printIncreasing(n-1);
		System.out.println(n);
	}

}
