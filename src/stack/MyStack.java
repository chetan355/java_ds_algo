package stack;

import linkedlist.LinkedListImplementation;

public class MyStack<E> {
	LinkedListImplementation<E> ll = new LinkedListImplementation<E>();
	void push(E element)
	{
		ll.add(element);
	}
	E pop() throws Exception 
	{
		if(ll.isEmpty())
			throw new Exception("Can'nt remove element from empty stack");
		return ll.removeLast();
	}
	E peek() throws Exception
	{
		if(ll.isEmpty())
			throw new Exception("Can'nt return element from empty stack");
		return ll.getLast();
	}
	public boolean isEmpty()
	{
		if(ll.isEmpty())
			return true;
		else return false;
	}
	
	public static void main(String[] args) 
	{
		
	}

}
