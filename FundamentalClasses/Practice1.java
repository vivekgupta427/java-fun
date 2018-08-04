public class Practice1 {

	public static void main(String[] args) {
		int []arr = new int[]{1,2,3,5,6};
		int S=7;		
	    int ans = count_all_pairs_with_given_sum(arr,S);
	    System.out.println(ans);
	}
	
	public static int count_all_pairs_with_given_sum(int []arr,int S){
		int countPair=0;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==S){
					countPair++;
				}
			}
		}
		return countPair;
	}
}
