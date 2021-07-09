package tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class BfsImplementation {
	static Scanner sc;
	static Queue<Node> queue = new ArrayDeque<>();
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Node root = createTree();
		bfsTreversing(root);
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
	static void bfsTreversing(Node root) {
		if(root==null) return;
		queue.offer(root);		
		while(!queue.isEmpty()) {
			Node curr = queue.peek();
			System.out.println(curr.data);
			if(curr.left!=null)
				queue.offer(curr.left);
			if(curr.right!=null)
				queue.offer(curr.right);
			queue.poll();
		}
	}
}
