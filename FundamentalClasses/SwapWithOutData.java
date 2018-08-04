package linkedList;

public class SwapWithOutData {
	 Node head;
	
	 class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void push(int data){		
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void printList(){
		Node node = head;
		while(node!=null){
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
	
	public void swapNode(int x, int y){
		if(x==y){
			return;
		}
		Node prevX = null,currX = head;
		while(currX!=null && currX.data!=x){
			prevX = currX;
			currX = currX.next;
		} 
		
		Node prevY = null, currY = head;
		while(currY!=null && currY.data!= y){
			prevY = currY;
			currY =  currY.next;
		}
		
		if(currX ==null || currY==null){
			return;
		}
		
		if(prevX!=null){
			prevX.next = currY;
		}else{
			head = currY;
		}
		
		if(prevY!=null){
			prevY.next = currX;
		}else{
			head = currX;
		} 
		
		Node temp = currX.next;
		currX.next = currY.next;
		currY.next = temp;
	}
	
	public static void main(String [] args){
		SwapWithOutData lList = new SwapWithOutData();
		/*lList.head = new Node(5);
		Node sec = new Node(10);
		Node third = new Node(15);
		lList.head.next = sec;
		sec.next = third;	*/
		lList.push(7);
		lList.push(6);
		lList.push(5);
		lList.push(4);
		lList.push(3);
		lList.push(2);
		lList.push(1);
		lList.printList();
		lList.swapNode(4,5);
		System.out.println();
		lList.printList();
	}
	
}
