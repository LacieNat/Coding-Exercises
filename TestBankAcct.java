class BankAcct {
  private int _acctNum;
  private double _balance;
  
  public BankAcct(){
    
  }
  
  public BankAcct(int aNum, double bal){
    _acctNum = aNum;
    _balance = bal;
  }
  
  public boolean withdraw(double amount){
    if (_balance<amount)
      return false;
    _balance -= amount;
    return true;
  }
  
  public void deposit(double amount){
    if (amount<=0)
      return;
    _balance += amount; 
  }
  
  public void print() {
    System.out.println("Account Number: " +_acctNum);
    System.out.printf("Balance: $%.2f\n", _balance);
  }
}


class TestBankAcct2 {
  public static void transfer(BankAcct fromAcct, BankAcct toAcct, double amt){
    fromAcct.withdraw(amt);
    toAcct.deposit(amt);
  }
  
  public static void main(String[] args){
    BankAcct ba1 = new BankAcct(1, 234.56);
    BankAcct ba2 = new BankAcct(2, 1000.0);
    
    transfer(ba1, ba2, 200.50);
    
    ba1.print();
    ba2.print();
  }
}