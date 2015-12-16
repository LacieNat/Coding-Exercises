import java.util.*;

class StackExercise {
 public static void main(String [] args) throws NoSuchElementException {

  StackLL <Integer> stack = new StackLL <Integer> ();
  ArrayList<String> string = new ArrayList<String>();
  Scanner sc = new Scanner(System.in);
  String op;   int number;

  while (sc.hasNext("Add")||sc.hasNext("Query")) {
   op = sc.next();

   if (op.equals("Add")) {
     while(sc.hasNextInt()){
       stack.push(sc.nextInt());
     }
     string.add("Items added: " + stack.toString());
   }

    else if (op.equals("Query")) {
     while(sc.hasNextInt()){
       number = sc.nextInt();
       while(!stack.isEmpty() && stack.peek()!=number){
         stack.pop();
       }
       if(!stack.isEmpty() && stack.peek()==number)
         stack.pop();
     }      
     if(!stack.isEmpty()){
       string.add("Query met: " + stack.toString());
     }
     else{
       string.add("Query not met: " + stack.toString());
     }
    }
   }
   for(String element: string){
     System.out.println(element);
   }
  }
}
 



