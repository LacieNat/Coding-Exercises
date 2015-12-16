import java.util.*;
class iterator{
  public static void main(String[] args){
    ArrayList<Integer> listArray = new ArrayList<Integer>();
    listArray.add(1);
    listArray.add(2);
    listArray.add(3);

    for(int element: listArray){
      System.out.println(element);
  }
}
}