package stack;

public class StackImplementation {

	public static void main(String[] args) throws Exception 
	{
		MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(10);
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		
		System.out.println(stack.pop());
		System.out.println(stack);
		

	}

}
