package graph;
import java.util.*;
public class Practise {
	static LinkedList<Integer> adj[];
	static int v;
	Practise(int v){
		adj = new LinkedList[v];
		this.v = v;
		for(int i = 0; i < v; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of vertices : ");
		int v = sc.nextInt();
		new Practise(v);
		System.out.println("Enter no. of edges : ");
		int e = sc.nextInt();
		System.out.println("Enter source and destination : ");		
		for(int i = 0; i < e; i++) {
			int s = sc.nextInt();
			int d = sc.nextInt();
			adj[s].add(d);
		}
		System.out.println("Enter s and d : ");
		int source = sc.nextInt();
		int dest = sc.nextInt();
		System.out.println(bfsTraverse(source, dest));
		System.out.println("Possible : "+dfs(source,dest));
	}
	static int bfsTraverse(int s, int d){
		Queue<Integer> queue = new LinkedList<Integer>();
		boolean vis[] = new boolean[v];
		int parent[] = new int[v];
		queue.offer(s);
		vis[s] = true;
		parent[s] = -1;
		while(!queue.isEmpty()) {
			int curr = queue.poll();
			for(int neigh:adj[curr])
			{
				if(!vis[neigh]) {
					vis[neigh] = true;
					queue.offer(neigh);
					parent[neigh] = curr;
				}
			}
		}
		int distance = 0;
		int cur = d;
		while(parent[cur]!=-1) {
			System.out.println(cur+"->");
			cur = parent[cur];
			distance++;
		}
		return distance;
	}
	static boolean dfs(int s, int d){
		Stack<Integer> stack = new Stack<Integer>();
		boolean vis[] = new boolean[v];
		stack.push(s);
		vis[s] = true;
		while(!stack.isEmpty()) {
			int curr = stack.pop();
			
			if(curr==d) return true;
			
			for(int neigh:adj[curr]) {
				if(!vis[neigh]) {
					stack.push(neigh);
					vis[neigh] = true;
				}
			}
		}
		return false;
	}
	
}
