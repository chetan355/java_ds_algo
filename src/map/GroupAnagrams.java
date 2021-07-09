package map;

import java.util.*;

public class GroupAnagrams {
	
	static List<List<String>>groupAnagrams(String[] str)
	{
		Map<String,List<String>> map = new HashMap<>();
		for(String s : str) {
			char charArray[] = s.toCharArray();
			Arrays.sort(charArray);
			String sorted = new String(charArray);
			if(!map.containsKey(sorted)) 
			{
				map.put(sorted,new LinkedList<String>());
			}
			map.get(sorted).add(s);
		}
		return new LinkedList<>(map.values());
	}

	public static void main(String[] args) 
	{
		String str[] = {"cat","act","tac","mat","sat","ast","tam"};
		List<List<String>> mainList = groupAnagrams(str);
		for(List list: mainList) 
		{
			System.out.println(list);
		}
	}
}
