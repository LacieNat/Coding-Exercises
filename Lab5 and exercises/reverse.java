import java.util.*;

class Reverse{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    
    int size = sc.nextInt();
    int[] arr = new int[size];
    
    for(int i=0; i<size; i++){
      arr[i] = sc.nextInt();
    }

    System.out.print(smallestInt(arr, size-1));

  }
  
  public static int[] reverseArr(int[] arr, int i, int k){
    int temp; 
    if(i==k || k<i)
      return arr;
    else{
      temp = arr[i];
      arr[i] = arr[k];
      arr[k] = temp;
      return reverseArr(arr, i+1, k-1);
    }
  }
  
  public static int smallestInt(int[] arr, int size){
    if(size==0){
      return arr[size];
    }
    else{
      int x = smallestInt(arr, size-1);
      return arr[size]<x?arr[size]:x;
    }
  }
}
      