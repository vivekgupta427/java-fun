package stringsPractice;
import java.util.Scanner;

public class Password {

	static int longestLength = -1;
	static String permString = "";
	public static void main(String[] args) {
		System.out.println("Enter a non Empty String");
		Scanner a = new Scanner(System.in);
		String str = a.next();
		int x = findLength(str);
		System.out.println("Length is :"+ x);

	}
	
	public static int findLength(String str){
		String tempString = "";
		int tempLength = 0;
		int count = 0;
		for(int i =0; i<str.length();i++){
			if(Character.isLetter(str.charAt(i))){
				if(Character.isUpperCase(str.charAt(i))){
					count++;
				}	
				
				tempString+=str.charAt(i);
				tempLength++;
				if(tempLength>longestLength  ){
					if(count >0){
						longestLength = tempLength;
						permString = tempString;
					}					
				}
			}
			else if(Character.isDigit(str.charAt(i))){
				if(tempLength>longestLength ){
					if(count >0){
						longestLength = tempLength;
						permString = tempString;
					}
				}
				
				findLength(str.substring(i+1));
				break;
			}
		}
		return longestLength;
	}

}
