package stack;
import java.util.Stack;

public class InfixToPostfix {
	static int precedance(char c) {
		switch(c){
			case '+':
			case '-': return 1;
			case '*':
			case '/': return 2;
			case '^': return 3;
		}
		return -1;
	}
	static String infixToPostfix(String exp) {
		Stack<Character> stack = new Stack<>();
		String result = new String("");
		for(int i = 0; i < exp.length();i++) {
			char ch = exp.charAt(i); 
			if(Character.isLetterOrDigit(ch)) {
				result+=ch;
			}
			else if(ch=='(') {
				stack.push(ch);				
			}else if(ch==')') {
				while(!stack.isEmpty()&&stack.peek()!='(') {
					result+=stack.pop();
				}
				if(!stack.isEmpty()&&stack.peek()=='(') {
					stack.pop();
				}
			}
			else {
				while(!stack.isEmpty() && precedance(ch)<=precedance(stack.peek())) {
					result+=stack.pop();
				}
				stack.push(ch);
			}
		}
		while(!stack.isEmpty()) {
			result+=stack.pop();
		}
		return result;
	}	
	public static void main(String[] args) {
		String exp = "x-y/z-k*(d+n/m)";
		System.out.println(infixToPostfix(exp));		
	}
}