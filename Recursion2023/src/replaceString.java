import java.util.*;
public class replaceString {

	public static void main(String[] args) {
		String str="2monekey76xyzthreefour8lopxwto";
		replaceNum(str);
		System.out.println(str);
	}
	
	
	public static void replaceNum(String str) {	
		str.replaceAll("one", "1");

	}

}