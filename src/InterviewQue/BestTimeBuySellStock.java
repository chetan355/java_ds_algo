package InterviewQue;
import java.util.*;
//Best time to buy and sell stock in array : 
public class BestTimeBuySellStock 
{
	// Time Complexity = O(N) and Space Complexity = O(1) : Optimized Solution 
	static int max_profit_with_multiple_transactions(int prices[],int n)
	{
		int max_profit = 0;
		for(int i = 1;i < n; i++)
		{
			if(prices[i]>prices[i-1])
				max_profit = max_profit + (prices[i]-prices[i-1]);			
		}
		return max_profit;
	}
	static int max_profit(int arr[] , int n)
	{
		int max_pro = 0;
//		int temp_pro = 0;
		int min_so_far = 0;
		// Time Complexity = O(N*N) and Space Complexity = O(1) : Brute Force Solution 
/*		for(int i = 0; i < n; i++)
		{
			for(int j = i; j < n; j++)
			{
				temp_pro = arr[j] - arr[i];
				if(temp_pro>max_pro)
					max_pro = temp_pro;
			}
		}
		
*/		
		// Time Complexity = O(N) and Space Complexity = O(1) : Optimized Solution 
		min_so_far = arr[0];
		for(int i=0;i<n;i++)
		{
			if(min_so_far>arr[i])
				min_so_far = arr[i];
			if(max_pro<arr[i]-min_so_far)
				max_pro = arr[i] - min_so_far;
		}
		return max_pro;
		
	}
	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
//		System.out.println(max_profit(arr,n));
		System.out.println(max_profit_with_multiple_transactions(arr, n));
	}
}
