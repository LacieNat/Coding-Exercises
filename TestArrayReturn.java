class TestArrayReturn {
  public static int[] makeArray(int size, int value) {
    int[] array = new int[size];
    
    for(int i=0; i<array.length; i++)
      array[i] = value-i;
    return array;
  }
  
  public static void main(String[] args) {
    int[] arrayRef;
    arrayRef = makeArray(5, 99);
    
    for(int element: arrayRef){
      System.out.println(element);
    }
  }
}