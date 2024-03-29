import java.util.*;
public class leetcode_3005 {

	public static void main(String[] args) {
		
		int nums[]=new int[]{10,12,11,9,6,19,11};
		System.out.println(maxFrequencyElements(nums));

	}
	
	public static int maxFrequencyElements(int[] nums) {
		
		int max=0;
		
		for(int k:nums) {
			max=Math.max(max, k);
		}

        int freq[]=new int[max+1];

        for(int i=0;i<nums.length;i++){
            nums[i]=freq[nums[i]]++;
        }

        Arrays.sort(freq);

        int key=freq[freq.length-1];
        int sum=0;

        for(int i=freq.length-1;i>=0;i--){
            if(freq[i]==key){
                sum+=key;
            }
            else break;
        }

        return sum;
    }

}
