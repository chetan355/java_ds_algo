package stack;
import java.util.*;

public class PostfixEvaluation {
	
	static int postfixEvaluation(String exp) {
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);
			if(Character.isDigit(ch)) {				
				stack.push(ch - '0');
			}
			else {
				int val1 = stack.pop();
				int val2 = stack.pop();
				switch(ch) {
				case '+':
					stack.push(val2+val1);
					break;
				case '-':
					stack.push(val2-val1);
					break;
				case '*':
					stack.push(val2*val1);
					break;
				case '/':
					stack.push(val2/val1);
				}
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {
		System.out.println(postfixEvaluation("231*+9-"));
	}

}
