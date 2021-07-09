package InterviewQue;

import java.util.*;
public class BooleanMatrix {
	static Scanner sc = new Scanner(System.in);
	static int r = sc.nextInt();
	static int c = sc.nextInt();
	static int extra[][] = new int[r][c];

	static void extra(int a,int b)
	{
		for(int i = 0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(i==a || j==b)
					extra[i][j] = 1;
			}
		}
	
	}	
	static void printMat(int extra[][])
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				System.out.print(extra[i][j]+" ");
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int mat[][] = new int[r][c];
		for(int i = 0;i < r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		for(int i = 0;i < r;i++)
		{
			for(int j=0;j<c;j++)
			{
				extra[i][j] = 0;
			}
		}
		for(int i =0;i<r;i++)
		{
			for(int j = 0; j<c;j++)
			{
				if(mat[i][j]==1)
					extra(i, j);
			}
		}

	}

}
