public interface FractionI { 
 public int getNumer();   // returns numerator part
 public int getDenom();   // returns denominator part
 public void setNumer(int numer);   // sets new numerator
 public void setDenom(int denom);   // sets new denominator

 public FractionI add(FractionI f);     // returns this + f
 public FractionI minus(FractionI f);   // returns this - f
 public FractionI times(FractionI f);   // returns this * f
 public FractionI divide(FractionI f);  // returns this / f
 public FractionI simplify();           // simplifies this
}

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
 public FractionI simplify(){
   for(int i=2; i<=numer; i++){
     if(numer%i==0 && denom%i==0){
       numer/=i;
       denom/=i;
     }
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
   ans.simply();
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
    return ans;
  }
  
  public FractionI divide(FractionI f){
    Fraction ans = new Fraction();
    ans.setNumer(this.getNumer()*f.getDenom());
    ans.setDenom(this.getDenom()*f.getNumer());
    ans.simplify();
    return ans;
  }
     
   


}

