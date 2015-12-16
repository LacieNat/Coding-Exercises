import java.util.*;

class BoardWalking {
  
  public static int solve(int W, int L){
    if(W==0 && L==0)
      return 1;
    else if(L!=0 && W==0)
      return 1;
    else if(W!=0 && L==0)
      return 1;
    else
      return solve(W-1,L-1) + solve(W-1,L) + solve(W,L-1);
  }

 public static void main(String argv[]) {
   Scanner sc = new Scanner(System.in);
   int testCases = sc.nextInt();
   
   ArrayList<Integer> output = new ArrayList<Integer>();
   
   for(int i=0; i<testCases; i++){
     output.add(solve(sc.nextInt()-1, sc.nextInt()-1));
   }
   
   for(int element: output)
     System.out.println(element);
 }

}
