package linkedList;

public class SumTwoLinkedList {
	static Node head1,head2;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public Node addTwoList(Node node1, Node node2){
		Node prev = null;
		Node res  = null;
		Node temp = null;
		int carry =0, sum;
		
		while(node1!=null || node2!= null){
			sum = carry + (node1!=null ? node1.data : 0) + (node2!=null ? node2.data : 0);
			carry = (sum>=10 ? 1 : 0);
			sum = sum%10;
			
			temp = new Node(sum);
			if(res == null){
				res = temp;
			}else{
				prev.next= temp;
			}
			prev = temp;
			
			if(node1!=null){
				node1 = node1.next;
			}
			if(node2!=null){
				node2 = node2.next;
			}
		}
		/*if(carry>0){
			temp.next = new Node(carry);
		}*/
		return res;
	}
	
	public void printList(Node head){
		while(head!=null){
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	
	public static void main(String [] args){
		SumTwoLinkedList lList = new SumTwoLinkedList();
		lList.head1 = new Node(1);
		lList.head1.next = new Node(2);
		lList.head1.next.next = new Node(3);
		lList.head1.next.next.next = new Node(4);
		lList.head1.next.next.next.next = new Node(5);
		lList.printList(head1);
		System.out.println();
		lList.head2 = new Node(6);
		lList.head2.next = new Node(7);
		lList.head2.next.next = new Node(8);
		lList.printList(head2);
		Node d = lList.addTwoList(head1, head2);
		System.out.println();
		lList.printList(d);
	}
}
