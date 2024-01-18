package pepcoding_Recursion_Backtracking_1;

public class power_x_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(power(2.14,3));
		System.out.println(powerLogarithmic(2.14,3));

	}
	
	public static double power(double x,int n) {
		if(n==0) return 1;
		
		double xn=power(x,n-1);
		
		return x*xn;
	}
	
	public static double powerLogarithmic(double x, int n) {
		if(n==0) return 1;
		
		double xpnb2=powerLogarithmic(x,n/2);
		
		double xpn=xpnb2*xpnb2;
		
		if(n%2==1) {
			xpn=xpn*x;
		}
		return xpn;
	}

}
