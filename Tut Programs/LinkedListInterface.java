//Tutorial 5 Question 1
import java.util.*;

public interface LinkedListInterface<E> {

	public boolean 	isEmpty();
	public int 		size();
	public E 		getFirst() throws NoSuchElementException; 
	public boolean 	contains(E item);
	public void 	addFirst(E item);
	public E 		removeFirst() throws NoSuchElementException;  
	public void 	print();
}
