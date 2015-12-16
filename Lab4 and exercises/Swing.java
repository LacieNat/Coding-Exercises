/*  
 * CS1020 (AY2012/3 Sem2)  
 * Lab #4 Ex1  
 * Author    : 
 * Matric no.:  
 * Description of program: (fill in the description below)
 *
 */
import java.util.*;

class Result    {

  public Result(){
  }

 /* 
  * solve   : to compute the result, return the result
  *  Pre-condition :
  * Post-condition :
  */
 public int solve(int[] arr) {
  int total = 0; 
  Stack<Integer> s = new Stack<Integer>();
  int x, y;
  int i=1;
  
  x = arr[0];
  y = arr[1];

  s.push(x);
  while(i<=arr.length-1){
    if(y <= x){
      total++;
      s.push(y);
      x = s.peek();
      y = arr[i+1];
      i++;
    }
    
    else{
      total++;
      s.pop();
      if(!s.empty())
        x = s.peek();
      else{
        x = y;
        y = arr[i+1];
        s.push(x);
        i++;
      }      
    }  
  }
  return total;
 }
}

class Swing {

 public static void main(String[] args) {

  int noOfTrees;
  Scanner sc = new Scanner(System.in);
  
  noOfTrees = sc.nextInt();
  int[] arr = new int[noOfTrees];
  for(int i=0; i<noOfTrees; i++){
    arr[i] = sc.nextInt();
  }
  
  Result r = new Result();
  System.out.println(r.solve(arr));
 }
}
