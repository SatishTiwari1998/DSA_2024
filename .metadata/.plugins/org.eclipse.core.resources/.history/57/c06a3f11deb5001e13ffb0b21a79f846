package medium;
import java.util.*;
public class distictElementsAfterReverseOps_2442 {

	public static void main(String[] args) {
		
		int nums[]=new int[] {1,12,13,21,7,6,22,13,31,47,44,22};
		System.out.println(countDistinctIntegers(nums));
		

	}
	
	public static int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int k:nums) {
        	set.add(k);
        	set.add(revNum(k));
        }
        //System.out.println(set);
        return set.size();  
    }

    public static int revNum(int num){
        int revNum=0;
        while(num>0){
            int rem=num%10;
            revNum=(revNum*10)+rem;
            num/=10;
        }
        return revNum;
    }

}
