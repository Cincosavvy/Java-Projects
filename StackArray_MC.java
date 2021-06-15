//Crockton - Stack Program

import java.util.Scanner;

public class StackArray_MC
   {
      //variables
      private int size = 15;
      private int top = 0;
      private int tempTop = 0;
      private int age = 46;
      //array stacks
      private int[] stackSavvy = new int[size];
      private int[] tempSavvy = new int[size];
      
   Scanner kb = new Scanner(System.in);
   
   //storeStackElements(ints) added 6 elements method
   public void storeStackElements(int sEle)
      {
        //user input
        System.out.println("Enter 6 elements:");
        System.out.println("Stored Stack: ");
        for(int i = 0; i < 6; i++)
          {
            sEle = kb.nextInt();
            stackSavvy[i] = sEle;
            top++;
            System.out.println(stackSavvy[i]);
          }
     }
           
    
   //PrintInOrder(the order that the elemnts were added)
   public void printInOrder()
      {
        System.out.println("\nStack in order: ");
        
     while(top != 0)
      {
         tempSavvy[tempTop] = stackSavvy[top];
         tempTop++;
         top--;
      }
         while((tempTop - 1) !=0)
            { 
               tempTop--;
               top++;
               
               stackSavvy[top] = tempSavvy[tempTop];
               System.out.println(stackSavvy[top]);
            }
      }
      
   //PrintInReverse(in reverse order it was added)
   public void printInReverse()
      {
        System.out.println("\nStack in Reverse: ");
        
     while(top != 0)
      {
          System.out.println(stackSavvy[top]);
         
         tempSavvy[tempTop] = stackSavvy[top];
         tempTop++;
         top--;
      }
         while((tempTop - 1) !=0)
            { 
               tempTop--;
               top++;
               
               stackSavvy[top] = tempSavvy[tempTop];
            }
      }
      

    
    //addToStack(add 1 element into the stack)
    public void addToStack(int element)
     {
      //System.out.println("\nAdded Element to Stack: ");
      System.out.println("\nEnter element to add:");
      element = kb.nextInt();
      
      if(top < size)
       {
        stackSavvy[top] = element;
        top++;
        System.out.println("Element added");
      }
   }
   
   //searchReplaceStack(search stack for some number, if found replace w/ mothers age)
   public boolean searchReplaceStack(int search)
    {
     System.out.print("\nEnter a number to search: ");
     search = kb.nextInt();
     
     for(int i = 0; i < 6; i++)
      {
       if(stackSavvy[i] == search)
        {
         search = age;
         System.out.println("\nElement found & replaced");
         return true;
        }
      }
         System.out.println("Element not found");
         return false;
   }
   
   //searchDeleteAllOccur(search for some #, delete all occurences of #)
   public boolean searchDeleteAllOccur(int s)
    {
     System.out.print("\nEnter a number to delete: ");
     s = kb.nextInt();
     
     for(int i = 0; i < 6; i++)
      {
       if(stackSavvy[i] == s)
        {
         //Start Delete
         for(int j = i; i < 6; i++)
          {
           stackSavvy[j] = stackSavvy[j+1];
           j++;
      }
         //print it
         System.out.println("\nElement found & deleted");
         for(i = 0; i < 6; i++)
          {
            System.out.println(stackSavvy[i]);
            return true;
        }
     }
   }
         System.out.println("Element not found");
         return false;
   }
   
   //productCalulate(calculates the product of all numbers in stack, returns product)
   public int productCalculate(int product)
    { 
      product = 1;
      for(int i = 0; i < 6; i++)
       {
         product *= stackSavvy[i];
     }
       System.out.println("Product of stack is: " + product);
       return product;
   }
   
   //find smallest(return the smallest number - decrement number by 2)
   public int smallest(int s)
   {
     for(int i = 0; i < stackSavvy[i]; i++)
      {
        if(i > 0 && stackSavvy[i] < stackSavvy[i-1])
         {
           s = stackSavvy[i-1];
         }
       }
          System.out.println("The smallest number is: " + s);
          return s;
   }
   
   //Find largest (return largest number in the stack, increment by 5)
   public int largest(int l)
    {
      for(int i = 0; i < 6; i++)
       {
         if( i > 0 && stackSavvy[i-1] > l)
          {
            l = stackSavvy[i+5];
          }
        }
           System.out.println("The largest number is: " + l);
           return l;
     } 
   
   
   //isEmpty method(return boolean - print out result in driver)
   public boolean isEmpty() 
     {
		return (top == -1);
	  }	
     
   //isFull method (returns boolean - prints out result in driver)
   public boolean isFull() 
      {
		return (top == size -1);
	   }

   
   //printMultipleFive(print out all the numbers multiple of five)
   public int printMultipleFive(int five)
    {
      five = 0;
      for(int i = 0; i < 6; i++)
       {
        five += stackSavvy[i]*5;
     }
       System.out.println("Multiples of five in stack: " + five);
       return five;
  }

 }        
     