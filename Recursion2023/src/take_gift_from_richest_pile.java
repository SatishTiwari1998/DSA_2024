import java.util.Collections;
import java.util.PriorityQueue;

public class take_gift_from_richest_pile {

	public static void main(String[] args) {
		
		int nums[]= {25,64,9,4,100};
		int k=4;
		System.out.println(pickGifts(nums,k));


	}
	
	public static long pickGifts(int[] gifts, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int x:gifts){

            pq.add(x);
        }

        while(k>0){
            int a=(int)Math.sqrt(pq.poll() );
            pq.add(a);
            System.out.println(pq);
            k--;
        }

        long sum=0;

        while(!pq.isEmpty()){
            sum+=(long)pq.poll();
            System.out.println("Sum "+ sum +"  "+ pq.size());

        }

        return sum;
        
    }

}
