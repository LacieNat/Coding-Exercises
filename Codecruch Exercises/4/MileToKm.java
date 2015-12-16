import java.util.*;
class MileToKm{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter distance in miles: ");
    double miles = sc.nextDouble();
    double km = 1.609 * miles;
    System.out.printf("That equals %.2f km\n", km);
  }
}