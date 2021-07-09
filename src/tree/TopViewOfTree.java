package tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TopViewOfTree {
	static Scanner sc;
	Map<Integer,Integer> map = new HashMap<>();
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Node root = createTree();
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
	static void topView(Node root) 
	{
		
	}
}
