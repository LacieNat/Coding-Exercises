import java.util.*;

public class NEpaths {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  System.out.print("Enter rows apart: ");
  int rows = sc.nextInt();
  System.out.print("Enter columns apart: ");
  int cols = sc.nextInt();

  String path = "";
  System.out.println("Number of paths = " + ne(rows, cols, path));
 }

 // To compute the number of NE paths as well as to display the paths
 public static int ne(int r, int c, String path) {
   int total = 0;
   if(r==0 && c==0){
    System.out.println(path);
    return 1;
   }
   else{
     if(r>0){
       total += ne(r-1, c, path + "N ");
     }
     if(c>0){
       total += ne(r, c-1, path + "E ");
     }
     return total;
   }
 }
}

