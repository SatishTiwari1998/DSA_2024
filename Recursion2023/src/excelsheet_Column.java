import java.util.*;
public class excelsheet_Column {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]=new int[201];
		for(int i=0;i<nums.length;i++) {
			nums[i]=i;
			System.out.println(nums[i]+":"+convertToTitle(nums[i]));
		}

	}
	
	public static String convertToTitle(int columnNumber) {

        StringBuilder sb= new StringBuilder();
        while(columnNumber>26){
            int rem=columnNumber%26;
            sb.append((char)(rem+64));
            columnNumber/=26;

        }
        if(columnNumber==0) {
        	sb.append("");
        }
        else {
            sb.append((char)(columnNumber+64));	
        }


        sb.reverse();

        return sb.toString();
        
    }

}
