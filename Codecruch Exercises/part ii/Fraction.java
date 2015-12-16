// Fraction class

class Fraction {

 /************** Data members **********************/
 private int numer;
 private int denom;

 /************** Constructors **********************/
 public Fraction(){
   numer = 1;
   denom = 1;
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
 public Fraction simplify(){
   int i=2;
   while(i<=Math.abs(numer)){
     if(numer%i==0 && denom%i==0){
       numer/=i;
       denom/=i;
     }
     else
       i++;
   }
   return this;
 }
 
 public Fraction add(Fraction f){
    numer = numer*(f.denom)+(f.numer)*denom;
   denom = denom*(f.denom);
   this.simplify();
   if(numer==0)
     denom=1;
   return this;
 }
 
 public String toString(){
   return numer+"/"+denom;
 }
 
 public boolean equals(Object obj){
   this.simplify();
   if(obj instanceof Fraction){
     Fraction frac = (Fraction) obj;
     frac.simplify();
     if(frac.numer==0&&this.numer==0)
       return true;
     else
       return (frac.numer==numer)&&(frac.denom==denom);
   }
   else
     return false;
 }
}

