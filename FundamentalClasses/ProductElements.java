import java.util.Hashtable;

public class ProductElements {

	public static void main(String[] args) {
		int [] arr = {30};
		int x = 100;
		boolean a = isProduct(arr, x);
		System.out.println(a);	
	}
	
	public static boolean isProduct(int [] arr, int c){
		Hashtable <Integer, Integer> ht = new Hashtable<Integer, Integer>();
		if(arr.length<2){
			return false;
		}
		
		for(int i =0; i<arr.length;i++){
			
			if(arr[i]==0){
				if(c==0){
					return true;
				}
			}
		
			if(c%arr[i]==0){
				int v = c/arr[i];
				if(ht.containsKey(v)){
					System.out.println("Value found");
					return true;
				}
				
				if(!ht.contains(arr[i])){
					ht.put(arr[i], i);
				}
			}		
		}
		return false;
	}

}
