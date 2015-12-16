/*  
 * CS1020 (AY2012/3 Sem2)  
 * Lab #2 Ex1  
 * Author    :  Fan Yuxin
 * Matric no.:  A0103494J
 * Description of program:  Program creates object ruler with existing markings and insert 
 *                          new markings to minimize the largest difference between segments
 */

import java.util.*;

class Ruler {
 
 //Data Attributes
 int[] pos;      // Existing sorted markings position 
 int numSegs;    // Number of segments
 int[] contains; // How many new markings within a segment
 
 //Constructor
 public Ruler(int[] pos, int noOfMarkings) {
   this.pos = new int[noOfMarkings];
   this.pos = pos;
   numSegs = noOfMarkings-1;
   contains = new int[numSegs];
 }

 //Add one new additional marking to current segment
 //Precond: finds the largest segment and increase the contains array for the segment with the largest difference
 //Postcond: increase the number of new markings to the largest segment so as to minimize the largest difference 
 public void unmarked() {
   
   int[] diff = new int[numSegs]; //array to store the difference between the respective segments
   int max = 0;
   int maxPos = 0;
    
   for(int j=0; j<numSegs; j++){
     diff[j] = arrayDiff(pos, j);
     if(diff[j]>max){
       max = diff[j];
       maxPos = j; 
     }
   }
   contains[maxPos]++;   
 }
 
 //Finds the difference between two elements of array
 public int arrayDiff(int[] arr, int posPlace){
      return (int)(Math.ceil((double)(arr[posPlace+1] - arr[posPlace])/(contains[posPlace]+1)));
  }
}

// The client (driver) class
class MarkRuler {
 public static void main(String[] args) {
  
   Scanner sc = new Scanner(System.in); //Scanner variable
   
   int length = sc.nextInt();
   int noOfMarkings = sc.nextInt();
   int[] positions = new int[noOfMarkings+2];
   positions[0] = 0; //instantiate the first element of array to the 0 mark of the ruler
   int diff;
   
   for(int i=1; i<noOfMarkings+1; i++){
     positions[i] = sc.nextInt();
   }
   
   positions[noOfMarkings+1] = length; //instantiate the last element of array to the end of the ruler
  
   Arrays.sort(positions); //To sort the array before passing in the values
   Ruler rl = new Ruler(positions, noOfMarkings+2); //Make a new Ruler and pass in the sorted positions
   
   int noNewMarkings = sc.nextInt();
   
   for(int j=0; j<noNewMarkings; j++){
     rl.unmarked();
   }
   
   int max = 0;
   //To find the largest difference
   for(int k=0; k<noOfMarkings-1; k++){
     diff = rl.arrayDiff(rl.pos, k);
     max = diff>max?diff:max;
   }
   
   System.out.println(max);
     
 }
}

