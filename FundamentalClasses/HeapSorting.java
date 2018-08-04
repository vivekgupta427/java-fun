package sorting;

import java.util.Scanner;

public class HeapSorting {

	private static int N;
	public static void main(String[] args) {
		int [] arr= new int[]{4,0,6,2,5,1,7,3};
		System.out.println("Array before sorting is :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		sort(arr);
		System.out.println();
		System.out.println("Array after being sort : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void sort(int []arr){
		heapify(arr);
		for(int i = N; i>0; i--){
			swap(arr,0,i);
			N = N-1;
			adjust(arr,0);
		}
	}
	
	public static void heapify(int [] arr){
		N = arr.length-1;
		for(int i = N/2; i>=0; i--){
			adjust(arr,i);
		}
	}
	
	public static void adjust(int [] arr, int i){
		int left = 2*i;
		int right = 2*i+1;
		int max = i;
		if(left <= N && arr[left]>arr[i]){
			max= left;
		}
		if(right <= N && arr[right]>arr[max]){
			max = right;
		}
		
		if(max != i){
			swap(arr, i, max);
			adjust(arr,max);
		}
	}
	
	public static void swap(int [] arr,int i , int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
