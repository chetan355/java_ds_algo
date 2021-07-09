package recursion;

public class CoinGame 
{
	static int maxCoin(int arr[], int l, int r){
		if(l+1==r)
			return Math.max(arr[l], arr[r]);
		return Math.max(arr[l] + Math.min(maxCoin(arr,l+2,r) , maxCoin(arr, l+1, r-1))
				,arr[r] + Math.min(maxCoin(arr,l+1,r-1) , maxCoin(arr, l, r-2)));
	}
	public static void main(String[] args) 
	{
		int arr[] = {1,4,200,5};
		System.out.println(maxCoin(arr, 0, 3));
	}

}
