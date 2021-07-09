package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class EqualStacks {
	public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) 
    {
        int sum1=0,sum2=0,sum3=0;
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        for(int i = h1.size()-1; i >=0 ; i--){
            stack1.push(h1.get(i));
            sum1+=h1.get(i);
        }
        for(int i = h2.size()-1; i >=0; i--){
            stack2.push(h2.get(i));
            sum2+=h2.get(i);
        }
        for(int i = h3.size()-1; i >=0 ; i--){
            stack3.push(h3.get(i));
            sum3+=h3.get(i);
        }
        while(!stack1.isEmpty()&&!stack2.isEmpty()&&!stack3.isEmpty()){
                int min = Math.min(sum1,sum2);
                int max_min = Math.min(min,sum3);
               if(sum1>max_min)
                sum1=sum1-stack1.pop();
               if(sum2>max_min)
                sum2=sum2-stack2.pop();
               if(sum3>max_min)
                sum3=sum3-stack3.pop();                               
               if(sum1==sum2&&sum1==sum3) {
                   return max_min;
               }
        }
        return 0;
    }

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		List<Integer> l3 = new ArrayList<>();
		l1.add(3);
		l1.add(2);
		l1.add(1);
		l1.add(1);
		l1.add(1);
		l2.add(4);
		l2.add(3);
		l2.add(2);
		l3.add(1);
		l3.add(1);
		l3.add(4);
		l3.add(1);
		System.out.println(equalStacks(l1, l2, l3));
	}

}
