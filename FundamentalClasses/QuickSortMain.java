package sorting;

public class QuickSortMain {

	public static void main(String[] args) {
		
		int [] arr= {10, 7, 8, 9, 1, 5};
		int n = arr.length;
		System.out.println("Before sorting array is :");
		printArray(arr);
		QuickSortMain sort = new QuickSortMain();
		sort.sort(arr,0,n-1);
		System.out.println();
		System.out.println("After sorting array is :");
		printArray(arr);

	}
	
	public static void printArray(int [] arr){
		for(int i =0; i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void sort(int [] arr, int low,  int high){
		if(low<high){
			int pi= partition(arr, low, high);
			sort(arr,low,pi-1);
			sort(arr,pi+1,high);
		}
	}
	
	public static int partition(int [] arr, int low, int high){
		int pivot = arr[high];
		int i = low-1;
		System.out.println(i);
		for(int j=low;j< high ;j++){
			if(arr[j]<=pivot){
				i++;
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		// swapping arr[i+1] and arr[high] or pivot
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
		
	}

}
