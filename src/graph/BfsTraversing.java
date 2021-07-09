package graph;
import java.util.*;

public class BfsTraversing 
{
	int V;
	ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
	public BfsTraversing(int v) {
		V = v;
		for(int i = 0; i < v;i++)
		{
			adj.add(new ArrayList<Integer>());
		}
	}
	static ArrayList<Integer> bfsTraverse(int v, ArrayList<ArrayList<Integer>> list)
	{
		boolean visit[] = new boolean[v+1];
		ArrayList<Integer> res = new ArrayList<>();
		for(int i = 0; i <= v; i++) {
			Queue<Integer> queue = new ArrayDeque<Integer>();
			if(visit[i]==false) {
				queue.add(i);
				visit[i] = true;
				while(!queue.isEmpty()) 
				{
					Integer node = queue.poll();
					for(Integer temp : list.get(node)) {
						if(visit[temp]==false) {
							res.add(temp);
							visit[temp] = true;
							queue.add(temp);
						}
					}
				}
			}
		}		
		return res;
	}
	public void addEgde(int v, int w){
		adj.get(v).add(w);
	}
	public static void main(String[] args)
	{
		 BfsTraversing bfs = new BfsTraversing(5);
		 bfs.addEgde(0, 1);
		 bfs.addEgde(0, 2);
		 bfs.addEgde(0, 3);
		 bfs.addEgde(1, 0);
		 bfs.addEgde(1, 2);
		 bfs.addEgde(2, 0);
		 bfs.addEgde(2, 1);
		 bfs.addEgde(3, 0);
		 bfs.addEgde(3, 4);
		 bfs.addEgde(4, 3);
		 for(Integer it:bfs.bfsTraverse(5,bfs.adj)) {
			 System.out.println(it);
		 }
	}

}
