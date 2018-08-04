package stringsPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicatesUsingMap {
	public static void main(String[] args){
		System.out.println("Enter a word");
		Scanner a = new Scanner(System.in);
		String str = a.nextLine();	
		printDuplicates(str);
	}
	
	public static void printDuplicates(String str){
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		char[] chArray = str.toCharArray();
		for(char ch : chArray){
			if(map1.containsKey(ch)){
				map1.put(ch, map1.get(ch)+1);
			}else{
				map1.put(ch, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> entrySet= map1.entrySet();
		for(Map.Entry<Character, Integer> entry : entrySet){
			if(entry.getValue()>1){
				
				System.out.print(entry.getKey());
			}
		}
	}
}
