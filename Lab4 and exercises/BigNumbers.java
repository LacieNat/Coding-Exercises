import java.util.*;

class Digit {

 // Data attributes
 private int digit;
 private Digit next;

 // Constructors
 // This default constructor has an empty body
 public Digit() {
 }

 public Digit(int digit, Digit next) {
  this.digit = digit;
  this.next = next;
 }

 // Accessors
 public int getDigit() {
  return digit;
 }

 public Digit getNext() {
  return next;
 }

 public void setDigit(int digit) {
  this.digit = digit;
 }

 public void setNext(Digit next) {
  this.next = next;
 }
}

// Added the tail attribute and updated the methods accordingly
// Added a recursive version of sum
class BigNumber {
 private Digit head = null;
 private Digit tail = null;
 private int length = 0;

 // Constructors
 // This default constructor has an empty body
 public BigNumber() {

 }

 // Build a linked list of digits
 public BigNumber(String number) {
  this.length = number.length();
  
  char[] chain = number.toCharArray();
    
  for(int i=0; i<this.length; i++){
    add(Character.getNumericValue(chain[i]));
//    if(i==0)
  //    tail = head;
  }
  
  if(tail.getDigit() == 0 && tail!=head){
   for(n=head; n.getNext()!=tail; n=n.getNext()){
   }
   tail = n;
   tail.setNext(null);
 }
}

 public Digit getHead() {
  return head;
 }

 public int getLength() {
  return length;
 }

 // Append a digit to the linked list
 public void add(int digit) {
   if(length!=1)
     head = new Digit(digit, head);
   else
     head = new Digit(digit, null);

 }

 public Digit getTail() {
  return tail;
 }

 // Sum two big numbers recursively and return its sum
 public static String sum_recursive(BigNumber n1, BigNumber n2) {
  // Fill in 

 }

 public void addAfter(int digit, Digit current){
   if(current.getNext()==null){
     current.setNext(new Digit(digit, null));
     tail = current.getNext();
   }
   else                        
     current.setNext(new Digit(digit, current.getNext()));
 }

 public String toString() {
  Digit n;
  String text = new String();
  for(n=head; n!=null; n = n.getNext()){
    text = n.getDigit() + text;
  }

  return text; // this is a stub
  }

 }
}

class BigNumbers {

 public static void main(String[] args) {
  // Declare a Scanner object to read input

  // Declare the necessary variables

  // Read input and process them accordingly

  // Output the result
  // Ensure your output is in the right format

 }
}
