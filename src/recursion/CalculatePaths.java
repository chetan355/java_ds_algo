package recursion;

public class CalculatePaths {

	static int paths(int m, int n) {
		if(n==1||m==1)
			return 1;
		return paths(m,n-1) + paths(m-1,n);
	}
	
	public static void main(String[] args) 
	{
		System.out.println(paths(4,4));
	}

}
