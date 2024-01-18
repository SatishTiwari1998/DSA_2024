package pepcoding_Recursion_Backtracking_1;

public class sumOfElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]= {8,5,2,3,7,12,13};
		
		System.out.println(arraySum(nums,0));

	}
	
	public static int arraySum(int nums[],int index) {
		
		if(index==nums.length-1) return nums[index];
		
		return nums[index]+arraySum(nums,index+1);
	}

}
