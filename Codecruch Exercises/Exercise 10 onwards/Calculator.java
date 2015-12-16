import java.util.*;
import java.text.*;
class Calculator {
  public static void main(String[] args){
    DecimalFormat df = new DecimalFormat("0.00");
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter radius: ");
    
    int radius = sc.nextInt();
    
    float area = (float)Math.PI*radius*radius;
    
    System.out.println(df.format(area));
  }
}