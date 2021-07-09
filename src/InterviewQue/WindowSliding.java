package InterviewQue;

import java.util.*;

public class WindowSliding {

	public static void main(String[] args) 
	{
		int arr[] = {4, 3, 1, 2, 5, 3, 4, 7, 1, 9};
		int k = 4;
		int ans[] = maxSlidingWindow(arr, k);
		for(int x: ans)
			System.out.print(x+" ");
	}
	static int[] maxSlidingWindow(int a[],int k)
	{
		Deque<Integer> dq = new LinkedList<>();
		int n = a.length;
		int ans[] = new int[n-k+1];
		int i=0;
		for(;i<k;i++)
		{
			while(!dq.isEmpty()&&a[dq.peekLast()]<=a[i])
				dq.removeLast();
			dq.addLast(i);
		}
		for(;i<n;i++)
		{
			ans[i-k] = a[dq.peekFirst()];
			while(!dq.isEmpty()&&dq.peekFirst()<=i-k)
				dq.removeFirst();
			while(!dq.isEmpty()&&a[dq.peekLast()]<=a[i])
				dq.removeLast();
			dq.addLast(i);
		}
		ans[i-k] = a[dq.peekFirst()];
		return ans;
	}

}
