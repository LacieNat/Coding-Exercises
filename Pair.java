class Pair <S,T> {
  
  private S _first;
  private T _second;
  
  public Pair(S a, T b){
    _first = a;
    _second = b;
  }
  
  public S getFirst() { return _first; }
  public T getSecond() { return _second; }
}

class TestMoreGenericPair {
  
  public static void main(String[] args) {
    
    Pair<String, Integer> someone = new Pair<String,Integer>("James Gosling", 55);
    
    System.out.println("Name: " + someone.getFirst());
    System.out.println("Age: " + someone.getSecond());
  }
}