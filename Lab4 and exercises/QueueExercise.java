import java.util.*;

class QueueExercise {
 public static void main(String [] args) throws NoSuchElementException {

  QueueLL <Integer> queue = new QueueLL <Integer> ();
  Scanner sc = new Scanner(System.in);
  String op; int number; boolean size = true;

  while (sc.hasNext()) {
   op = sc.next();

   if (op.equals("Add")) {
     while(sc.hasNextInt()){
       queue.offer(sc.nextInt());
     }
     System.out.println("Items added: " + queue.toString());
   }

   else if (op.equals("Query")) {
     while(sc.hasNextInt()){
       number = sc.nextInt();
       while(!queue.isEmpty() && queue.peek()!=number){
         queue.poll();
       }
       if(!queue.isEmpty() && queue.peek()==number){
         queue.poll();
         if(queue.peek()==null)
           size = false;
       }
     }
     
     if(queue.isEmpty() && size)
       System.out.println("Query not met: " + queue.toString());
     else
       System.out.println("Query met: " + queue.toString());

   }
  }
 }

}

