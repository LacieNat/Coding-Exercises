import java.util.*;

class Prime {
  public static boolean isPrime(int number){
    int i;
    if(number==2)
      return true;
    for(i=2; i<number; i++){
      if(number%i==0)
        return false;
    }
    return true;
  }
  
  public static int[] primeFactors(int number){
    int[] result = new int[10];
    int index = 0;
    int i=2;
    while(number!=1){
      if (isPrime(i)){
        if(number%i==0){
          result[index]=i;
          index++;
          while(number%i==0)
            number = number/i;
        }
        else
          i++;
      }
      else
        i++;
    }
    return result;
  }
  
  public static int[] listOfPrimes(int lower, int upper) {
    int[] result = new int[100];
    int index = 0;
    for(int j=lower; j<=upper; j++){
      for(int i=2; i<upper; i++){
        if(j%i==0)
          
      
      
        
  public static void main(String[] args){
    int number;
    Scanner myScanner = new Scanner(System.in);

    
    System.out.print("Enter your number: ");
    number = myScanner.nextInt();
    
    int[] arrayRef = primeFactors(number);
    System.out.println("arrayRef.length = " + arrayRef.length);
    if(isPrime(number))
      System.out.println("The number is a prime number.");
    else
      System.out.println("The number is not a prime number");
    
    System.out.print("The prime factors of the number are: ");
    for(int i=0; i<arrayRef.length; i++){
      if(arrayRef[i]!=0)
        System.out.print(arrayRef[i]+ " ");
    }
  }
}
    
    