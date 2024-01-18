
public class fibonaci_ka_postmartum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fs(4));

	}
	
	public static int fs(int n) {
		
		if(n==0) return 0;
		if(n==1) return 1;
		
		System.out.println(n+"pre");
		int a= fs(n-1);
		System.out.println(n+"In");
		int b=fs(n-2);
		System.out.println(n+"Post");
		
		return a+b;
		
		
		
	}

}
