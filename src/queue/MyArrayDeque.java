package queue;

public class MyArrayDeque<E> 
{
	Node<E> head,tail;
	public void addFirst(E data)
	{
		Node<E> toAdd  = new Node<E>(data);
		if(head == null)
		{
			head = tail = toAdd;
			return;
		}
		head.next = toAdd;
		toAdd.prev = head;
		head = toAdd;
	}
	public E removeFirst()
	{
		if(head==null)
		{
			return null;
		}
		head = head.next;
		head.prev = null;
		return head.data;
	}
	public static class Node<E>
	{
		E data;
		Node<E> next,prev;
		public Node(E data)
		{
			this.data = data;
			this.next = this.prev = null;
		}
	}

	public static void main(String[] args) 
	{
		MyArrayDeque<Integer> ad = new MyArrayDeque<>();
		ad.addFirst(12);

	}

}
