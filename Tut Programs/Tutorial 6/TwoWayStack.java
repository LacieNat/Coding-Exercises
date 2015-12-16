// Question 3

public class TwoWayStack<E> {
	private E[] items;
	private int sizeOfArray = 10;
	
	public TwoWayStack() {
		items = (E[]) new Object[sizeOfArray];
		//Initialize your variables 
	}

	public boolean topEmpty() {
		//Checks that the top stack is empty
	}
	
	public boolean bottomEmpty() {
		//Checks that the bottom stack is empty
	}

	public E peekTop() {
		//Returns first element in top stack, but does not pop it
	}
	
	public E peekBottom() {
		//Returns first element in bottom stack, but does not pop it
	}
	
	public void pushTop(E item) {
		//Pushes an item into the top stack
	}
	
	public void pushBottom(E item) {
		//Pushes an item into the bottom stack
	}
	
	public E popTop() {
		//Returns the item popped from the top stack
	}
	
	public E popBottom() {
		//Returns the item popped from the bottom stack
	}
	
	public static void main(String Args[]) {
		TwoWayStack<String> mystacks = new TwoWayStack<String>();
		mystacks.pushBottom("stack");
		mystacks.pushBottom("one");
		mystacks.pushBottom("is");
		mystacks.pushBottom("This");
		mystacks.pushTop("stack");
		mystacks.pushTop("other");
		mystacks.pushTop("the");
		mystacks.pushTop("is");
		mystacks.pushTop("This");
		
		while(!mystacks.bottomEmpty()) {
			System.out.print(mystacks.popBottom() + " ");
		}
		System.out.println();

		while(!mystacks.topEmpty()) {
			System.out.print(mystacks.popTop() + " ");
		}
	}
	
}
