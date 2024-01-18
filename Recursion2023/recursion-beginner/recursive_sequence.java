//A function f is defined as follows F(N)= (1) +(2*3) + (4*5*6) ... N. 
//Given an integer N the task is to print the F(N)th term.

public class recursive_sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(recursiveSequence(3));

	}
	
	public static long recursiveSequence(int n) {
		return solution(1,n,1);
	}
	
	public static long solution(int start,int num, int count) {
		if(start>num) return 0;
		
		long temp=1;
		
		for(int i=0;i<num;i++) {
			temp*=count;
			count++;
		}
		
		return temp+solution(start,num+1,count);
		
	}

}
