class Arm{
  
  private noOfBlocks;
  Stack<Integer> s;
  
  public Arm(noOfBlocks){
    this.noOfBlocks = noOfBlocks;
    s = new Stack<Integer>();
    
    for(int i=0; i<noOfBlocks; i++)
      s.push(i);
      
  }
  
  public void moveOnto(){
  }
  
  public void moveOver(){
  }
  
  public void pileOnto(){
  }
  
  public void pileOver(){
  }
}

class TestArm{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int noOfBlocks = sc.nextInt(); //Declaring number of blocks
    String input = sc.next();
    
    while(input!="quit"){
    }
  