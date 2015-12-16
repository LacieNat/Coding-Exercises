public interface Complex {
  public double realpart();  // returns this.real
  public double imagpart();  // returns this.imag
  public double angle();     // returns this.ang
  public double mag();       // returns this.mag
  public void add(Complex c);   // this = this + c
  public void minus(Complex c); // this = this - c
  public void times(Complex c); // this = this * c
} 

class ComplexCart implements Complex {
 private double real;
 private double imag;

 // CONSTRUCTOR
 public ComplexCart(double r, double i) { real = r; imag = i; }

 // ACCESSORS
 public double realpart() { return this.real; } 
 public double imagpart() { return this.imag; } 
 public double mag() { return Math.sqrt(real*real + imag*imag); } 
 public double angle() {
  if (real != 0) {
   if (real < 0) return (Math.PI + Math.atan(imag/real));
   else return Math.atan(imag/real);
  }
  else if (imag == 0) return 0;
  else if (imag > 0) return Math.PI/2;
   else return Math.PI/2;
  } 
  // MUTATORS
  public void add(Complex c) {
    this.real += c.realpart();
    this.imag += c.imagpart();
  }
  public void minus(Complex c) {
    this.real -= c.realpart();
    this.imag -= c.imagpart();
  }
  public void times(Complex c) {

    imag = real * c.imagpart() + imag * c.realpart();

  }  
 public String toString() {
    if (imag == 0) return (real);
    else if (imag < 0) return (real + "" + imag + "i");
    else return (real + "+" + imag + "i");
  }  
}

class TestComplex{
  public static void main(String[] args){
    ComplexCart plex = new ComplexCart(3, 0);
    System.out.println(plex.toString());
  }
}
