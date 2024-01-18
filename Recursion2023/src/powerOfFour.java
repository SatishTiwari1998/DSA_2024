
public class powerOfFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=64;
		System.out.println(powerOfFour(n));

	}
	
	public static boolean powerOfFour(int n) {
		if(n<1) return false;
		if(n==1) return true;
		if( n%4==1 || n%4==2 || n%4==3) return false;
		else return powerOfFour(n/4);
		
	}
	

	
	
	

}

