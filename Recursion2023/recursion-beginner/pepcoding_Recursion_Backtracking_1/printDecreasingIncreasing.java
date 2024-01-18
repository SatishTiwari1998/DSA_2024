package pepcoding_Recursion_Backtracking_1;

public class printDecreasingIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printDecreasingIncreasing(6);
		
		

	}
	
	public static void printDecreasingIncreasing(int n) {
		
		if(n==0) return;
		System.out.println(n);
		printDecreasingIncreasing(n-1);
		System.out.println(n);	
	}

}
