package stack;
import java.io.*;
import java.util.*;

public class QueueUsing2Stack 
{
	Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public static void main(String[] args)throws IOException {
//    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	Scanner sc = new Scanner(System.in);
    	List<String> ip = new ArrayList<>();
        int q = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < q; i++)
        {
        	System.out.println("Enter"+i);
            String qr = sc.nextLine();
            ip.add(qr);
        }
        new QueueUsing2Stack().result(ip);
    }
    void result(List<String> ip){
        for(int i = 0; i < ip.size() ;i++){
        	String str = ip.get(i);
            if(str.contains("1")){
                String[] arr = str.split(" ");
                enqueue(Integer.parseInt(arr[1]));
                continue;
            }
            if(str.equals("2")){
                dequeue();
                continue;
            }
            if(str.equals("3")){
                peek1();                
            }
        }
    }
    
    void enqueue(int n){
//        while(!s1.isEmpty()){
//            s2.push(s1.pop());
//        }
//        s1.push(n);
//        while(!s2.isEmpty()){
//            s1.push(s2.pop());
//        }
    	s1.push(n);
    }
   void dequeue(){
//	   if(!s1.isEmpty()) {
//		   s1.pop();
//	   }
	   if(s2.isEmpty()) {
		   while(!s1.isEmpty()) {
			   s2.push(s1.pop());
		   }
	   }
	   s2.pop();
   }
   void peek1(){
//	   if(!s1.isEmpty()) {
//	   System.out.println(s2.peek());
//   }
	   if(s2.isEmpty()) {
		   while(!s1.isEmpty()) {
			   s2.push(s1.pop());
		   }
	   }
	   System.out.println(s2.peek());
   }	
/* 10
   1 76
   1 33
   2
   1 23
   1 97
   1 21
   3
   3
   1 74
   3
*/   
//	static Stack<Integer> s1 = new Stack<>();
//	static Stack<Integer> s2 = new Stack<>();
//	
//	public static void main(String[] args) 
//	{
//		enqueue(76);
//		enqueue(33);
//		dequeue();
//		enqueue(23);
//		enqueue(97);
//		enqueue(21);
//		enqueue(23);
//		enqueue(97);
//		enqueue(21);
//		peek();
//		peek();
//		enqueue(74);
//		peek();
//		int d = dequeue();
//	}
//	static void enqueue(int n) {
//		while(!s1.isEmpty()) {
//			s2.push(s1.pop());
//		}
//		s1.push(n);
//		while(!s2.isEmpty()) {
//			s1.push(s2.pop());
//		}
//	}
//	static int dequeue() {
//		if(s1.isEmpty()) {
//			System.out.println("queue is empty");
//			System.exit(0);
//		}
//		return s1.pop();
//	}
//	static void peek() {
//		if(s1.isEmpty()) {
//			System.exit(0);
//		}
//		System.out.println(s1.peek());
//	}

}
