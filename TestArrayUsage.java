class TestArrayUsage {
  public static void main(String[] args){
    int[] arrayRef = {100, 62, 88};
    
    for(int element: arrayRef) {
      System.out.println(element);
    }
    
    for(int i =0; i<arrayRef.length; i++){
      System.out.println(arrayRef[i]);
    }
  }
}