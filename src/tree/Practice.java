package tree;
import java.util.*;
public class Practice {
	Scanner sc = new Scanner(System.in);
	public MyNode createTree() {
		MyNode root = null;
		System.out.println("Enter Data : ");
		int data = sc.nextInt();
		if(data==-1) return null;
		root = new MyNode(data);
		System.out.println("Enter the left child of "+ data);
		root.left = createTree();
		System.out.println("Enter the right child of "+data);
		root.right = createTree();
		return root;
	}
	private void bfs(MyNode root) {
		if(root==null) return;
		Queue<MyNode> q = new ArrayDeque<>();
		q.offer(root);
		while(!q.isEmpty()){
			MyNode curr = q.peek();
			System.out.println(curr.data);
			if(curr.left!=null) q.offer(curr.left);
			if(curr.right!=null) q.offer(curr.right);
			q.poll();
		}
	}
	static int treeHeight(MyNode root) {		
		if(root==null) return 0;
		int leftmax = 0,rightmax = 0;
		if(root.left!=null)
		leftmax =  treeHeight(root.left);
		if(root.right!=null)
		rightmax = treeHeight(root.right);
		return Math.max(leftmax,rightmax)+1;
	}
	
	public static void main(String[] args) {
		Practice pr = new Practice();
		MyNode root = pr.createTree();
		pr.bfs(root);
		System.out.println(treeHeight(root)-1);
	}
}
class MyNode{
	MyNode left,right;
	int data;
	MyNode(int data){
		this.data = data;
	}
}
