package pepcoding_Recursion_Backtracking_1;

public class display_Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,20,12,54,13,29,50};
		dispArr_forward(arr,0);
		System.out.println();
		dispArr_backward(arr,0);

	}
	
	public static void dispArr_forward(int arr[],int index) {
		if(index==arr.length) return;
		System.out.print(arr[index]+" ");
		dispArr_forward(arr,index+1);
	}
	
	public static void dispArr_backward(int arr[],int index) {
		if(index==arr.length) return;
		dispArr_backward(arr,index+1);
		System.out.print(arr[index]+" ");
	}

}
