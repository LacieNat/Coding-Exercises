class Overload {
  public static void f(int a, double b){
    System.out.println(a+b);
  }
  public static void f(double a, int b){
    System.out.println(a-b);
  }
  public static void main(String[] args){
    f(3,6);
  }
}