// CS1020 (AY2012/3 Semester 2)
// Name: 
// Matric. No.: 
// Lab group: 

class Reading {
  
  public int add(int num1, int num2){
    int ans;
    ans=num1+num2;
    return ans;
  }
  
  public int sub(int num1, int num2){
    int ans;
    ans=num1-num2;
    return ans;
  }
  
  public int mul(int num1, int num2){
    int ans=num1*num2;
    return ans;
  }
  
  public void oper(char A, int num1, int num2){
    switch(A){
      case 'A': add(num1, num2);
      case 'S': sub(num1, num2);
      case 'M': mul(num1, num2);
    }
  }
  
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in)
   String input; int num; String operation; int num1; int num2;
   input = next();
   switch(input.charAt(0)){
     case'L': num = sc.nextInt();
              for(int i=0; i<num; i++){
                operation = sc.next();
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                oper(operation.charAt(0), num1, num2);
              } break;
     case 'S': do{
                 operation = sc.next();
                 num1 = sc.nextInt();
                 num2 = sc.nextInt();
                 oper(operation.charAt(0), num1, num2);
               }while(operation.charAt(0)!='-'); break;
     case 'E': while (1){
                 operation = sc.next();
                 num1 = sc.nextInt();
                 num2 = sc.nextInt();
                 oper(operation.charAt(0), num1, num2);
               }
                 
   
 }

}

