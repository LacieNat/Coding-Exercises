class TestWrapper {
  
  public static void main(String[] args) {
    Integer intRefA, intRefB;
    int intPrimitive;
    
    intRefA = new Integer(4);
    intRefB = 4;
    
    if(intRefA == intRefB){
      System.out.println("Both refer to the same object");
    }
    
    if(intRefA.equals(intRefB)){
      System.out.println("Both contain the same value");
    }
    
    intPrimitive = intRefA;
    System.out.println("intPrimitive = " + intPrimitive);
    intPrimitive = intRefB;
    System.out.println("intPrimitive = " + intPrimitive);
    }
}