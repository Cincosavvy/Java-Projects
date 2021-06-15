//Crockton - Stack Driver

import java.io.*;
import java.util.Scanner;

public class StackArrayDriver_MC
   {
      public static void main(String[] args)
         {
            StackArray_MC myStack = new StackArray_MC();
            
   //Store Method
   myStack.storeStackElements(4);
   
   //Print in order
   myStack.printInOrder();
   
   //Print stack in reverse
   myStack.printInReverse();
   
   //add element to stack
   myStack.addToStack(4);
   
   //search replace stack
   myStack.searchReplaceStack(4);
   
   //Search delete all element occur
   myStack.searchDeleteAllOccur(4);
   
   //Calculates the product of all numbers
   myStack.productCalculate(4);
   
   //Find largest number in stack
   myStack.largest(4);
   
   //Find smallest number in stack
   myStack.smallest(4);
   
   //Determine if stack is empty
   myStack.isEmpty();
   
   //Determine if stack is full
   myStack.isFull();
   
   //Print multiples of five
   myStack.printMultipleFive(4);
   }
 }