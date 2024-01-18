package pepcoding_Recursion_Backtracking_1;

import java.util.*;

public class get_keypad_combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String keyCodes[]= {",;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
		String keys="";
		System.out.println(getKPC(keys,keyCodes));

	}
	
	public static ArrayList<String> getKPC(String keys, String codes[]){
		
		if(keys.length()==0) {
			
			ArrayList<String> list = new ArrayList<>();
			list.add("");
			return list;
		}
		
		char key=keys.charAt(0);
		
		String remainingString=keys.substring(1);
		
		ArrayList<String> returned_list=getKPC(remainingString,codes);
		ArrayList<String> list=new ArrayList<>();
		for(int i=0;i<codes[key-'0'].length();i++) {
			
			char key_code=codes[key-'0'].charAt(i);
			
			for(String s:returned_list) {
				list.add(key_code + s );
			}
		}
		return list;
		
	}

}
