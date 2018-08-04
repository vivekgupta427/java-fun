package stringsPractice;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfVowelsAndConsonants {
	public static void main(String[] args){
		System.out.println("Enter a word");
		Scanner a = new Scanner(System.in);
		//int numOfVowels =0;
		//int numOfConsonants =0;
		String str = a.nextLine();
		/*List<Character> list = new ArrayList<Character>();
		list.add('a');
		list.add('e');
		list.add('i');
		list.add('o');
		list.add('u');
		str = str.toLowerCase();
		
		
		for(int i=0;i<str.length();i++){
			if(list.contains(str.charAt(i))){
				numOfVowels++;
			}else if(Character.isLetter(str.charAt(i))){
				numOfConsonants++;
			}
		}*/
		
		//System.out.println("Number of Vowels :"+ numOfVowels +" Number of Consonants :"+numOfConsonants);
		
		int count=0;
		for(int i=0;i<str.length();i++){		
			if(Character.isDigit(str.charAt(i))){
				
			}else{			
				count++;
			}
		}
		if(count==0){
			System.out.println("String conatins only digits");
		}else{
			System.out.println("All characters of string are not digits");
		}
	}
}
