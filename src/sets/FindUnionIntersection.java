package sets;
import java.util.*;
//Finding Union and Intersection Of two sets : 
public class FindUnionIntersection {

	public static void main(String[] args) 
	{
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {3,2,5,6,8};
		Set<Integer> x = new HashSet<>();
		for(int x1: arr1)
			x.add(x1);
		
		Set<Integer> y = new HashSet<>();
		for(int y1: arr2)
			y.add(y1);
		
//		x.addAll(y); 	# Union :  
//		for(int st:x)
//			System.out.println(st);
		x.retainAll(y);	// # Intersection :
		for(int st:x)
			System.out.println(st);
		
	}

}
