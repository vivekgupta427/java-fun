import java.util.Scanner;
public class LongestPalindrom {
	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner a = new Scanner(System.in);
		String str = a.nextLine();
		System.out.println("Longest Palinfrom String is "+ longestPalindromString(str));
	}
	
	public static String longestPalindromString(String palin){
		if(palin==null){
			return null;
		}
		String longest = palin.substring(0,1);
		for(int i=0;i<palin.length()-1;i++){
			String palindrom = intermediatePalindrom(palin,i,i);
			if(palindrom.length()>longest.length()){
				longest =  palindrom;
			}
			palindrom = intermediatePalindrom(palin, i, i+1);
			if(palindrom.length()>longest.length()){
				longest =  palindrom;
			}
		}
		return longest;			
	}
	
	public static String intermediatePalindrom(String str,int left,int right){
		while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)){
			left--;
			right++;
		}
		return str.substring(left+1, right);
	}
}
