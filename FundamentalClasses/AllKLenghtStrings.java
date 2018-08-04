
public class AllKLenghtStrings {

	public static void main(String[] args) {
		System.out.println("First Test");
		char[] set = {'a','b'};
		int k =2;
		printAllKLengthStrings(set,k);
	}
	
	public static void printAllKLengthStrings(char []set,int k){
		int length = set.length;
		printAllKLengthStringsRec(set,"",length,k);
	}
	
	public static void printAllKLengthStringsRec(char []set,String buffer,int len,int k){
		if(k==0){
			System.out.println(buffer);
			return;
		}
		
		for(int i=0;i<len;i++){
			String newBuffer = buffer+set[i];
			printAllKLengthStringsRec(set,newBuffer,len,k-1);
		}
	}

}
