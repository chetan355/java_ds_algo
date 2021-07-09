package graph;
import java.util.*;
public class Graph {
	private LinkedList<Integer> adj[];
	
	//graph initialization :
	//making adjacency list :
	private Graph(int v){
		adj = new LinkedList[v];
		for(int i = 0; i < v; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	
	//making edge : 
	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	
	//find whether path exist or not for source to destination : DFS algo 
	private boolean dfsUtil(int source, int dest, boolean[]vis) {
		if(source == dest) return true;
		for(int neigh : adj[source]) {
			if(!vis[neigh])
			{
				vis[neigh] = true;
				boolean isConnected = dfsUtil(neigh, dest, vis);
				if(isConnected) return true;
			}
		}
		return false;
	}
	
	//dfsUtil handler : 
	public void dfs(int s, int d) {
		boolean vis[] = new boolean[adj.length];
		vis[s] = true;
		System.out.println(dfsUtil(s, d, vis));
	}
	
	//dfs using stack : 
	public boolean dfsStack(int s,int d) 
	{
		boolean vis[] = new boolean[adj.length];
		Stack<Integer> stack = new Stack<>();
		stack.push(s);
		vis[s] = true;
		while(!stack.isEmpty()) {
			int curr = stack.pop();
			if(curr==d) return true;
			for(int neigh: adj[curr]) {
				if(!vis[neigh]) {
					stack.push(neigh);
					vis[neigh] = true;					
				}
			}
		}
		return false;
	}
	
	//find the ways for source and destination using bfs : 
	public int bfs(int s, int d) {
		boolean vis[] = new boolean[adj.length];
		int parent[] = new int[adj.length];
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(s);
		vis[s] = true;
		parent[s] = -1;
		while(!q.isEmpty()) {
			int curr = q.poll();
			if(curr==d) break;
			for(int neigh : adj[curr]) {
				if(!vis[neigh]) {
					vis[neigh] = true;
					q.add(neigh);
					parent[neigh] = curr; 
				}
			}
		}
		int cur = d;
		int dist=0;
		while(parent[cur]!=-1) {
			System.out.println(cur+" =>");
			dist++;
			cur = parent[cur];
		}
		return dist;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vertices and edges : ");
		int v = sc.nextInt();
		int e = sc.nextInt();
		Graph gh = new Graph(v);
		System.out.println("Enter the "+e+" edges : ");
		for (int i = 0; i < e; i++) {
			int dest = sc.nextInt();
			int edge = sc.nextInt();
			gh.addEdge(dest,edge);
		}
		System.out.println("Enter the source and destination : ");
		int s = sc.nextInt();
		int d = sc.nextInt();
//		int distance = gh.bfs(s,d);
		
		System.out.println(gh.dfsStack(s, d));
	}
}
