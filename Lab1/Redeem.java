/*  
 * CS1020 (AY2012/3 Sem2)  
 * Lab #1 Ex1  
 * Author    : Fan Yuxin Lacie  
 * Matric no.:   A0103494J
 * Description of program: This program output the best coupon to use 
 * and the amount you need to pay after usage of coupon
 */ 

import java.util.*;

class Coupon {

 // Data attributes
 private String name;
 private double rate;

 // Constructors
 // This default constructor has an empty body
 public Coupon(){        
 }

 public Coupon(String name, double rate) {
  this.name = name;
  this.rate = rate;
 }

 // Accessors
 public String getName() {
  return name;
 }

 public double getRate() {
  return this.rate;
 }

 //Calculates the theoretical amount after the deduction of coupon
 public double payment(double price) {
   double amount;
   if(rate>1)
     amount = price - rate;
   else
     amount = price*(1-rate);
   return amount;

 }
}

class Redeem {
  //Method returns the better Coupon available
  public static boolean betterCoupon(double price, Coupon x, Coupon y){
    double price1 = x.payment(price);
    double price2 = y.payment(price);
    
    if(price1<0 && price2<0)
      return (price1>price2);
    else if (price1>0 && price2>0)
      return (price1<price2);
    else
      return(price1<price2);
  }
          
    

 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   double price; int noOfCoup; String name; double rate; 
   price = sc.nextDouble();
   noOfCoup = sc.nextInt();
   name = sc.next();
   rate = sc.nextDouble();
   Coupon betterCoupon = new Coupon(name, rate);
   
   for(int i=0; i<noOfCoup-1; i++){
     name = sc.next();
     rate = sc.nextDouble();
     Coupon _coupon = new Coupon(name, rate);
     if(betterCoupon(price, _coupon, betterCoupon))
       betterCoupon = _coupon; 
   }
      
   System.out.println("Best choice: " + betterCoupon.getName());
   if(betterCoupon.payment(price)<0)
     System.out.println("You need to pay $0.00");
   else
     System.out.printf("You need to pay $%.2f\n", betterCoupon.payment(price));
 }

}
