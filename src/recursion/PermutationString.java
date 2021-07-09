package recursion;
import java.util.*;

public class PermutationString 
{
	//avoiding duplicates of strings : 
	static Set<String> set = new HashSet<>();
	
	static void permutation(String str, int l, int r) 
	{
		if(l==r) 
		{
			if(set.contains(str)) return;
			set.add(str);
			System.out.println(str);
		}
		for(int i = l; i <= r; i++) 
		{
			str = interchange(str, l, i);
			permutation(str, l+1, r);
			str = interchange(str,l,i);
		}
	}
	static String interchange(String s, int a, int b) 
	{
		char[] array = s.toCharArray();
		char temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		return new String(array);
	}
	public static void main(String[] args) 
	{
		permutation("abb", 0, 2);
	}
}
