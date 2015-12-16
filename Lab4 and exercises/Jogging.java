/**
 *
 * author : []
 * matric no: []
 * 
 */
import java.util.*;

class Result {
  private int M, T, U, F, D;
  private int count = 0;
  private int i = 0;
  private int total = 0;
  
  public Result(int M, int T, int U, int F, int D){
    this.M = M;
    this.T = T;
    this.U = U;
    this.F = F;
    this.D = D;
  }

  public int getT(){
    return T;
  }
  
  public int solve(String[] data) {
    try{
    if(total>M){
      return count-1;
    }
    else{
      if(data[i].equals("u")||data[i].equals("d")){
        total += (U+D);
        i++; count++;
        return solve(data);
      }
      else{
        total += (F+F);
        i++; count++;
        return solve(data);
      }
    }
    }
    catch(ArrayIndexOutOfBoundsException expObj){
      return T;
    }
 }
}

class Jogging {

 public static void main(String[] args) {
  
   Scanner sc = new Scanner(System.in);
   
   Result rs = new Result(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
   
   int noOfInputs = rs.getT();
   String[] data = new String[noOfInputs];
   
   for(int i=0; i<noOfInputs; i++){
     data[i] = sc.next();
   }
   
   System.out.println(rs.solve(data));

 }
}