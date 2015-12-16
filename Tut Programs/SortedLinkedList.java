//Tutorial 5 Question 3a
import java.util.LinkedList;
import java.util.ListIterator;

public class SortedLinkedList {
	LinkedList<Integer> list;
	
	public static void main(String[] args) {
		int[] addNums = {10, 4, 6, 11, 10, 15};

		SortedLinkedList mySortedList = new SortedLinkedList();
		mySortedList.printValues();
		for (int x : addNums) {
			mySortedList.addElement(x);
			mySortedList.printValues();
		}
	}

	public SortedLinkedList() {
		list = new LinkedList<Integer>();
	}
	
	public void addElement(int value) {
		// Complete the code
	}
	
	public void printValues() {
		System.out.print("List values are: ");
		System.out.println(list);
	}
}
