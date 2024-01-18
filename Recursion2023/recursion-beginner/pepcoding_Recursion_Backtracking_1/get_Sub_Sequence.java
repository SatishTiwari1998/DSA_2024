package pepcoding_Recursion_Backtracking_1;

import java.util.*;

public class get_Sub_Sequence {

	public static void main(String[] args) {
		
//	    long ts = System.currentTimeMillis();
//		//System.out.println(gss(str));
//	     String testcase[]= {"abc"};
//	     for(String tc:testcase) {
//	    	 System.out.println(GSS(tc));
//	    	 //System.out.println();
//	     }
//	     long te = System.currentTimeMillis();
//	     System.out.println("Time taken: " + (te-ts));
	     
	     PSS("abc","");

	}
	
	public static ArrayList<String> GSS(String str){
		if(str.length()==0) {
			ArrayList<String> al=new ArrayList<>();
			al.add("");
			return al;
		}
		
		
		char ch=str.charAt(0);
		String remainingString=str.substring(1);
		
		ArrayList<String> recieved_list = GSS(remainingString);
		
		ArrayList<String> new_list=new ArrayList<>();
		
		for(String s:recieved_list) {
			new_list.add(""+s);
			//new_list.add(ch+s);
			
		}
		for(String s:recieved_list) {
			//new_list.add(""+s);
			new_list.add(ch+s);
			
		}
		return new_list;
		


		
	}

	
	public static void PSS(String str,String ans) {
		
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		
		
		char ch=str.charAt(0);
		
		String remainingString=str.substring(1);
		
		PSS(remainingString,ans+"");
		PSS(remainingString,ans+ch);
	}

}
