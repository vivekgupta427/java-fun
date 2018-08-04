
public class PalindromString {
	public static void main(String [] args){
		String str = "abddba";
		System.out.println(str.length());
		int length = str.length();
		for(int i=0;i<length/2;i++){
			if(str.charAt(i)!=str.charAt(length-i-1)){
				System.out.println("String is not palindrom");
			}else{
				System.out.println("Given string is palindrom");
			}
		}
	}
}
