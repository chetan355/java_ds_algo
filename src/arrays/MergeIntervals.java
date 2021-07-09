package arrays;
import java.util.*;

public class MergeIntervals {
	
	static int[][] mergingIntervals(int[][]intervals) {
		List<int[]> result = new ArrayList<>();
		int start = intervals[0][0];
		int end = intervals[0][1];
		Arrays.sort(intervals,(a,b) -> a[0] - b[0]); 
		for(int[]i : intervals) 
		{
			if(i[0]<=end)
			{
				end = Math.max(end,i[1]);
			}
			else
			{
				result.add(new int[] {start,end});
				start = i[0];
				end = i[1];
			}
		}
		result.add(new int[] {start,end});
		return result.toArray(new int[0][]);
	}

	public static void main(String[] args) 	
	{
		int arr[][] = {{1,4},{2,8},{10,15}};
		Scanner s = new Scanner(System.in);
		for(int x[]:mergingIntervals(arr)) {
			System.out.println(x[0]+","+x[1]);
		}
	}

}
