import java.util.Arrays;

public class frequency_Array {

	public static void main(String[] args) {
		
		int nums[]=new int[] {1,1,1,1,1,0,0,0,2,2,3,1,3,2,0,1};
		
		int ans[]=freq_arr(nums);
		System.out.println(Arrays.toString(ans));
	}
	
	public static int[] freq_arr(int arr[]) {
		
		int freq[]=new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=freq[arr[i]]++;
		}
		
		return freq;	
	}
	
	
}
 