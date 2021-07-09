package comparableAndComparator;

public class Student implements Comparable<Student>{
	int marks;
	String name;
	public Student(int marks, String name) 
	{
		this.marks = marks;
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student o) {
		//Increasing order : 
//		if(this.marks>o.marks) return 1;
//		else if(this.marks < o.marks) return -1;
//		return 0;
		
		//Decreasing order : 
//		if(this.marks>o.marks) return -1;
//		else if(this.marks < o.marks) return 1;
//		return 0;
		
		//short trick :		
		return o.marks - this.marks;		
	}
}
