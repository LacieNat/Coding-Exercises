// MissingDigits.java
// To find digits that do not appear in user's input number.
import java.util.*;

class MissingDigits {

 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a number: ");
   int num = sc.nextInt();
   int[] arr = {0,1,2,3,4,5,6,7,8,9};
   
   while(num>0){
     int a=num%10;
     for(int i=0; i<10; i++){
       if(a==arr[i]){
         arr[i]=-1;
       }
     }
     num/=10;
   }
   for(int j=0; j<10; j++){
     if(arr[j]!=-1)
       System.out.print(arr[j]+ "_");
   }
   System.out.println();
 }
}

