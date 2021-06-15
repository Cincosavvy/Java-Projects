//imports
import java.util.Scanner;

 //declare node class
public class CrocktonMLL
{
 //declare int data, node link (next)
   private int data;
   private CrocktonMLL link;
   private CrocktonMLL tail;
   private CrocktonMLL head = null;
   private CrocktonMLL tptr;

  //Create no-args constructor
   public CrocktonMLL() 
   {
   //defines an empty linked list
      head = null;
      tail = null;
   }  
    
  //Create a constructor that has two input args
   public CrocktonMLL(int d, CrocktonMLL l) 
   {
   
    //put value into data 
    //put intitialLink into link
      data = d;
      link = l;   
   }
   
 //Add to empty list
 public void Q_AddToEmptyMC(int ele)
 {
   if(head == null)
    {
     head = new CrocktonMLL(ele, null);
    }
  }
  
 //Add to rear
 public void Q_AddToRearMC(int ele)
 {
   tptr = head;
    if(head == null)
     {
      head = new CrocktonMLL(ele, null);
     } else {
      tptr = tptr.link;
     }
     tptr.link = new CrocktonMLL(ele, null);
   }
		    
 //Print method
 public void Q_PrintMC()
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
 

 public boolean Q_RemoveFrontMC(int ele)
  {
   boolean f = false;
   if(head == null)
   System.out.println("List is empty");
   else {
      head = head.link;
   }
   return f;
 }
 
//Search
public boolean Q_searchMC(int ele)
 {
  boolean found = false;
  if(head == null)
   { 
    System.out.println("List is empty");  
   } else {
    while(head != null)
     {
       if(head.data == ele)
        {
         System.out.println("Element Found");
         found = true;
        }
         if(tptr == null)
          tptr = new CrocktonMLL(head.data, tptr);
          head = head.link;
        }
          while(tptr != null)
           {
             Q_AddToEmptyMC(tptr.data);
             tptr = tptr.link;
           }
        }
          return found;
    }
 
 public boolean Q_findRemoveMC(int ele)
 {
  boolean found = false;
  if(head == null)
   { 
    System.out.println("List is empty");  
   } else {
    while(head != null)
     {
       if(head.data == ele)
        {
         System.out.println("Element Found");
         found = true;
        }
         if(tptr == null)
          tptr = new CrocktonMLL(head.data, tptr);
          head = head.link;
        }
          while(tptr != null)
           {
             Q_AddToEmptyMC(tptr.data);
             tptr = tptr.link;
             //remove
             head = head.link;
           }
        }
          return found;
    }
 
 //is empty
 public boolean Q_isEmptyMC()
  {
    boolean found = false;
    if(head == null)
    {
     System.out.println("List is empty");
    }
   return found;
  }
  
 //Print odd
 public void Q_printOddMC() 
  {
   while(head != null) 
         { 
           System.out.println(head.data); 
            if(tptr == null)
               tptr = new CrocktonMLL(head.data, null);
            else
            tptr = new CrocktonMLL(head.data, tptr);
            head = head.link;  
         } 
         while(tptr !=null) 
         { 
            Q_AddToEmptyMC(tptr.data); 
            tptr = tptr.link;         
         }
      }

   
   
//  
 }