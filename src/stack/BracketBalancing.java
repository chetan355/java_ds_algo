package stack;

import java.util.Stack;

public class BracketBalancing {

	public static void main(String[] args) throws Exception 
	{
		boolean balanced = true;
		Stack<Character> stack = new Stack<>();
		String str = "{{[]}}";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch=='{'||ch=='['||ch=='(')
			{
				stack.push(ch);
				continue;
			}
			if(stack.isEmpty()) {
				balanced = true;
				break;
			}
			
			if(ch==']')
			{
				if(stack.peek()=='[')					
					stack.pop();
				else
				{
					balanced = false;
					break;
				}
			}
			if(ch =='}')
			{
				if(stack.peek() == '{')
					stack.pop();
				else
				{
					balanced = false;
					break;
				}
			}
			if(ch ==')')
			{
				if(stack.peek()=='(')
					stack.pop();
				else
				{
					balanced = false;
					break;
				}
			}
		}
		if(!stack.isEmpty())
			balanced = false;
		
		if(balanced)
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
			
	}

}
