package sets;
import java.util.*;

public class ZeroSumSubArray 
{
	static boolean zeroSumChecker(int arr[]) {
		boolean found = false;
		Set<Integer> st  = new HashSet<>();
//		int n = arr.length;
//		for(int i=0;i<n;i++)
//		{
//			int sum=0;
//			for(int j=i;j<n;j++)
//			{
//				sum+=arr[j];
//				if(sum==0)
//				{
//					found = true;					
//					break;
//				}				
//			}
//			if(found)
//				break;
//		}
		int sum = 0;
		for(int x:arr)
		{
			st.add(sum);
			sum+=x;
			if(st.contains(sum))
			{
				found = true;
				break;
			}
		}
		return found;
	}

	
	public static void main(String[] args) 
	{
		int arr[]  = {2,3,-2,-3};
		System.out.println(zeroSumChecker(arr));
	}

}
