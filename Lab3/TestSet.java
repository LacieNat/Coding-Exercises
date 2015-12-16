import java.util.*;
class FriendSet implements ISet {
  private String[] names;
  private int counter;
  
  public FriendSet(){
    this.names = new String[100];
    counter = 0;
  }
  
  public FriendSet(FriendSet set){
    this.names = set.getNames();
    counter = set.getCounter();
  }
  

  public String[] getNames(){
    return names;
  }
  
  public int getCounter(){
    return counter;
  }
  
  public boolean add(String name) throws IndexOutOfBoundsException {
    if(names.length > 100){
      IndexOutOfBoundsException expObj = 
        new IndexOutOfBoundsException("Maximum friends exceeded");
      throw expObj;
    }
    
    for(String element: names){
      if(name.equals(element))
        return false;
    }
    
    if((name.trim()).equals(""))
      return false;
    
    names[counter] = name;
    counter++;
    return true;
  }
  
  public ISet intersection(ISet otherSet){
    FriendSet newSet = new FriendSet();
    String[] otherNames = otherSet.getNames();
    for(int i=0; i<otherSet.size(); i++){
      for(int j=0; j<size(); j++){
        if(names[j].equals(otherNames[i]))
          newSet.add(names[j]);
      }
    }
    return newSet;
  }
  
  public int size(){
      return counter;
  }
}

class TestSet{
  public static void main(String[] args){
    FriendSet setA = new FriendSet();
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<4; i++){
      System.out.println(setA.add(sc.next()));
    }
    
    System.out.println("size = " + setA.size());
     
    FriendSet setB = new FriendSet(setA);
    for(int i=0; i<2; i++){
      System.out.println(setB.add(sc.next()));
    }
    FriendSet setC = (FriendSet) setA.intersection(setB);
    String[] setNames = setC.getNames();
    for(int i=0; i<setC.size(); i++)
      System.out.print(setNames[i] + " ");
   System.out.println();
  }
}

class User implements IUserDB{
  public
   


                         
                         
      
    
    
    
    