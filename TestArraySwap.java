class TestArraySwap {
  public static void swap(int[] A, int i, int j) {
    int temp = A[i];
    A[i] = A[j];
    A[j] = temp;
  }
  
  public static void main(String[] args) {
    int[] arrayRef = {100, 62, 88};
    
    swap(arrayRef, 0, 2);
    
    for(int element: arrayRef){
      System.out.println(element);
    }
  }
}