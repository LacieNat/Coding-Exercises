import java.util.Scanner;

class ApproximatePi {
  public static main void(String[] args){
    double pi;
    int i;
    int terms;
    
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter number of terms: ");
    terms = myScanner.nextInt();
    
    for(i=0; i<terms; i++){
      