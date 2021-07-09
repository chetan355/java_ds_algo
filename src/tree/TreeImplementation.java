package tree;
import java.util.*;

public class TreeImplementation 
{
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Node node = createTree();
		inOrder(node);
		System.out.println();
		preOrder(node);
		System.out.println();
		postOrder(node);
	}
	static Node createTree() {
		Node root = null;
		System.out.println("Enter Data:");
		int data = sc.nextInt();
		if(data==-1) return null;
		
		root = new Node(data);
		
		System.out.println("Enter Left for :"+data);
		root.left = createTree();
		
		System.out.println("Enter Right for :"+data);
		root.right = createTree();
		
		return root;
	}
	//LNR
	static void inOrder(Node root) {
		if(root==null) return;
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}
	static void preOrder(Node root) {
		if(root==null) return;
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	static void postOrder(Node root) {
		if(root==null) return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}
}
class Node{
	Node left;
	Node right;
	int data;
	Node(int data){
		this.data = data;
	}
}
