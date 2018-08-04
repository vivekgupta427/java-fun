package stringsPractice;

import java.util.ArrayList;
import java.util.Scanner;
public class StringDuplicates {
	public static void main(String [] args){
		System.out.println("Enter a word");
		Scanner a = new Scanner(System.in);
		String str = a.nextLine();
		ArrayList list = new ArrayList();
		for(int i=0;i<str.length()-1;i++){
			for(int j=i+1;j<str.length();j++){
				if(!list.contains(str.charAt(i)) && str.charAt(i)==str.charAt(j)){
					list.add(str.charAt(i));
				}
			}
		}
		
		for(Object obj : list){
			System.out.print(obj.toString());
		}
	}
}
