/*  
 * CS1020 (AY2012/3 Sem2)  
 * Lab #3 Ex1  
 * Author    : 
 * Matric no.:  
 * Description of program: (fill in the description below)
 *
 */

import java.util.*;

/*class ListNode<Integer> {
  //data attributes
  private E element;
  private ListNode<E> next;
  
  public ListNode(E item){
    this(item, null);
  }
  
  public ListNode(E item, ListNode <E> n){
    element = item;
    next = n;
  }
  
  public ListNode<E> getNext() {
    return next;
  }
  
  public E getElement() {
    return element;
  }
  
  public void setNext(ListNode<E> n) {
    next = n;
  }
}
*/

class AlternateList {
 
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  String operation;
  
  ArrayList<String> alternate = new ArrayList<String>();
  
  //Declaring the LinkedList
  LinkedList <Integer> list = new LinkedList <Integer>();
  
  int size = sc.nextInt();
  int numUpdates = sc.nextInt();
  
  //Scanning in the list
  for(int i=0; i<size; i++){
    list.addLast(sc.nextInt());
  } 
  
  for(int j=0; j<numUpdates; j++){
    operation = new String(sc.next());
    if(operation.equals("M")) {
      doMove(list, sc.nextInt(), sc.nextInt());
    }    
    else if(operation.equals("A")) 
      doAdd(list, sc.nextInt(), sc.nextInt(), sc.nextInt()); 
    else if(operation.equals("R")) 
      doRemove(list, sc.nextInt(), sc.nextInt()); 
    
    if(checkAlternate(list, list.size()))
      alternate.add("YES");
    else
      alternate.add("NO");
      
  }
  
   for(String element: alternate){
     System.out.println(element.toString());
   }

 }

 // Precond:
 // Postcond:
 public static void doMove(LinkedList <Integer> list, int index, int size) {
   for(int i=0; i<size; i++){
     list.addLast(list.remove(index-1));
   }
 }
     
 // Precond:
 // Postcond:
 public static void doRemove(LinkedList <Integer> list, int index, int size) {
   for(int i=0; i<size; i++){
     list.remove(index-1);
   }
 }

 // Precond:
 // Postcond:
 public static void doAdd(LinkedList <Integer> list, int index, int size, int value) {
   for(int i=index-1; i<(index+size)-1; i++){
     int temp = list.get(i) + value;
     list.set(i, temp);
   }
 }

 public static boolean checkAlternate(LinkedList<Integer> list, int size){
   for(int i=0; i<size-1; i++){
     if(list.get(i)*list.get(i+1) >0){
       return false;
     }
   }
   return true;
 }
       


}

