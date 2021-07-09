package sortingalgorithms;

public class QuickSort {
	static void swap(int arr[], int i, int j)
	{
		arr[i] = arr[i]+arr[j];
		arr[j] = arr[i] - arr[j];
		arr[i] = arr[i] - arr[j];
	}
	static void quickSort(int arr[],int l, int h)
	{
		if(l<h)
		{
			int pivot = partition(arr,l,h);
			quickSort(arr,l,pivot-1);
			quickSort(arr, pivot+1, h);			
		}
	}
	static int partition(int arr[],int l, int h)
	{
		int pivot = arr[l];
		int i = l;
		int j = h;
		while(i<j) {
		while(arr[i]<=pivot && i<j)i++;
		while(arr[j]>pivot && i<j)j--;
		swap(arr,i,j);}
		swap(arr,j,l);
		return j;
	}

	public static void main(String[] args) {
		
		int arr[] = {8,4,5,2,8,1,0,2};
		int h = arr.length-1;
		quickSort(arr, 0, h);
		for(int x:arr)
			System.out.println(x);
	}

}
