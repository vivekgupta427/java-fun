
public class IncreasingSubArrays {
	static int op =0;
	public static void main(String[] args){
		//int len=1;
		int [] arr1 = {1,2,2,4};
		for(int i=0;i<arr1.length;i++){		
			for(int j=i;j<arr1.length-1;j++){				
				if(arr1[j]<arr1[j+1])
					op++;				
				else 
					break;			
			}
		}
		System.out.println("Number of subarrays :"+op);
		
		/*for(int i=0;i<arr1.length-1;i++){
			if(arr1[i+1]>arr1[i]){
				len++;
			}
			else{
				op += ((len-1)*len)/2;
				len=1;
			}
		}
		
		if(len>1){
			op+=((len-1)*len)/2;
			System.out.println(op);
		}
		*/
		
	}
}
