package tree;
import java.util.Scanner;

public class MaxHeight {
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Node root = createTree();
		System.out.println(findHeight(root)-1);
	}
	static int findHeight(Node root) {
		int leftmax = 0, rightmax = 0;		
		
		if(root==null) return 0;
		
		if(root.left!=null) {
			leftmax = findHeight(root.left);
		}
		if(root.right!=null) {
			rightmax = findHeight(root.right);
		}
//		System.out.println(leftmax+" "+rightmax);
		return Math.max(leftmax, rightmax)+1;
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
}
