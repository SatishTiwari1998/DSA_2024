
public class towerOfHanoi {

	public static void main(String[] args) {
		
		toh3("A","B","C",3);

	}
	
	public static void toh3(String A, String B, String C, int n) {
		
		if(n==0) return;
		toh3(A,C,B,n-1);
		System.out.println(n+" "+ A +" --> "+B);
		toh3(C,B,A,n-1);
		
	}

}
