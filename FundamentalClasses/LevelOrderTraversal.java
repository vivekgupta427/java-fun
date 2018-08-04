package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	static int count =0;
	static TreeNode root;
	static class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int data) {
			this.data = data;
			left = right = null;
		}
	}
	
/*	public static void printTree(TreeNode root){
		if(root== null){
			return;
		}
		
		if(root!=null){
			System.out.print(root.data+"  ");
			printTree(root.left);
			printTree(root.right);
		}
	}*/
	
	public void levelOrderTraversal(TreeNode node){
		if(node==null){
			return;
		}
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(node);
		//System.out.print(node.data+" ");
		
		while(!queue.isEmpty()){
			TreeNode n = queue.poll();
			System.out.print(n.data+"  ");
			if(n.left!=null){
				queue.add(n.left);
			}
			if(n.right!=null){
				queue.add(n.right);
			}
		}
	}
	
	public static void printLeafNodes(TreeNode node){
		if(node== null){
			return;
		}
		
		if(node.left==null && node.right==null){
			count++;
			System.out.print(node.data+"  ");
		}
		
		printLeafNodes(node.left);
		printLeafNodes(node.right);
		
	}
	
	public static int countNumberOfLeafNodes(TreeNode node){
		if(node==null){
			return 0;
		}if(node.left==null && node.right == null){
			return 1;
		}else{
			return countNumberOfLeafNodes(node.left)+countNumberOfLeafNodes(node.right);
		}
	}
	
	public static int getLevelOfNode(TreeNode root, int key, int level){
		if(root==null){
			return 0;
		}
		if(root.data==key){
			return level;
		}
		
		int result = getLevelOfNode(root.left, key, level+1);
		if(result!=0){
			return result;
		}
		return getLevelOfNode(root.right, key, level+1);
	}
	
	public static void printAllPaths(TreeNode node, int[] path, int len){
		if(node==null){
			return;
		}
		
		path[len] = node.data;
		len++;
		if(node.left==null && node.right==null){
			//leaf is reached
			printArray(path,len);
			return;
		}
		
		printAllPaths(node.left, path, len);
		printAllPaths(node.right, path, len);
	}
	
	public static void printArray(int []path, int len){
		System.out.println();
		for(int i=0;i<len;i++){
			System.out.print(path[i]+" ");
		}
	}
	
	public static int getMaxNode(TreeNode node){
		int value = 0;
		int max= Integer.MIN_VALUE;
		int left,right;
		if(node!=null){
			value = node.data;
			left = getMaxNode(node.left);
			right = getMaxNode(node.right);
			if(left>right){
				max= left;
			}else{
				max= right;
			}
			if(max<value){
				max=value;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		LevelOrderTraversal tree = new LevelOrderTraversal();
		TreeNode root = tree.createBinaryTree();
		tree.levelOrderTraversal(root);
	  //printTree(root);
		System.out.println();
		System.out.println("All leaf Nodes");
		printLeafNodes(root);
		System.out.println(count);
		System.out.println();
		int numberOfCount = countNumberOfLeafNodes(root);
		System.out.println("Number of Leaf Nodes :"+numberOfCount);
		System.out.println();
		System.out.println("Finding level of nodes");
		System.out.println("Level of node 30 : "+getLevelOfNode(root, 30, 1));
		System.out.println("Level of node 60 : "+getLevelOfNode(root, 60, 1));
		System.out.println("Level of node 40 : "+getLevelOfNode(root, 40, 1));
		System.out.println();
		System.out.println("Printing all paths from root to leaf");
		printAllPaths(root, new int[100], 0);
		System.out.println();
		System.out.println("Printing maximum Node in Tree");
		System.out.println("Maximum Node is: "+ getMaxNode(root));
	}
	
	public TreeNode createBinaryTree(){
		root = new TreeNode(10);
		TreeNode node2 = new TreeNode(20);
		TreeNode node3 = new TreeNode(30);
		TreeNode node4 = new TreeNode(70);
		TreeNode node5 = new TreeNode(50);
		TreeNode node6 = new TreeNode(60);
		TreeNode node7 = new TreeNode(40);
		
		root.left =  node2;
		root.right = node3;
		node2.left = node4;
		node2.right =node5;
		node3.left = node6;
		node4.right = node7;		
		return root;	
	}
}
