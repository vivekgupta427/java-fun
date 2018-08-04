package stringsPractice;

import java.util.Scanner;
import java.util.Stack;

public class Parser {

	public static void main(String[] args) {
		
		    Parser s = new Parser();
		    Scanner a = new Scanner(System.in);
		    while(a.hasNext()){
		    	System.out.println(s.checkParenthesisBalance(a.next()));
		    }	    
	}
	 public boolean checkParenthesisBalance(String str){
	        Stack<Character> st = new Stack<Character>();
	        for(int i=0;i<str.length();i++){
	            if(str.charAt(i)=='[' || str.charAt(i)=='{' || str.charAt(i)=='('){
	                st.push(str.charAt(i));
	            }else if(str.charAt(i)==']' || str.charAt(i)=='}' || str.charAt(i)==')'){
	                if(st.isEmpty()){
	                    return false;
	                }
	                char ch = st.pop();
	                if((ch=='(' && str.charAt(i)==')')||(ch=='{' && str.charAt(i)=='}')||(ch=='[' && str.charAt(i)==']')){
	                    return true;
	                }
	                	            }
	        }
	        if(st.isEmpty()){
	            return true;
	        }else{
	            return false;
	        }
	    }
	  

	}


