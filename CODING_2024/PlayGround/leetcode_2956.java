import java.util.*;
public class leetcode_2956 {

	public static void main(String[] args) {
			
		int nums1[]=new int[] {4,3,2,3,1};
		int nums2[]=new int[] {2,2,5,2,3,6};
		
		System.out.println(Arrays.toString(findIntersectionValues(nums1,nums2)));
	}
	
	 public static int[] findIntersectionValues(int[] nums1, int[] nums2) {

	        int freq1[]=new int[10];
	        int freq2[]=new int[10];

	        for(int i=0;i<nums1.length;i++){
	          nums1[i]=freq1[nums1[i]]++; 
	        }
	        System.out.println("Freq:1 "+Arrays.toString(freq1));

	        for(int i=0;i<nums2.length;i++){
	            nums2[i]=freq2[nums2[i]]++;
	        }
	        System.out.println("Freq:2 "+Arrays.toString(freq2));

	        int arr_12=0;
	        int arr_21=0;
	        
	        System.out.println("I am looking for "+ freq2[nums1[2]]);
	        
	        

	        return new int[]{arr_21,arr_12};
	    }

}