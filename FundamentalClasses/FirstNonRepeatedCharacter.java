package stringsPractice;

import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FirstNonRepeatedCharacter {
	public static void main(String [] args) throws IOException{
		System.out.println("Enter a word");
		Scanner a = new Scanner(System.in);
		String str = a.nextLine();	
		System.out.println("Enter a character");
		char c = (char) System.in.read();
		
		findFirstNonRepeatedCharacter(str,c);
	}
	
	//First non repeating character in a string using HashMap and LinkedHasMap
	//LinkedHashMap is same as HashMap class except it maintains insertion order where as HashMap doesn't
	
	public static void findFirstNonRepeatedCharacter(String str,char c){
		Map<Character, Integer> map1 = new LinkedHashMap<Character, Integer>();
		char [] chArray = str.toCharArray();
		for(char ch : chArray){
			if(map1.containsKey(ch)){
				map1.put(ch, map1.get(ch)+1);
			}else{
				map1.put(ch, 1);
			}
		}
		
		//Set<Map.Entry<Character, Integer>> entrySet = map1.entrySet();
		/*for(Entry<Character, Integer> entry : map1.entrySet()){
			if(entry.getValue()==1){
				System.out.println(entry.getKey()+":"+entry.getValue());
				break;
			}			
		}
		*/
		//for(int i=0;i<str.length();i++){
						
				System.out.println(map1.get(c));			
		//}
	}
	
	//First non repeating character in a string using HashTable
	
	/*public static void findFirstNonRepeatedCharacter(String str){
		Hashtable<Character, Integer> table =  new Hashtable<Character, Integer>();
		char [] chArray = str.toCharArray();
		for(char ch : chArray){
			table.put(ch, table.containsKey(ch)? table.get(ch)+1 :1);
		}
		
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(table.get(c)==1){
				System.out.println(c);
				break;
			}
		}
	}*/
}
















