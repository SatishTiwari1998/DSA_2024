package pepcoding_Recursion_Backtracking_1;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(factorial(5));

	}
	
	
	public static int factorial(int n) {
		
		if(n<=1) return 1;
		
		return n*factorial(n-1);
	}

}
