//Tutorial 5 Question 1
import java.util.*;

public class Merge {

	public static void main(String[] args) {
		BasicLinkedList<Integer> listOne = new BasicLinkedList<Integer>();
		BasicLinkedList<Integer> listTwo = new BasicLinkedList<Integer>();

		listOne.addFirst(5);
		listOne.addFirst(4);
		listOne.addFirst(2);

		listTwo.addFirst(3);
		listTwo.addFirst(1);

		System.out.print("List one: ");
		listOne.print();
		System.out.print("List two: "); 
		listTwo.print();

		ListNode<Integer> mergedListHead = merge(listOne.head, listTwo.head);
		
		System.out.print("Merged list: ");
		for(ListNode<Integer> itr = mergedListHead; itr != null; itr = itr.getNext()){
			if(itr.getNext() != null){
				System.out.print(itr.getElement() + ", ");
			} else {
				System.out.println(itr.getElement() + ".");
			}
		}

		System.out.print("List one after merge: ");
		listOne.print();
		System.out.print("List two after merge: ");
		listTwo.print();
	}

	public static ListNode<Integer> merge(ListNode<Integer> head1, ListNode<Integer> head2) {
		// Complete this method
		return null; // Stub
	}
}
