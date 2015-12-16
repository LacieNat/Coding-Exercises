import java.util.*;

class Block {
  private int noOfBlock;
  private ArrayList<Stack<Integer>> list;
  
  public Block() {
  }
  
  public Block(int noOfBlock) {
    this.noOfBlock = noOfBlock;
    list = new ArrayList<Stack<Integer>>();
    
    for(int i=0; i<noOfBlock; i++){
      Stack<Integer> st = new Stack<Integer>();
      st.push(i);
      list.add(st);
    }
  }
  
  public int searchBlock(int item){
    for(Stack<Integer> element: list){
      if(element.search(item)!=-1)
        return element.search(item);
    }
    return 0;  
  }
    
  }
  public void moveOnto(int first, int second){
    
  }
  
  public void moveOver(int first, int second){
  }
  
  public void pileOver(int first, int second){
  }
  
  public void pileOnto(int first, int second){
  }
}

class TestBlock {
  public static void main (String[] args){
    int blocks;
   
    Scanner sc = new Scanner(System.in);
    
    blocks = sc.nextInt();
  }
}