package map;
import java.util.*;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) 
	{
		Map<String,Integer> mp = new HashMap<>();
		
		mp.put("zero",0);
		mp.put("one",1);
		mp.put("two",2);
		mp.put("three",3);
		mp.put("four",4);
		
		System.out.println(mp);
		
		
		for(Entry<String, Integer> num : mp.entrySet())
			num.setValue(num.getValue() * 10);
		System.out.println(mp.entrySet());
		
		System.out.println(getHash("BBA"));
		
	}
	static int getHash(String s) {
		int hash = 0;
		for(int i = 0; i < s.length();i++) {
			hash+=s.charAt(i);
		}
		return hash;
	}

}
