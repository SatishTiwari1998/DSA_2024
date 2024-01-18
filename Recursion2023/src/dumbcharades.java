import java.util.Arrays;
import java.util.Random;

public class dumbcharades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String performer[]= {"Satish","Mithun","Atif","Afsar Ali","Himanshu","Krishan"};
		String ringmaster[]= {"Satish","Mithun","Atif","Afsar Ali","Himanshu","Krishan"};
		getTask(performer,ringmaster);

	}
	
	public static void getTask(String performer[],String ringmaster[]) {
		
		Random rnd=new Random();
		int r1=rnd.nextInt(5)+1;
		int r2=rnd.nextInt(5);
		System.out.println(r1+" : "+r2);
		if(r1-1==r2+1) {
			r1=r1+1;
			r2=r2-1;
		}
		System.out.println("Performer: " + performer[r1-1]);
		System.out.println("RingMaster:  "+ ringmaster[r2+1]);	
		//System.out.println(Arrays.deepToString(performer));
	}
	
	public static void shuffleArray(String names[]) {
		Random rnd=new Random();
		
		for(int i=0;i<names.length;i++) {
			
			int x1=rnd.nextInt(6);
			String temp=names[x1];
			names[x1]=names[i];
			names[i]=temp;	
		}
		
	}

}

