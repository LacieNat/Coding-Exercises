class TestArray {
  public static void main(String[] args) {
    int[] arrayRef;
    arrayRef = new int[3];
    
    System.out.println(arrayRef.length);
    
    arrayRef[0] = 100;
    arrayRef[1] = arrayRef[0]-38;
    arrayRef[2] = 88;
  }
}