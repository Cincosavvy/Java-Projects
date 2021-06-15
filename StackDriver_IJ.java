//Iman Jones CSC 251 11:00-12:15
//Driver file: must call every () from class

import java.io.*;
import java.util.Scanner;

public class StackDriver_IJ{ 
   public static void main(String[] args){
      Scanner kb = new Scanner(System.in);
      StackClass_IJ stackIJ = new StackClass_IJ(); //Create stack object

    //store methods inside the driver
      stackIJ.storeStack();
      stackIJ.printStackOrder();
      stackIJ.printStackReverse();     
      stackIJ.searchStack(0);
      stackIJ.largest(0);
      stackIJ.smallest(0);
      stackIJ.quirky();
      stackIJ.avgDivSix(0);
      stackIJ.calcSumOverFive(0);
      stackIJ.deleteLargest();
      stackIJ.deleteChoice();
    
      
      
      
      
      
      
      
      
      
      
      
      
      }
  }
