import java.io.*;

 public class MC_IntNodeDriver
  {
    public static void main(String[] args)
     {
      //creates object
      MC_IntNode node = new MC_IntNode();
      
      //empty list method
      node.addNodeToEmpty(4);
      node.printList();
      
      //add 2nd node 
      node.addSecond(4);
      node.printList();
      
      //Add to end
      node.addEnd(4);
      node.printList();
      
      //Add to middle
      node.addMiddle(4);
      node.printList();
      
      //Remove from front
      node.removeFront();
      node.printList();
      
      //Remove from end
      //node.removeLast();
      //node.printList();
      
      //remove from middle
      
  }
}