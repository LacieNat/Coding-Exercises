import java.util.ArrayList;
import java.util.Scanner;

class TestArrayList {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    System.out.println("Enter a list of integers, press ctrl-d to end");
    while(sc.hasNext()){
      list.add(sc.nextInt());
    }
    
    System.out.println(list);
    
    list.add(list.remove(0));
    
    System.out.println(list);
  }
}