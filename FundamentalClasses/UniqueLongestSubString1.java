package stringsPractice;

import java.util.HashMap;
import java.util.Scanner;

public class UniqueLongestSubString1 {
	static int longestLength = -1;
	static String permString = "";

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner a = new Scanner(System.in);
		String str = a.nextLine();
		findLongestUniqueSubString(str,0);
		System.out.println("Longest Length Unique String is : "+ permString + " which has length "+longestLength);
	}
	
	public static void findLongestUniqueSubString(String str, int index){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		String tempString = "";
		int tempLength = 0;
		for(int i=index; i<str.length();i++){
			
			
			if(!map.containsKey(str.charAt(i))){
				map.put(str.charAt(i), i);
				tempLength++;
				tempString+=str.charAt(i);
			}
			else if(map.containsKey(str.charAt(i))){
				if(tempLength>longestLength){
					longestLength = tempLength;
					permString = tempString;
				}
				int lastIndex = map.get(str.charAt(i));
				findLongestUniqueSubString(str, lastIndex+1);
				break;
			}			
		}		
	}
}
