import java.util.*;
import java.io.*;
public class number_factorial {

	public static void main(String[] args) {
		
		System.out.println(recursiveFactorial(7));
		System.out.println(sumUpto(3,5));
		

	}
	
	
	
	public static long recursiveFactorial(long num) {
		
		if(num==0 || num==1) {
			return 1;
		}
		return num*recursiveFactorial(num-1);
	}
	
	public static int sumUpto(int low, int high) {
		if(high==low) return low;
		return high+sumUpto(low,high-1);
		
	}
	public static void revStr(String str) {
		
		if(str.length()==0 || str.length()==1) {
			System.out.println(str);
		}
		
		else {
			System.out.print(str.charAt(str.length()-1));
			revStr(str.substring(0,str.length()-1));
			
		}
		

	}
	
	
	
	
	
	

}
