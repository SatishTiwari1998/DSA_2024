package pepcoding_Recursion_Backtracking_1;

public class max_Element_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]= {12,45,35,87,67,11,34};
		
		System.out.println(findMax(nums,0));
		System.out.println(findMin(nums,0));

	}
	
	public static int findMax(int nums[], int index) {
		
		if(index==nums.length-1) return nums[index];
		int misa=findMax(nums,index+1);
		return Math.max(nums[index],misa);
	}
	
	public static int findMin(int nums[],int index) {
		if(index==nums.length-1) return nums[index];
		int minisa=findMin(nums,index+1);
		return Math.min(nums[index],minisa);
		
	}

}
