import java.util.*;
import java.lang.Math;

class TestMath {
  public static void main(String[] args){
    
    double areaSquare, radius, areaCircle;
    
    Scanner myScanner = new Scanner(System.in);
    
    System.out.print("Enter area of a square: ");
    areaSquare = myScanner.nextDouble();
    
    radius = Math.sqrt(areaSquare)/2;
    areaCircle = Math.PI * Math.pow(radius,2);
    
    System.out.printf("Area of circle = %.4f\n", areaCircle);
  }
}