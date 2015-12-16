import java.util.*;

//Question 5

class Buffer implements Queue<String>{
 private int size;

 public Buffer() {
  size = 0;
 }

 public void setSize(int size) {
  this.size = size;
 }


 // Method to load data into the buffer
 public void loadBuffer(String input) {
  q.offer(input);
 }

 // This method is supposed to clear from buffer the data element which 
 // was there the earliest and output that element to the user
 public void retrieveFromBuffer() {
  System.out.println(q.peek());
  q.poll();
 }

 // This method must display contents of the buffer to the user before
 // emptying it
 public void clearBuffer() {
   for(int i=0; i<size; i++){
     q.poll();
   }
 }

}

class Driver {
 public static void main(String[] args) {

  Buffer buffer = new Buffer();

  String command;
  String[] input;
  int size;
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter buffer size : ");
  size = sc.nextInt();
  command = sc.nextLine();       // advance scanner past the current line after fetching the integer value
  buffer.setSize(size);

  System.out.print("Please enter a command (“load <string>”, “retrieve”, “clear”, or “exit”) : ");
  command = sc.nextLine();

  while (!command.equals("exit")) {

   input = command.split(" ");
   if (input[0].equals("load")) {
    buffer.loadBuffer(command.substring(5));
   }
   else if (input[0].equals("retrieve")) {
    buffer.retrieveFromBuffer();
   }
   else if (input[0].equals("clear")){
    buffer.clearBuffer();
   }
   else {
    System.out.println("Enter a valid command!");
   }
   System.out.print("Please enter a command (“load <string>”, “retrieve”, “clear”, or “exit”) : "); 
   command = sc.nextLine();
  }
 }
}
