package recursion;

public class FloodFill {
	
	static void floodFill(int a[][], int r, int c, int toFill, int prevFill) 
	{
		int row = a.length;
		int col = a[0].length;
		if(r < 0 || r >= row || c < 0 || c >= col) {
			return;
		}
		if(a[r][c]!=prevFill)
			return;
		a[r][c] = toFill;
		floodFill(a, r-1, c, toFill, prevFill);
		floodFill(a, r+1, c, toFill, prevFill);
		floodFill(a, r, c-1, toFill, prevFill);
		floodFill(a, r, c+1, toFill, prevFill);
		
	}
	static void printMat(int a[][]) {
		for(int i= 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		int a[][] = {{1,1,1,1,1,1},
					{1,2,3,4,3,3,3},
					{1,2,3,3,3,3,3},
					{1,2,4,4,4,5,5}};
		floodFill(a, 0, 0, 5, 1);
		printMat(a);
		
	}

}
