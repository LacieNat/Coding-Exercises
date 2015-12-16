//Tutorial 5 Question 2
import java.util.*;

class ReverseTest{
	public static void main(String[] args){
		BasicLinkedList<Integer> list = new BasicLinkedList<Integer>();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);

		System.out.print("Original list: ");
		list.print();

		list.reverse();
		System.out.print("Reversed list: ");
		list.print();
	}
}