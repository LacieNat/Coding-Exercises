/*  
 * CS1020 (AY2012/3 Sem2)  
 * Lab #3 Ex2  
 * Author    :  Fan Yuxin 
 * Matric no.:  A0103494J 
 * Description of program: This program takes in big numbers and output the sum of the two input big numbers. 
 */ 
import java.util.*;

class Digit {

 // Data attributes
 private int digit;
 private Digit next;

 // Constructors
 // This default constructor has an empty body
 public Digit(){    
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
 
 //Mutators
 public void setDigit(int digit) {
  this.digit = digit;
 }
 
 public void setNext(Digit next) {
  this.next = next;
 }
}

class BigNumber {
 
 //Attributes
 private Digit head = null;
 private int length = 0;
 private Digit tail = null;

 // Constructors
 // This default constructor has an empty body 
 public BigNumber() {
 }

 // Build a linked list of digits
 public BigNumber(String number) {
  Digit n; 
  this.length = number.length();
  char[] chain = new char[this.length];
  chain = number.toCharArray();
  
  for(int i=0; i<this.length; i++){
    add(Character.getNumericValue(chain[i]));
    if(i==0)
      tail = head;
  }
  
  if(tail.getDigit() == 0 && tail!=head){
    for(n=head; n.getNext()!=tail; n=n.getNext()){
    }
    tail = n;
    tail.setNext(null);
  }
  
 }
 
 // Accessors
 public Digit getHead() {
  return head;
 }
 
 public Digit getTail(){
   return tail;
 }

 public int getLength() {
  return length;
 }
 
 //Method that adds the digit from left to right
 public void add(int digit){
   if(length!=1)
     head = new Digit(digit, head);
   else
     head = new Digit(digit, null);
 }
 
 //Method that adds the digit after the current node
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

// This is the driver class
class BigNumbers {
  
 // Sum two big numbers and return its sum
 public static String sum(BigNumber n1, BigNumber n2) {
   
   int newDigit; int carry =0;
   Digit nextNum1 = n1.getHead();
   Digit nextNum2 = n2.getHead();
    
   if(n1.getLength() < n2.getLength()){   
     for(int i=0; i<n2.getLength()-n1.getLength(); i++)
       n1.addAfter(0, n1.getTail());
   }
   
   
   else if(n1.getLength() > n2.getLength()){
     for(int j=0; j<n1.getLength()-n2.getLength(); j++)
       n2.addAfter(0, n2.getTail());
   }

   while(nextNum1!=null && nextNum2!=null){
     newDigit = nextNum1.getDigit() + nextNum2.getDigit() + carry;
    
     if(nextNum1.getDigit()+nextNum2.getDigit() + carry> 9)
       carry = 1;
     else
       carry = 0;
     nextNum1.setDigit(newDigit%10);
     
     if(nextNum1.getNext()==null && carry ==1)
       n1.addAfter(carry, nextNum1);
     nextNum1 = nextNum1.getNext();
     nextNum2 = nextNum2.getNext();
   }

  return n1.toString(); 
 }

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  int numOperation = sc.nextInt();
  ArrayList<String> ans = new ArrayList<String>();
  
  for(int i=0; i<numOperation; i++){
    BigNumber num1 = new BigNumber(sc.next());
    BigNumber num2 = new BigNumber(sc.next());
    ans.add(sum(num1, num2));
  }

   for(String element: ans){
     System.out.println(element);
   }
 }
}
