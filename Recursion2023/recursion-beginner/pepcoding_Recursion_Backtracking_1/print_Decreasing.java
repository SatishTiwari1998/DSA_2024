package pepcoding_Recursion_Backtracking_1;

public class print_Decreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printDecreasing(5);
		

	}
	
	public static void printDecreasing(int n) {
		
		if(n==0) return;
		
		System.out.println(n);
		printDecreasing(n-1);
		
	}

}
