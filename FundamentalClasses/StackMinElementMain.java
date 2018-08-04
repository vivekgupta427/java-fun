package stackExamples;

import java.util.Stack;
// Find minimum element with o(1) time and with o(1) extra space
public class StackMinElementMain {

	public static void main(String[] args) {
		StackMinElement st = new StackMinElement();
		st.push(3);
		st.push(5);
		st.getMin();
		st.push(2);
		st.push(1);
		st.getMin();
		//st.pop();
		st.peek();
		st.getMin();

	}
	
	

}
