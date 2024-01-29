import java.util.*;
public class sortVowelsInString_2785 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="lEetcOde";
		System.out.println(sortVowels(str));

	}
	
	public static String sortVowels(String s) {

        StringBuilder vowels=new StringBuilder();
        StringBuilder res=new StringBuilder();

        for(char ch:s.toCharArray()){
            if(isVowel(ch)) {
            	vowels.append(ch);
            	res.append('#');	
            }
            else {
            	res.append(ch);
            }
        }
        
        char arr[]=vowels.toString().toCharArray();
        Arrays.sort(arr);
        
        System.out.println(Arrays.toString(arr));
        int index=0;
        StringBuilder ans=new StringBuilder();
        
        for(char c:res.toString().toCharArray()) {
        	if(c=='#') {
        		ans.append(arr[index++]);
        	}
        	else {
        		ans.append(c);
        	}
        }
        
        return ans.toString();
        
    }

    public static boolean isVowel(char ch){
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') return true;
        return false;
    }

}
