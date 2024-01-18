package pepcoding_Recursion_Backtracking_1;

import java.util.Arrays;

public class All_Indices_of_occurence {

	public static void main(String[] args) {
		int nums[]= {8,5,2,3,7,12,13,14,2,15,7,17,7,1,1,3,5,5,2,1,7,6,1,6,8};
		
		System.out.println(Arrays.toString(aioo(nums,12,0,0)));
		
		
		// Jate huye count kar rahe hai ki target kitni baar occur hua hai......
		// base case pe count ke length ka array return kar rahe hai
		// Aate waqt array ko fill kar rahe hai

	}
	
	public static int[] aioo(int nums[],int target,int index, int count) {
		
		if(index==nums.length) {
			return new int[count];
		}
		
		if(nums[index]==target) {
			int ans[]=aioo(nums,target,index+1,count+1);
			ans[count]=index;
			return ans;
		}
		else {
			int ans[]= aioo(nums,target,index+1,count);
			return ans;
		}
	}

}
