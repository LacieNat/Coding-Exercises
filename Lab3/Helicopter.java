/*  
 * CS1020 (AY2012/3 Sem2)  
 * Lab #3 Ex3  
 * Author    :   
 * Matric no.:   
 * Description of program: (fill in the description below)  
 */ 
import java.util.*;

class ListNode {
 private int id; //id of field
 private String helicopterName; //name of parking helicopter
 private ListNode next; //next field
     
 //constructors
 public ListNode() {} 
 public ListNode(int id) { 
  this.id = id;
  this.helicopterName = "";
 }
       
 public ListNode(int id, String planeName){
  this.id = id;
  this.helicopterName = planeName;
 }
        
 
 public int getID(){
   return id;
 }
 
 public String getHelicopterName(){
   return helicopterName;
 }
 
 public ListNode getNext(){
   return next;
 }
 
 public void setID(int id){
   this.id = id;
 }
 
 public void setHelicopterName(String helicopterName){
   this.helicopterName = helicopterName;
 }
 
 public void setNext(ListNode next){
   this.next = next;
 }

}

class ControlTower {
 private int numFields; //the number of fields 
 private ListNode[] fields; //a list of all field objects
    
 // constructors
 ControlTower() {}
 ControlTower(int num) {
   numFields = num;
 }
 
 public ListNode[] getFields(){
   return fields;
 }
 
 public int getNumFields(){
   return numFields;
 }
 
 public void setFields(ListNode[] fields){
   this.fields = fields;
 }
 
 public void customFields(){
   ListNode n = fields[0];
   for(int i=1; i<numFields(); i++){
     n.getNext() = fields[i];
     n = n.getNext();
   }
   n = fields[0];
 }
 
 public void setNumFields(int numFields){
   this.numFields = numFields;
 }
   
      
 //PRE-CONDITION:
 //POST-CONDITION:
 public void helicopterOutgoing(int idx) {
   fields[idx].getHelicopterName() = "empty";
 }
       
 //PRE-CONDITION:
 //POST-CONDITION:
 public void helicopterIncoming(String helicopterId, int dest) {
   boolean a = false;
   for(ListNode n = fields[dest]; n!=fields[dest-1]; n=n.next){
     if((n.getHelicopterName()).equals("Empty")){
       n.setHelicopterName(helicopterId);
       a=true;
       break;
     }
   }
   if(
     
  }
     
     
      
      
 
 
 //Feel free to add in other public/private methods if appropriate
}

class Helicopter {
  
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  int noOfFields = sc.nextInt();
  ListNode[] nodes = new ListNode[noOfFields];
  
  for(int i=0; i<noOfFields; i++){
    nodes[i] = new ListNode(i, "empty");
  }
  
  ControlTower tower = new ControlTower();

  tower.setFields(nodes);
  tower.customFields();

  
  
  
  
  while(true){
  if(sc.next().equals("Incoming"))
    helicopterIncoming(sc.next(), sc.nextInt());
  else if(sc.next().equals("Outgoing"))
    helicopterOutgoing(sc.nextInt());
  else if(sc.next().equals("END"))
    break;
  }
            
  

  }
 }

}

