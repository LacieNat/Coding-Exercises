import java.util.*;

class Set {

 private ArrayList<Integer> members;

 // Constructors
 public Set(ArrayList<Integer> members){
   this.members = new ArrayList<Integer>();
   this.members.addALL(members);
 }


 // toString() method
 public String toString() {
   return members.toString();
 }

 // Return true if 'this' is a subset of 'set', 
 // otherwise return false.
 public boolean isSubset(Set set) {
   

  return true; // this is a stub
 }
}

// This program reads two sets of integers A and B, and determines
// if A is a subset of B, and if A is same as B.
class TestSet {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  ArrayList<Integer> list;

  System.out.print("Enter number of elements in set A: ");

  System.out.print("Enter number of elements in set B: ");

  if (setA.isSubset(setB)) {
   System.out.println("Set A is a subset of set B.");
  }
  else {
   System.out.println("Set A is not a subset of set B.");
  }
 }

} 

