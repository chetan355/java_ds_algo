package sortingalgorithms;

public class BubbleSort {

	static void swap(int arr[], int i, int j)
	{
		int temp;
		temp = arr[j];
		arr[j] = arr[j+1];
		arr[j+1] = temp;
	}
	public static void main(String[] args) {
		int arr[] = {4, 3, 7, 1, 5};
		int n = arr.length;
		for(int i = 0; i < n-1; i++)
		{
			boolean swapped = false;
			for(int j = 0; j < n-i-1; j++)
			{
				if(arr[j+1]<arr[j]) {
					swapped = true;
					swap(arr,j+1,j);					
				}
			}
			if(!swapped) break;
		}
		for(int x : arr)
			System.out.println(x);
	}
}
