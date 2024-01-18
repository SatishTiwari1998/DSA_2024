package pepcoding_Recursion_Backtracking_1;

public class first_index_of_Occurence {

	public static void main(String[] args) {
		
		int nums[]= {8,5,2,3,7,12,13,14,2,15,7,17};
		
		System.out.println(fioo(nums,0,7));


	}
	
	public static int fioo(int nums[],int index,int target) {
		
		if(index==nums.length) return -1;
		
		if(target==nums[index]) return index;
		else {
			return fioo(nums,index+1,target);
		}
		
		
		
	}

}
