import java.util.LinkedList;
import java.util.Stack;

//Question 1

class QuestionOne {
	public static void main(String[] args) {

		LinkedList<Integer> q = new LinkedList<Integer>();
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();

		s1.push(new Integer(3));
		s1.push(new Integer(2));
		s1.push(new Integer(1));

		while(!s1.isEmpty()) {
			s2.push(s1.pop());
			if(!s1.isEmpty()) s2.push(s1.peek());
			q.offer(s2.peek());
		}

		s1.push(q.remove());

		/* The following code is to help you print out the content of the above stacks and queue 

		String temp = "";

		while (s1.size() > 0) {
			temp = s1.pop() + " " + temp;
		}

		System.out.println("S1 :" + temp);

		temp = "";

		while (s2.size() > 0) {
			temp = s2.pop() + " " + temp;
		}

		System.out.println("S2 :" + temp);

		temp = "";

		while (q.size() > 0){
			temp = temp + " " + q.remove();
		}
		System.out.println("Q :" + temp);
		*/
	}
}
