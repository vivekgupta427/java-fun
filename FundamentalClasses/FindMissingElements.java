package geekOfGeeks;

import java.util.Arrays;

public class FindMissingElements {

	public static void main(String[] args) {
		
		int [] arr =  new int[] {10,45,15,50,78,81,32,51,55};
		int n = arr.length;
		int low = 50;
		int high = 55;
		findMissingElements(arr,n,low,high);
	}
	
	public static void findMissingElements(int [] arr, int n, int low, int high){
		Arrays.sort(arr);
		
		//Binary Search
		
		int first =0;
		int last = n-1;
		int mid = (first+last)/2;
		while(first<=last){
			if(low==arr[mid]){
				System.out.println("Location found : "+ mid);
				break;
			}
			else if(low<arr[mid]){
				last = mid-1;
			}else if(low>arr[mid]){
				first = mid+1;
			}
			
			mid= (first+last)/2;
		}
		
		int i = mid-1, x= low;
		while(i<n && x<=high){
			if(arr[i]!=x){
				System.out.print(x + " ");
			}else{
				i++;
				x++;
			}
		}
		
	}

}
