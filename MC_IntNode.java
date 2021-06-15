//LinkedList Program - Crockton
public class MC_IntNode
 {
  //Attributes
  private int data;
  private MC_IntNode link;
  private MC_IntNode head;
  private MC_IntNode tail;
  private MC_IntNode tptr;
  private MC_IntNode prev;
  
  //Creates an empty list
  public MC_IntNode()
   {
    head = null;
   }
   
  public MC_IntNode(int D, MC_IntNode L)
   {
    data = D;
    link = L;
   }
   
 //add first node to empty list
 public void addNodeToEmpty(int data)
  {
    if(head == null)
     {
       head = new MC_IntNode(data, head);
     }
  }
  
  //add 2nd node in front of list
  public void addSecond(int data)
   {
     tptr = head;
      if(head == null)
       {
        head = new MC_IntNode(data, null);
     } else {
       head = new MC_IntNode(data, head);
    }
  }
  
  //Add to the end of list
  public void addEnd(int data)
   { 
     if(head == null)
      {
        head = new MC_IntNode(data, null);
      } else {
       tptr = tptr.link;
       tail = new MC_IntNode(data, tail);
     }
   }
   
  //Add to the middle of list
  public void addMiddle(int data)
  {
    if(head == tail.link)
     {
      head = new MC_IntNode(data, null);
     } else {
       tptr = tptr.link;
       tail = new MC_IntNode(data, tail);
      }
   }
   
  //remove from front of list
  public void removeFront()
    {
      if(head == null)
      System.out.println("List is Empty");
       else {
        	  head = head.link;
       	  tail.link = head;
     }
  }
  
  //remove node from last
  /*
  public void removeLast()
    {
    
      tptr = head;
      if(head == null)
      System.out.println("List is Empty");
        else {
             while(tptr.link != tail)
               {
                tptr = tptr.link;
               }
                tail = tptr;
                tail.link = head;
   }
 }
 */

 //remove from middle
 //cant do it
   


 //Print method
 public void printList()
 {
  tptr = head;
  if(tptr == null)
   {
    System.out.println("List is empty");
   } else {
   while(tptr.link != null)
    {
     System.out.println(tptr.data);
     tptr = tptr.link;
    }
  }
  System.out.println(tptr.data);
  System.out.println("  ");
}
 
 
}

  
  