interface toInt{
  int toInt();
}

class MyData implements toInt{
  int newint;
  public MyData(){
    newint = this.toInt();
  }
  
  public int toInt(){
    return 5;
  }
}
class TestSwap{
  public static void main(String[] args){
    MyData data = new MyData();
    System.out.println(data);
  }
}