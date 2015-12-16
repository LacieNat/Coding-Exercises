//Tutorial 5 Question 1, 2
import java.util.*;

class BasicLinkedList<E> implements LinkedListInterface<E> {

	protected ListNode <E> head = null;
	protected int num_nodes = 0;

	public boolean isEmpty(){ 
		return (num_nodes == 0);
	}

	public int size(){
		return num_nodes;
	}

	public E getFirst() throws NoSuchElementException {
		if (head == null) 
			throw new NoSuchElementException("List is empty!");
		else return head.getElement();
	}

	public boolean contains(E item) {
		for (ListNode <E> n = head; n!= null; n = n.getNext()){
			if (n.getElement().equals(item)){
				return true;
			}
		}
		return false;
	}

	public void addFirst(E item) {
		head = new ListNode <E> (item, head);
		num_nodes++;
	}

	public E removeFirst() throws NoSuchElementException {
		ListNode <E> ln;
		if (head == null) 
			throw new NoSuchElementException("can't remove from an empty list");
		else { 
			ln = head;
			head = head.getNext();
			num_nodes--;
			return ln.getElement();
		}
	}

	public void print() throws NoSuchElementException {
		if (head == null)
			throw new NoSuchElementException("Nothing to print...");

		ListNode <E> ln = head;
		System.out.print(ln.getElement());
		for (int i = 1; i < num_nodes; i++) {
			ln = ln.getNext();
			System.out.print(", " + ln.getElement());
		}
		System.out.println(".");
	}

	public void reverse(){
		
	}
}
