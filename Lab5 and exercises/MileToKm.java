import java.util.*;
class MileToKm {
  public static double convert(double mile){
    double km = 1.609*mile;
    return km;
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter distance in miles: ");
    double mile = sc.nextDouble();
    
    System.out.printf(" That equals     %.2f km.", convert(mile));
    System.out.println();
  }
}
     