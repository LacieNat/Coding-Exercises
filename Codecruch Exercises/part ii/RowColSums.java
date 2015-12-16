// RowColSums.java
// To compute the row and column sums of a 2D array.
import java.util.*;

class RowColSums {
  public static int[] computeRowSums(int[][] array){
    int[] sum= new int[array.length];
    for(int i=0; i<array.length; i++){
      for(int j=0; j<array[i].length; j++){
        sum[i]+=array[i][j];
      }
    }
    return sum;
  }
  public static int[] computeColSums(int[][] array){
    int[] sum = new int[array[0].length];
    for(int i=0; i<array[0].length; i++){
      int j=0;
      while(j<array.length){
        sum[i]+=array[j][i];
        j++;
      }
    }
    return sum;
  }
                        
      
    
 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  System.out.print("Enter number of rows and columns: ");
  int rows = sc.nextInt();
  int cols = sc.nextInt();
  
  int[][] array2D = new int[rows][cols];
  
  for(int i=0; i<rows; i++){
    for(int j=0; j<cols; j++){
      array2D[i][j]=sc.nextInt();
    }
  }
  
  int[] rowSums = computeRowSums(array2D);
  System.out.print("Row sums: ");
  System.out.println(Arrays.toString(rowSums));

  int[] colSums = computeColSums(array2D);
  System.out.print("Column sums: ");
  System.out.println(Arrays.toString(colSums));
 }

}
