//Array HW 1
import java.util.Scanner;
import java.io.*;

   //class 
   public class ArrayHW_Crockton
      {
         //size
         private final int size = 10;
         //Create Array
         private final int myArray[] = new int [10];
         //Count
         private int count = 0;
         Scanner kb = new Scanner(System.in);
         
      
   //Store Method (less than 30 & odd)
   public void storeThirtyOdd(int store)
      {
         for(int i=0; i < count; i++) {
         System.out.println("Store values for element: " + i);
         if(myArray[i] >= 1 && myArray[i] <= 30) {
         myArray[i] = store;
         count++;
      }
   }
    
    
    
    
    
    
    //End file
    }
 }           