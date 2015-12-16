class Yo {
  public static int f(int n){
    if(n<=1)
      return 1;
    else if(n%2==0)
      return n+f(n/2);
    else
      return g(n-1)-n;
  }
  
  public static int g(int n){
    if(n<=1)
      return 1;
    else if(n%2==0)
      return g(n-1) + f(n-1);
    else
      return f(n-3);
  }
  
  public static void main(String[] args){
    System.out.println(f(1000));
  }
}