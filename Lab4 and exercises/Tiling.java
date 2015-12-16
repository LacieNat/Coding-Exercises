import java.util.*;

class Result {
  public Result(){
  }
  
  public int solve(int N) {
    if(N<3)
      return 1;
    else
      return solve(N-1) + solve(N-3);
 }
}

class Tiling {

 public static void main(String[] args) {
   int noOfWays;
   Scanner sc = new Scanner(System.in);
   Result rs = new Result();
   
   noOfWays = sc.nextInt();
   
   System.out.println(rs.solve(noOfWays));

 }
}