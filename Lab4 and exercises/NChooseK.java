/**
 *
 * author : []
 * matric no: []
 * 
 */

import java.util.*;

class NChooseK {
 
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  int size = sc.nextInt();
  String str = sc.next();
  
  solve("", str, size);
 }
 
 public static void solve(String finalString, String startString, int size){
   if(startString.length()<=1){
     if(finalString.length()+startString.length()==size)
       System.out.println(finalString + startString);
     else if(finalString.length()==size)
       System.out.println(finalString);
   }
   else{
     solve(finalString+startString.charAt(0), startString.substring(1), size);
     solve(finalString, startString.substring(1), size);
   }
 }
}