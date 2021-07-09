package arrays;

public class ZeroSumSubarray {
	
	static boolean isZeroSumSubarray(int arr[]){
		int sum=0;
		boolean found = false;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				sum+=arr[j];
				if(sum==0) {
					found = true;
					break;
				}
			}
		}
		if(found)
			return found;
		return found;
	}

	public static void main(String[] args) {
		int arr[] = {3,4,-1,4,3,-6,-7,2};
		System.out.println(isZeroSumSubarray(arr));

	}

}
