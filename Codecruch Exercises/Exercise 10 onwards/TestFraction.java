// To test out Fraction class
import java.util.*;

class Fraction implements FractionI {

 /************** Data members **********************/
 private int numer;
 private int denom;

 /************** Constructors **********************/
 public Fraction(){
   this(1,1);
 }
 
 public Fraction(int numer, int denom){
   this.numer = numer;
   this.denom = denom;
 }

 /**************** Accessors ***********************/
 public int getNumer(){
   return numer;
 }
 
 public int getDenom(){
   return denom;
 }

 /**************** Mutators ************************/
 public void setNumer(int numer){
   this.numer = numer;
 }
 
 public void setDenom(int denom){
   this.denom = denom;
 }

 /***************** Other methods ******************/
 public void simplify(){
   int i=2;
   while(i<=Math.abs(numer)){
     if(numer%i==0 && denom%i==0){
       numer/=i;
       denom/=i;
     }
     else
       i++;
   }

 }
 
     
 public FractionI add(FractionI f){
   Fraction ans = new Fraction();
   if(this.getDenom() == f.getDenom()){
     ans.setNumer(this.getNumer()+f.getNumer());
   }
   else{
     int numer_1 = this.getNumer()*f.getDenom()+f.getNumer()*this.getDenom();
     int denom_1 = f.getDenom()*this.getDenom();
     ans.setNumer(numer_1);
     ans.setDenom(denom_1);
   }
   ans.simplify();
   return ans;
 }
 
  public FractionI minus(FractionI f){
   Fraction ans = new Fraction();
   if(this.getDenom() == f.getDenom()){
     ans.setNumer(this.getNumer()-f.getNumer());
   }
   else{
     int numer_1 = this.getNumer()*f.getDenom()-f.getNumer()*this.getDenom();
     int denom_1 = f.getDenom()*this.getDenom();
     ans.setNumer(numer_1);
     ans.setDenom(denom_1);
   }
   ans.simplify();
   return ans;
 }
  
  public FractionI times(FractionI f){
    Fraction ans = new Fraction();
    ans.setNumer(this.getNumer()*f.getNumer());
    ans.setDenom(this.getDenom()*f.getDenom());
    ans.simplify();
    if(ans.getNumer()==0)
      ans.setDenom(1);
    return ans;
  }
  
  public FractionI divide(FractionI f){
    Fraction ans = new Fraction();
    ans.setNumer(this.getNumer()*f.getDenom());
    ans.setDenom(this.getDenom()*f.getNumer());
    ans.simplify();
    if(ans.getDenom() == 0){
      IllegalArgumentException exObj = new IllegalArgumentException("Division by zero error!");
      throw exObj;
    }
    return ans;
  }
  
  public boolean equals(Object obj){
    if(obj instanceof Fraction){
      Fraction another_frac = (Fraction) obj;
      this.simplify(); another_frac.simplify();
      return this.getNumer()==another_frac.getNumer()&&this.getDenom()==another_frac.getDenom();
    }
    else
      return false;
  
  }
  
  public String toString(){
    return this.getNumer() + "/" + this.getDenom();
  }
    
     
 }

class TestFraction {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter 1st fraction: ");
  int a = sc.nextInt();
  int b = sc.nextInt();
  FractionI f1 = new Fraction(a, b);

  System.out.print("Enter 2nd fraction: ");
  a = sc.nextInt();
  b = sc.nextInt();
  FractionI f2 = new Fraction(a, b);

  System.out.println("1st fraction is " + f1);
  System.out.println("2nd fraction is " + f2);

  if (f1.equals(f2)) 
   System.out.println("The fractions are the same.");
  else
   System.out.println("The fractions are not the same.");

  FractionI sum = f1.add(f2);
  System.out.println("Sum is " + sum);

  FractionI diff = f1.minus(f2);
  System.out.println("Difference is " + diff);

  FractionI prod = f1.times(f2);
  System.out.println("Product is " + prod);

  FractionI quot = f1.divide(f2);
  System.out.println("Quotient is " + quot);
 }
} 

