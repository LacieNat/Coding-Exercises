import java.util.ArrayList;

public class Transaction{
  private String description;
  private double amount;
  
  public Transaction(String description, double amount){
    this.description = description;
    this.amount = amount;
  }
  
  public String getDescription(){
    return description;
  }
  
  public double getAmount(){
    return amount;
  }
}
  
class TransactionTracker{
  private static ArrayList<Transaction> transactions;
  
  public static void main(String[] args) {
   transactions = new ArrayList<Transaction>();
   Transaction eggs = new Transaction("Eggs", 4.00);
   Transaction chocolate = new Transaction("Chocolate bar", 3.44);
   transactions.add(eggs);
   transactions.add(chocolate);
   Transaction eggs2 = new Transaction("Eggs", 4.00);
   int index = transactions.indexOf(eggs2);
   System.out.println(index);
 }
}