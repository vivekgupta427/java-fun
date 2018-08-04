package stringsPractice;

import java.util.Scanner;

public class PalndromString {
	public static void main(String[] args){
		System.out.println("Enter a word");
		Scanner a = new Scanner(System.in);
		String str = a.nextLine();	
		int flag =0;
		for(int i=0;i<str.length()/2;i++){
			 flag =0;
			if(str.charAt(i)==str.charAt(str.length()-i-1)){
				flag =1;
			}
		}
		if(flag==1){
			System.out.println("String is palindrom " + str );
		}
		else{
			System.out.println("Entered string is not a palindrom string");
		}
	}
}
