import java.util.*;
public class sort_techniques {

	public static void main(String[] args) {
		
		int nums[]=new int[]{34,12,99,8,23,8};
		
		bubbleSort(nums);
		System.out.println();
		insertionSort(nums);
		System.out.println();
		selectionSort(nums);

	}
	
/////////////////////////// BEGINNER //////////////////////////////////////////
	
	public static void bubbleSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		System.out.println("Bubble Sort: ");
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void selectionSort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int min_index=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min_index]) {
					min_index=j;
				}
				
			}
			
			int temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
		}
		
		System.out.println("Selection Sort: ");
		System.out.println(Arrays.toString(arr));
	}
	
	public static void insertionSort(int arr[]) {
		
		int n=arr.length;
		
		for(int i=1;i<n;i++){
			int key=arr[i];
			int j=i-1;
            /* Move elements of arr[0..i-1], that are
            greater than key, to one position ahead
            of their current position */
			
			while(j>0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		
		System.out.println("Insertion Sort: ");
		System.out.println(Arrays.toString(arr));
		
	}

}