package pepcoding_Recursion_Backtracking_1;

public class last_index_of_Occurence {

public static void main(String[] args) {
		
		int nums[]= {8,5,2,3,7,12,13,14,2,15,7,17};
		
		System.out.println(lioo(nums,0,7));


	}
	
	public static int lioo(int nums[],int index,int target) {
		
		if(index==nums.length) return -1;
		
		int liisa=lioo(nums,index+1,target);
		
		if(liisa==-1) {
			if(nums[index]==target) {
				return index;
			}
			
			else {
				return liisa;
			}
		}
		
		else return liisa;
	}


}
