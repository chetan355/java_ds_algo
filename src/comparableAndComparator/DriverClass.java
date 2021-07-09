package comparableAndComparator;
import java.util.*;
public class DriverClass {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(40, "chetan"));
		list.add(new Student(60, "bhavesh"));
		list.add(new Student(50, "vishal"));
		list.add(new Student(20, "sam"));
		list.add(new Student(80, "sam"));
		
//		Collections.sort(list,new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				if(o1.name.equals(o2.name))
//					return o1.marks-o2.marks;
//				else 
//				{
//					return o1.name.compareTo(o2.name);
//				}
//			}
//			
//		});
//		Collections.sort(list,(o1,o2) -> 
//			{
//				if(o1.name.equals(o2.name))
//					return o1.marks-o2.marks;
//				else 
//				{
//					return o1.name.compareTo(o2.name);
//				}
//			});
//		Collections.sort(list,(o1,o2) -> o1.name.compareTo(o2.name));
		
		Collections.sort(list,Comparator.comparing(Student::getName).thenComparing(Student::getMarks));
		
		list.forEach(System.out::println);
	}
}
//class ComparatorDriverClass implements Comparator<Student>{
//	@Override
//	
//	public int compare(Student obj1, Student obj2) 
//	{
//		if(obj1.name.equals(obj2.name))
//			return obj1.marks-obj2.marks;
//		else 
//		{
//			obj1.name.compareTo(obj2.name);
//		}
//		return 0;
//	}	
//}
