/*  
 * CS1020 (AY2012/3 Sem2)  
 * Lab #4 Ex2  
 * Author    : Fan Yuxin
 * Matric no.: A0103494J
 * Description of program: This program simulates a restaurant by taking in orders and ouputing the dishes ready to be served
 */ 

import java.util.*;

//This class represents all orders of customers
class ListOrder {
    
    private int numDishes;
    //each dish has a queue of customers who ordered this dish
    private ArrayList<Queue<Integer>> listQueue;
    
    //constructor
    public ListOrder(int numDishes) {
      this.numDishes = numDishes;
      listQueue = new ArrayList<Queue<Integer>>();
      for(int i=0; i<numDishes; i++){
        listQueue.add(new LinkedList<Integer>());
      }     
    }
    
    //add new order to the list
    public void addNewOrder(int i, int customer) {
      (listQueue.get(i-1)).offer(customer);
    }
    
    //process food when it is ready
    public int processReadyFood(int i)  {
      try{return listQueue.get(i-1).poll();}
      catch(NullPointerException nullObj){return -1;}
     }
}

class QuickEat
{
    public static void main(String [] args) {
      
      //Variables
      int noOfDishes; 
      int op; 
      int noOfOrders;
      int customer;
      int dish;
      int cust;
      String input;
      
      ArrayList<String> menu = new ArrayList<String>();
      ArrayList<String> output = new ArrayList<String>();
      
      //Get input
      Scanner sc = new Scanner(System.in);
      noOfDishes = sc.nextInt();

      ListOrder orders = new ListOrder(noOfDishes);

      
      for(int i=0; i<=noOfDishes; i++){
        menu.add(sc.nextLine());
      }
          
      op = sc.nextInt();
      
      for(int j=0; j<op; j++){
        input = sc.next();
        
        //Order Operation
        if(input.equals("Order")){
          customer = sc.nextInt();
          noOfOrders = sc.nextInt();
          for(int k=0; k<noOfOrders; k++){
            orders.addNewOrder(sc.nextInt(), customer);
          }
        }
        
        //Ready Operation
        else if(input.equals("Ready")){ 
          dish = sc.nextInt();
          cust = orders.processReadyFood(dish);
          if(cust!=-1)
            output.add(menu.get(dish) + " ready to be served to Tag " + cust + ".");
          else
            output.add("Throw away "+ menu.get(dish) + ".");
        }
      }
      
      //Printing the output
      for(String element: output){
        System.out.println(element);
      }
    }
}