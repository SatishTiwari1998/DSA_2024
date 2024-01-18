package pepcoding_Recursion_Backtracking_1;

public class towerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		toh1(3,"A","B","C");

	}
	
	public static void toh1(int n, String A,String B,String C) {
		
		if(n==0) return;
		
		toh1(n-1,A,C,B);
		System.out.println("Move Disk " + n + " from tower " + A + " to " + B);
		toh1(n-1,C,B,A);
	}

}
