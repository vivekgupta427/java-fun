package stackExamples;

import java.util.Stack;

public class StackExample1 {
	
	private static void showPush(Stack st, int data){
		System.out.println("Pushing into stack");
		st.push(data);
		System.out.println("Stack :"+st);
	}
	
	private static void showPop(Stack st){
		System.out.println("Poping from stack");
		Integer a  =(Integer) st.pop();
		System.out.println(a);
		System.out.println("Stack :"+st);
	}
	
	public static void main(String[] args){
		Stack st = new Stack();
		System.out.println("Stack:"+st);
		showPush(st, 20);
		showPush(st, 25);
		showPush(st, 30);
		showPop(st);
		showPop(st);
		showPop(st);
		System.out.println("Final Stack :"+st);
		
	}
}
