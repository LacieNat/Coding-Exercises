import java.util.Scanner;
class IntPair {
  
  private int _first, _second;
  
  public IntPair(int a, int b) {
    _first = a;
    _second = b;
  }
  
  public int getFirst() { return _first; }
  public int getSecond() { return _second; }
  
}

class TestPair {
 
  public static void main(String[] args) {
    
    IntPair range = new IntPair(-5, 20);
    Scanner sc = new Scanner(System.in);
    int input;
    
    do{
      System.out.printf("Enter a  number in (%d to %d): ", range.getFirst(), range.getSecond());

      input = sc.nextInt();
    }while( input<range.getFirst() || input>range.getSecond());
  }
}