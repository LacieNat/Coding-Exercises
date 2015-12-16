/*
 * CS1020 (AY2012/3 Sem2)
 * Lab #1 Ex3
 * Author    : Fan Yuxin Lacie
 * Matric no.: A0103494J
 * Description of program: Given a square matrix,
 * the program output the final state of the matrix after
 * performing the rotate, reflect x or reflect y operations
 */
import java.util.*;

class Matrix {

 // Data attributes
 int size;
 int matrix[][];

 // Constructors
 // Default constructor creates a 1x1 matrix
 public Matrix() {
  this(1);
 }

 public Matrix(int size) {
  this.size = size;
  this.matrix = new int[size][size];
 }
 
 //Rotates the matrix by 90 degrees
 private void rotate90(){
   int newMatrix[][] = new int[size][size];
   for(int i=0; i<size; i++){
     for(int j=0; j<size; j++){
       newMatrix[i][j] = matrix[size-1-j][i];
     }
   }
   this.matrix = newMatrix;
 }
       
 // Rotates the matrix according to the degree specified
 private void rotate(int degree) {
   for(int i=0; i<degree/90; i++)
     rotate90();
 }

 //Swap the positions of the matrix
 private void swap(int row1, int col1, int row2, int col2) {
    int temp;
    temp = matrix[row1][col1];
    matrix[row1][col1] = matrix[row2][col2];
    matrix[row2][col2] = temp;
 }
    
 // Reflects the matrix about the x axis.
 private void reflectX() {
   for (int row = 0; row < size / 2; row++) {
     for (int col = 0; col < size; col++) {
       swap(row, col, size - 1 - row, col);
     }
   }
 }
    
 // Reflects the matrix about the y axis.
 private void reflectY() {
   for (int col = 0; col < size / 2; col++) {
     for (int row = 0; row < size; row++) {
       swap(row, col, row, size - 1 - col);
     }
   }
 }
 
 // To determine which operation to perform  based on the operation and type parameters
 public void operate(String operation, String type) {
   if(operation.equals("Rotate"))
     rotate(Integer.parseInt(type));
   else if(operation.equals("Reflect")){
     if(type.equals("x"))
          reflectX();
     else if(type.equals("y"))
          reflectY();
   }
 }

 // String representation of matric
 public String toString() {
  String output = "";

  for (int i = 0; i < size; i++) {
   for (int j = 0; j < size; j++) {
    if (j > 0)
     output += " ";
    output += matrix[i][j];
   }
   output += "\n";
  }
  return output;
 }
}

class Transform {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  int size = sc.nextInt();

  Matrix result = new Matrix(size);
  for(int i=0; i<size; i++){
    for(int j=0; j<size; j++){
      result.matrix[i][j] = sc.nextInt();
    }
  }
  
  int noOfOp = sc.nextInt();
  for(int k=0; k<noOfOp; k++)
    result.operate(sc.next(), sc.next());


  System.out.print(result);
 }
}

