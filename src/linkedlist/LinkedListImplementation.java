package linkedlist;

import java.util.Stack;

public class LinkedListImplementation<E> 
{
	Node<E> head;
	
	//reverse linkedlist using stack : 
	public void reverseUsingStack()
	{
		Stack<E> stack = new Stack<>();
		Node<E> temp = head;
		
		if(head==null)
			return;
		while(temp!=null) {
			stack.push((E) temp.data);
			temp = temp.next;
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
	}
	
	
	public void reverseLL()
	{
		Node<E> temp = head;
		Node<E> prev = null;
		Node<E> next = null;
		while(temp!=null) 
		{
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
		}
		while(prev!=null) 
		{
			System.out.println(prev.data);
			prev = prev.next;
		}
	}
	
	
	public void add(E data)
	{
		Node<E> toAdd = new Node<E>(data); 
		if(isEmpty())
		{
			head = toAdd;
			return;
		}
		Node<E> temp = head;
		while(temp.next!=null)
			temp = temp.next;
		temp.next = toAdd;
	}
	
	
	public void insertionAtPosition(int position, E data)
	{
		Node<E> toInsert = new Node<>(data);
		Node<E> temp = head,prev = null;
		int pos = 0;
		if(head==null&&position!=pos)
		{
			return;
		}
		if(head==null&&position==pos)
		{
			head = toInsert;
			return;
		}
		while(pos!=position&& temp.next!=null)
		{
			pos++;
			prev = temp;
			temp = temp.next;
		}
		prev.next = toInsert;
		toInsert.next = temp; 
	}
	
	
	void delete(E key)
	{
		Node<E> temp = head,prev = null;
		if(head.next==null&&head.data==key) {
			head = null;
			return;
		}
		if(head.data==key)
		{
			head = head.next;
			return;
		}
		while(temp!=null&&temp.data!=key)
		{
			prev = temp;
			temp = temp.next;
		}
//		if(temp==null)
//			return;		
		prev.next = temp.next;		
	}
	
	
	void print()
	{
		Node<E> temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	//Removing Last Element From Linked List :
	
	public E removeLast() throws Exception
	{
		Node<E> temp = head;
		if(head==null)
			throw new Exception("Can't Remove Element From Empty Linked List");
		while(temp.next.next!=null)
		{
			temp = temp.next;
		}
		Node<E> toRemove = temp.next;
		temp.next = null;
		return toRemove.data;
	}
	
	
	public E getLast() throws Exception
	{
		Node<E> temp = head;
		if(head==null)
			throw new Exception("Can't Remove Element From Empty Linked List");
		while(temp.next!=null)
		{
			temp = temp.next;
		}
//		Node<E> toGet = temp;
		return temp.data;		
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public static class Node<E>
	{
		public E data;
		public Node<E> next;		
		public Node(E data)
		{
			this.data = data;
			this.next = null;				
		}
	}

	public static void main(String[] args) throws Exception 
	{
		LinkedListImplementation<Integer> lli = new LinkedListImplementation<Integer>();
		lli.add(12);
		lli.add(155);
		lli.add(53);
		lli.add(18);
//		lli.insertionAtPosition(2, 45);
//		lli.removeLast();
//		System.out.println(lli.getLast());
//		lli.delete(53);
//		lli.delete(12);
//		lli.print();
//		System.out.println();
//		lli.reverseUsingStack();
//		System.out.println(lli.getLast());
		lli.reverseLL();
	}
}
