package tree;

import java.util.Stack;

public class BinaryTree1 {
			
	static class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int data){
			this.data = data;
		}
	}
	
	//Recursive approach of PreOrder
	public static void preOrder(TreeNode node){
		if(node!=null){
			System.out.print(node.data+"  ");
			preOrder(node.left);
			preOrder(node.right);
		}	
		
		
	}
	//Iterative approach of PreOrder
	public static void preOrderItr(TreeNode node){
		if(node == null){
			return;
		}
		
		Stack <TreeNode> stack = new Stack<TreeNode>();
		stack.push(node);
		while(!stack.empty()){
			TreeNode n = stack.pop();
			System.out.print(n.data+"  ");
			
			if(n.right!=null){
				stack.push(n.right);
			}
			
			if(n.left != null){
				stack.push(n.left);
			}
		}
	}
	
	//Recursive approach of postOrder
	public static void postOrder(TreeNode node){
		if(node!=null){
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.data+"  ");
		}
	}
	
	//Iterative approach of PostOrder
	/*public static void postOrderItr(TreeNode node){
		if(node==null){
			return;
		}
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(node);
		
		while(!stack.empty()){
			if(node.right!=null){
				stack.push(node.right);
			}
			if(node.left!=null){
				stack.push(node.left);
			}
			TreeNode n = stack.pop();
			System.out.print(n.data+"  ");
		}
	}*/
	
	//Recursive approach of InOrder
	public static void inOrder(TreeNode node){
		if(node!=null){
			inOrder(node.left);
			System.out.print(node.data+"  ");
			inOrder(node.right);
		}
	}
	
	//Iterative approach of InOrder
	public static void inOrderItr(TreeNode node){
		if(node==null){
			return;
		}
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode n= node;
		
		while(!stack.empty() || n!=null){
			if(n!=null){
				stack.push(n);
				n=n.left;
			}else{
				n = stack.pop();
				System.out.print(n.data+"  ");
				n = n.right;
			}			
		}
	}
	
	public static void main(String[] args) {
		BinaryTree1 tree = new BinaryTree1();
		System.out.println();
		TreeNode node = tree.createBinaryTree();
		System.out.println("This is preorder traversal of the Binary tree");
		tree.preOrder(node);
		System.out.println();
		tree.preOrderItr(node);
		System.out.println();
		System.out.println("This is postorder traversal of the Binary tree");	
		tree.postOrder(node);
		System.out.println();
		//tree.postOrderItr(node);
		System.out.println();
		System.out.println("This is InOrder traversal of the Binary tree");
		tree.inOrder(node);
		System.out.println();
		tree.inOrderItr(node);
	}
	
	public static TreeNode createBinaryTree(){
		TreeNode rootnode = new TreeNode(10);
		TreeNode node2 = new TreeNode(20);
		TreeNode node3 = new TreeNode(40);
		TreeNode node4 = new TreeNode(70);
		TreeNode node5 = new TreeNode(60);
		TreeNode node6 = new TreeNode(30);
		TreeNode node7 = new TreeNode(50);
		
		rootnode.left = node2;
		rootnode.right = node3;
		node2.left = node4;
		node3.right = node5;
		
		node2.right = node7;
		node3.left = node6;
		
		return rootnode;
	}
}
