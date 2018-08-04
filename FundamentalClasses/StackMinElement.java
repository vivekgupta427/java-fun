package stackExamples;

import java.util.Stack;
//Find minimum element with o(1) time and with o(1) extra space
public class StackMinElement {
	
	Stack<Integer> stack ;
	Integer minEle;
	
	StackMinElement(){
		stack = new Stack<Integer>();
	}
		//print Minimum element
		public void getMin(){
			if(stack.isEmpty()){
				System.out.println("Stack is Empty");
			}
			else{
				System.out.println("Minimum element is : "+minEle);
			}
		}
		
		public void push(Integer x){
			if(stack.isEmpty()){
				minEle = x;
				stack.push(x);
				System.out.println("Number inserted : "+x);
				return;
			}
			if(x<minEle){
				System.out.println("Number inserted : "+stack.push(2*x-minEle));
				minEle = x;
			}
			else{
					stack.push(x);
					System.out.println("Number inserted : "+x);
			}					
		}
		
		public void pop(){
			if(stack.isEmpty()){
				System.out.println("Stack is Empty");
				return;
			}
			System.out.println("Removing top most elememt");
			Integer y = stack.pop();
			if(y<minEle){
				minEle = 2*minEle - y;
			}else{
				System.out.println("Element removed is: "+ y);
			}			
		}
		
		public void peek(){
			if(stack.isEmpty()){
				System.out.println("Stack is Empty");
				return;
			}
			
			Integer t = stack.peek();
			if(t<minEle){
				System.out.println("Peek Element is : "+minEle);
			}else{
				System.out.println("Peek Element is : "+ t);
			}
		}
}
