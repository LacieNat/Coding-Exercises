import java.util.*;

public class Problem100{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    int j = sc.nextInt();
    int max = 0;
    for(int k = i; k<=j; k++){
      if(countN(k, 0)>max)
        max = countN(k,0);
    }
    
    System.out.print(i + " " + j + " " + max);
        
  }
  
  public static int countN(int n, int count){
    if(n==1) 
      return count+1;
    else if(n%2==1)
      return countN(3*n+1, count+1);
    else
      return countN(n/2, count+1);
  }
}
      