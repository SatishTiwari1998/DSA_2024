package pepcoding_Recursion_Backtracking_1;

import java.util.*;

public class check_if_unique_element_exists {

	public static void main(String[] args) {
		// 1,2,3,1,1,1,2,7,2,3,4,3,4,1
		int nums[]= {1,2,2,1,2};
		
		ciuee(nums,0,true);
	}
	
	public static void ciuee(int nums[],int index,boolean flag) {
		
		HashMap<Integer,Integer> map= new HashMap<>();
		flag=true;
		
		//base case
		
		if(index==nums.length-1) {
			flag=false;
			return;
		};
		
		
		
		//CODE
	
		
		if(map.containsKey(nums[index])) {
			
			map.put(nums[index],map.getOrDefault(nums[index], 0)+1);
			
		}
		else {
			map.put(nums[index],1);
		}
		
		ciuee(nums,index+1,flag);
		
		if(map.get(nums[index])==1 && flag==false) {
			
			System.out.println("TRUE");
			
		}
	}
}
