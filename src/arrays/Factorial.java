package arrays;
import java.util.*;
public class Factorial 
{	
	static ArrayList<Integer> factorial(int N)
	{
        ArrayList<Integer> res = new ArrayList<>();
        if(N==0)
        {
            res.add(1);
            return res;
        }
        double fact = 1;
        for(int i = 1; i <= N; i++) {
        	fact = fact * i;
        }
        String result = String.valueOf(fact);
        for(int i = 0; i < result.length();i++) {
        	char ch = result.charAt(i);
        	res.add(Character.getNumericValue(ch));
        }
        return res;
    }
	public static void main(String[] args) 
	{
		for(int x:factorial(120)) 
		{
			System.out.print(x);
		}
	}

}
