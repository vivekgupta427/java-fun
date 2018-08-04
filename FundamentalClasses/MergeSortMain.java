package sorting;

public class MergeSortMain {

	public static void main(String[] args) {
		int [] arr = {4,0,6,2,5,1,7,3};
		System.out.println("Given Array is: ");
		for(int i =0; i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		MergeSort sort = new MergeSort();
		sort.sort(arr,0,arr.length-1);
		System.out.println();
		System.out.println("After sorting array is  : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
}

class MergeSort{
	static int count = 0;
	public void sort(int [] arr, int l, int r){
		if(r>l){
			int m = (l+r)/2;
			
			sort(arr,l,m);
			sort(arr,m+1,r);
			merge(arr,l,m,r);
		}
	}
	
	public void merge(int [] arr, int l, int m, int r){
		
		int n1 = m-l+1;
		int n2 = r-m;
		
		int []L = new int[n1];
		int []R = new int[n2];
		
		for(int i =0;i<n1;i++){
			L[i] = arr[l+i];
		}
		
		for(int j= 0; j<n2;j++){
			R[j] = arr[m+1+j];
		}
		
		int i=0,j=0;
		int k = l;
		
		while(i<n1 && j<n2){
			count++;
			if(L[i]<=R[j]){
				arr[k]= L[i];
				i++;
			}else{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1){
			count++;
			arr[k] = L[i];
			i++;
			k++;
		}
		
		while(j<n2){
			count++;
			arr[k]= R[j];
			j++;
			k++;
		}
		System.out.println(MergeSort.count);
	}
	
}
