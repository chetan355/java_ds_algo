package arrays;
public class ProductArrayPuzzle {
//TC = O(n)	
	static int[] arrayProduct(int arr[],int n){
		int left[] = new int[n];
		int right[] = new int[n];
		int result[] = new int[n];
		left[0] = 1;
		right[n-1] = 1;		
		for(int i = 1; i < n; i++) {
			left[i] = arr[i-1]*left[i-1];
		}
		for(int i = n-2; i >= 0; i--) {
			right[i] = right[i+1]*arr[i+1];
		}
		for(int i = 0; i<n; i++) {
			result[i] = left[i]*right[i];
		}
		return result;		
	}

	public static void main(String[] args) {
		
		int arr[] = {10,2,5,6};
		int n = arr.length;
/*		TC : O(n^2);
 		int result[] = new int[arr.length];
		int prd = 1;
		for(int i = 0; i < arr.length; i++) {
			prd = 1;
			for(int j = 0; j < arr.length; j++) {
				if(i!=j) {
					prd = prd*arr[j];
				}
			}
			result[i] = prd;
		}
*/		for(int x:arrayProduct(arr, n)) {
			System.out.println(x);
		}
	}

}
