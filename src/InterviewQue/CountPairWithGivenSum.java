package InterviewQue;

public class CountPairWithGivenSum {
		
	static int count_pair(int arr[],int n,int k)
	{
		int count = 0;
/*		for(int i = 0; i < n; i++) // time complexity = O(n*n) space complexity = O(1)
		{
			for(int j = i; j < n;j++)
			{
				if(arr[i]+arr[j]==k && i!=j)
					count++;
			}
		}
*/
		int max_less = 0;
		int min_less = 0;
		for(int i = 1; i<n; i++) {
			if(arr[i-1] < k && arr[i] < k)
			{
				max_less = Math.max(arr[i], arr[i-1]);
				min_less = Math.min(arr[i], arr[i-1]);
				if(arr[i]+arr[i]==k)
					count++;
			}
		}
		return count;
	}

	public static void main(String[] args) 
	{
		int arr[] = {1, 1, 1, 1};
		int n = arr.length;
		System.out.println(count_pair(arr, n,2));
		
	}
}
