package pepcoding_Recursion_Backtracking_1;

public class power_of_Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPowerOfTwo(16));
		System.out.println(isPowerOfThree(9));
		System.out.println(isPowerOfFour(24));
		

	}
	
	
	public static boolean isPowerOfTwo(int num) {
		
		
		if(num==1) return true;
		if(num>1 && num %2==1) {
			return false;
		}
		
		return isPowerOfTwo(num/2);
		
	}
	
	public static boolean isPowerOfThree(int n) {
	        if(n==1) return true;
	        if(n==0 || n==2) return false;
	
			if(n>1 && (n%3==1 || n%3==2) ){
				return false;
			}
			
			return isPowerOfThree(n/3);
	        
	    }
	
	public static boolean isPowerOfFour(int n) {
        if(n==1) return true;
       if(n==0 || n==2 || n==3) return false;

		if(n>1 && (n%4==1 || n%4==2 || n%4==3) ){
			return false;
		}
		
		return isPowerOfFour(n/4);
       
   }

}
