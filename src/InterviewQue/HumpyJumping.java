package InterviewQue;

public class HumpyJumping {
	
	static int xorCalculate(int x, int y){
		return (x | y) & (~x | ~y);		
	}

	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,8,6};
		int n = arr.length;
		int maxXor = 0;
		for(int i = 0; i < n; i++) 
		{
			int heightXor = arr[i];
			for(int j = i+1; j < n; j++) 
			{
				if(arr[j] > arr[j-1]) 
				{
					heightXor = xorCalculate(heightXor,arr[j]); 
				}
			}
			if(heightXor>maxXor)
				maxXor = heightXor;
		}
		System.out.println(maxXor);
	}

}
