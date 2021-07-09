package arraylist;

import java.util.ArrayList;

public class MergeIntervals {
	private static ArrayList<Intervals> mergeIntervals(ArrayList<Intervals> list
			,Intervals toinsertInterval)
	{
		if(list==null)
		{
			list = new ArrayList<Intervals>(); 
			list.add(toinsertInterval);
			return list;
		}
		else if(list.size()==0)
		{
			list.add(toinsertInterval);
			return list;			
		}
		int i =0;
		Intervals toinsert = toinsertInterval;
		while(i<list.size())
		{
			Intervals currInterval = list.get(i);
			if(toinsert.start>currInterval.end)
			{
				i++;
				continue;
			}
			else if(toinsert.end<currInterval.start)
			{
				list.add(i,toinsert);
				break;
			}
			else 
			{
				toinsert.start = Math.min(toinsert.start,currInterval.start);
				toinsert.end = Math.max(toinsert.end,toinsert.end);
				list.remove(i);
			}
		}
		if(list.size()==i)
			list.add(toinsert);
		return list;
	}

	public static void main(String[] args) 
	{
		ArrayList<Intervals> list = new ArrayList<Intervals>();
		list.add(new Intervals(1,8));
		list.add(new Intervals(10,15));
		list.add(new Intervals(16,21));
		list.add(new Intervals(22,25));
		Intervals toMergeInterval = new Intervals(9,14); 
		ArrayList<Intervals> oplist = mergeIntervals(list,toMergeInterval);
		for(int i = 0;i<oplist.size();i++)
			System.out.println(oplist.get(i));
	}

}
class Intervals
{
	int start,end;
	public Intervals() {
		start = 0;
		end = 0;
	}
	Intervals(int s,int e)
	{
		start = s;
		end = e;
	}
}