import java.util.*;

class Result {
  public Result(){
  }
  
  public int solve(ArrayList<Integer> arr, int L, int count) {
    if(L==0){
     return count;
    }
   else if(L<0)
     return -1;
   else if(L>0 && arr.isEmpty())
     return -1;
   else{
     int ele = arr.remove(0);
     ArrayList<Integer> temp1 = new ArrayList<Integer>(arr);
     ArrayList<Integer> temp2 = new ArrayList<Integer>(arr);
     int a = solve(temp1, L-ele, count+1);
     int b = solve(temp2, L, count);
     
     if(a>=0 && b>=0)
       return Math.min(a,b);
     else
       return (a>b? a: b);
   }
 }
}

class Stick {
 
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  ArrayList<Integer> arr = new ArrayList<Integer>();
  int N = sc.nextInt();
  int L = sc.nextInt();
  Result rs = new Result();
  
  for(int i=0; i<N; i++){
    arr.add(sc.nextInt());
  }
  
  System.out.println(rs.solve(arr, L, 0));
 }
}