package queue;

import linkedlist.LinkedListImplementation.Node;

public class MyQueue <E>{

	private Node<E> head,rear;
	
	public void enqueue(E data)
	{		
		Node<E> toAdd = new Node<E>(data);
		if(head==null)
		{
			head=rear=toAdd;
			return;
		}
		rear.next = toAdd;
		rear = rear.next;
	}
	public E dequeue()
	{
		if(head==null)
			return null;
		Node<E> temp = head;
		head = head.next;
		if(head == null)
			rear = null;
		return temp.data;
	}
	public static void main(String[] args) 
	{
		MyQueue<Integer> queue = new MyQueue<>();
//		queue.enqueue(12);
//		queue.enqueue(13);
//		queue.enqueue(14);
//		queue.enqueue(15);		
		System.out.println(queue.dequeue());	
	}
}
