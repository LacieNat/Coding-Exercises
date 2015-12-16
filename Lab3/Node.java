class Node{
  public int data;
  public Node next;
  
  public Node(int data, Node next){
    this.data = data;
    this.next = next;
  }
}

class List {
  public Node head;
  
  public List(Node head) {
    this.head = head;
  }
  
  public List pivot() {
    Node n;
    if (head == null)
      return new List(null);
    
    int p = head.data;
    Node B = null;
    
    for(n=head; n!=null; n=n.getNext()){
      if(n.data<head.data){
        B.add(data)
        
        
        
        
  
  