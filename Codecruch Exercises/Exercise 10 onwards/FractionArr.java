// Fraction class, using a 2-element integer array as the data members

class FractionArr implements FractionI {

 /************** Data members **********************/
 private int[] members;

 /************** Constructors **********************/
 public FractionArr(int numer, int denom){
   members = new int[2];
   members[0] = numer;
   members[1] = denom;
 }


 /**************** Accessors ***********************/
 public int getNumer(){
   return members[0];
 }
 
 public int getDenom(){
   return members[1];
 }

 /**************** Mutators ************************/
 public void setNumer(int numer){
   members[0] = numer;
 }
 
 public void setDenom(int denom){
   members[1] = denom;
 }

 /***************** Other methods ******************/
 public void simplify(){
   int i=2;
   while(i<=Math.abs(this.getNumer())){
     if(this.getNumer()%i==0 && this.getDenom()%i==0){
       members[0]/=i;
       members[1]/=i;
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

