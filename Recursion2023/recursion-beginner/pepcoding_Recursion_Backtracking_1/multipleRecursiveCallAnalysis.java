package pepcoding_Recursion_Backtracking_1;

public class multipleRecursiveCallAnalysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		twoCallAnalysis(3);
		

	}
	
	public static void twoCallAnalysis(int n) {
		
		if(n==0) return;
		
		System.out.println("Pre:" + n);
		twoCallAnalysis(n-1);
		System.out.println("In:" + n);
		twoCallAnalysis(n-1);
		System.out.println("Post:" + n);
		
		
	}

}
