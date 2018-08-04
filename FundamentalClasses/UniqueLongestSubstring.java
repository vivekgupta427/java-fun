package stringsPractice;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class UniqueLongestSubstring {
	static int longestLength = -1;
	static String permString = "";
	public static void main(String [] args){	
		System.out.println("Enter a String");
		Scanner a = new Scanner(System.in);
		String str = a.nextLine();
		findUniqueSubstring(str,0);
		System.out.println(longestLength);
		System.out.println(permString);
		
		
	}
	
	public static void findUniqueSubstring(String str,int index){
		String tempString="";
		int temp_length=0;
		if(index >= str.length()){return;}		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i = index;i<str.length();i++){
			if(!map.containsKey(str.charAt(i))){
				map.put(str.charAt(i), i);	
				tempString+=str.charAt(i);
				temp_length++;
			}
			
			else if(map.containsKey(str.charAt(i))){
				if(temp_length>longestLength ){
					longestLength = temp_length;
					permString = tempString;
				}
				int last_index = map.get(str.charAt(i));
				//System.out.println(last_index);
				findUniqueSubstring(str, last_index+1);
				break;
			}
		}
		
		/*if(temp_length>longestLength){
			longestLength = temp_length;
		}*/
	} 
}
