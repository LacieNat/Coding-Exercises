import java.util.*;
class Inversions{
  public static int countInversions(ArrayList<Integer> intArray){
    int count = 0;
    for(int i=0; i<intArray.size()-1; i++){
      for(int j=i+1; j<intArray.size(); j++){
        if(intArray.get(i)>intArray.get(j)){
          count++;
        }
      }
    }
    return count;
  }
  public static ArrayList<Integer> createInversions(ArrayList<Integer> intArray, int numInversions){
    Collections.sort(intArray);
    int end = intArray.size()-1;
    int start = intArray.size()-1-numInversions;
    intArray.add(start, intArray.get(end));
    intArray.remove(end+1);
    return intArray;
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    ArrayList<Integer> array = new ArrayList<Integer>();
    int size = sc.nextInt();
    for(int i=0; i<size; i++){
      array.add(sc.nextInt());
    }
    
    System.out.println(countInversions(array));
    array = createInversions(array, countInversions(array));
    for(int element: array){
      System.out.print(element+" ");
    }
  }
}
      
          
    