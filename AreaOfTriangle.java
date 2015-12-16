// CS1020 (AY2012/3 Semester 2)
// Name: Fan Yuxin
// Matric. No.: A0103494
// Lab group: 1
// Finds the area of triangle and check whether it is a valid one

import java.util.*;

class AreaOfTriangle {
 // Remember to add a description before the header of each such method.

 public static double area(double a, double b, double c){
   double area, p;
   p=(a+b+c)/2;
   area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
   return area;
 }
 
 public static boolean validTriangle(double a, double b, double c){
   double p;
   p=(a+b+c)/2;
   if(p*(p-a)*(p-b)*(p-c)<0)
     return false;
   else
     return true;
  }
     
   
 
 public static void main(String[] args) {
  double a, b, c;  // lengths of sides of triangle
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter 3 lengths: ");
  
  a = sc.nextDouble();
  b = sc.nextDouble();
  c = sc.nextDouble();

  if(validTriangle(a,b,c))
    System.out.printf("Area = %.2f\n", area(a,b,c));
  else
    System.out.printf("Invalid triangle!\n");
    

 }
}

