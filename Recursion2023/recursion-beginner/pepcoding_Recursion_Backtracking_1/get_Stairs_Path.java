package pepcoding_Recursion_Backtracking_1;

import java.util.ArrayList;

public class get_Stairs_Path {

	public static void main(String[] args) {
		
		System.out.println(getSP(6));
		System.out.println(getSP(6).size());

	}
	
	public static ArrayList<String> getSP(int n){
		
		if(n==0) {
			ArrayList<String> list = new ArrayList<>();
			list.add("");
			return list;
		}
		else if(n<0) {
			ArrayList<String> list = new ArrayList<>();
			return list;
		}
		
		
		ArrayList<String> path_1=getSP(n-1);
		ArrayList<String> path_2=getSP(n-2);
		ArrayList<String> path_3=getSP(n-3);
		
		ArrayList<String> paths=new ArrayList<>();
				
		
		for(String path:path_1) {
			paths.add(1+path);
		}
		for(String path:path_2) {
			paths.add(2+path);
		}
		for(String path:path_3) {
			paths.add(3+path);
		}
		
		return paths;
		
	}

}
