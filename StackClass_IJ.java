//Iman Jones CSC 251 11:00-12:15
//Stack class program prt 1/2

import java.util.Scanner;

public class StackClass_IJ{
   //define variables
   private int RANGE = 12; //size of stack array
   private int[] stackArr = new int[RANGE];
   private int[] tempArr = new int [RANGE];
   private int stackTop = 0; //tracks what element stackTop is at, same as count in an regular array
   private int tempTop = 0; // tracks what element tempTop is at, same as count in an regular array
   //create 3rd temp array and top
   private int thirdtempArr[] = new int[RANGE]; 
   private int thirdtempTop = 0;
   int count = 0;
   
   Scanner kb = new Scanner(System.in);
   
   //storeStack()
   public void storeStack(){
      System.out.println("Print the original stack: ");
      for(int i = 0; i < 8; i++){
          stackArr[i] = i; //store i into your stack array   
          stackTop++; // increment the top of stackTop
          System.out.println(stackArr[i]);
        }
   }
   
   //printStackOrder
   public void printStackOrder(){
      System.out.println("Print array in order: "); 
      while(stackTop != 0){ //stackTop has intergers in it, so it is set to != 0         
            System.out.println(stackArr[stackTop]); //print values  
            tempArr[tempTop] = stackArr[stackTop]; //put printed values into temp 
            tempTop++; //increment tempTop to add values to tempArr
            stackTop--; //decrement stackTop to remove values out of stackArr 
            
            
          }
          
          while((tempTop - 1) != 0){
            tempTop--;
            stackTop++;
            stackArr[stackTop] =  tempArr[tempTop]; //store tempArr values back into stackArr to not lose data
          }
      }
   
   //PrintStackReverse()
   public void printStackReverse(){
      System.out.println("Reverse print this array: ");
         while(stackTop != -1){ 
            tempArr[tempTop] = stackArr[stackTop];
            tempTop++; //increment tempTop
            stackTop--;    
         }
         while((tempTop - 1) != 0){        
            tempTop--; //decrement tempTop
            stackTop++; //increment stackTop 
            stackArr[stackTop] = tempArr[tempTop];
            System.out.println(stackArr[stackTop]);
                                    
         }
   } 
   //searchStack(int search)
   public boolean searchStack(int search) {
   		System.out.print("Please enter element to search for: ");
   		search = kb.nextInt();
   		for (int i = 0; i < 8; i++) {
   			if (stackArr[i] == search)// if element i equals the users input then return true
            {
               System.out.print("Element found :)");
               System.out.println("\n");
   				return true;
            }
   		}
         System.out.print("Element not found :( "); // else return false
         System.out.println("\n");
   		return false;
   	}      
//largest()
//Find return largest number
public int largest(int large){
      for(int i = 0; i < 5; i++){
         if(i > 0 && stackArr[i-1] > large){
         large = stackArr[i];     
       }   
   }  System.out.println("\nLargest number: " + large);
      return large;
} 
//Smallest()
public int smallest(int small){
      for(int i = 0; i < stackArr[i]; i++){
         if(i > 0 && stackArr[i] < stackArr[i-1]){
         small = stackArr[i];     
      }   
   }
      System.out.println("Smallest number: " + small);
      return small;
} 


//Quirky method!!!
// Move all even numbers to the 3rd stack  
// delete all even numbers from 3rd stack
// In even stack order them from highest(top) to lowest(bottom)
// Print out even stack and orginial stack
public void quirky(){
   System.out.println("\nOriginal Stack: ");
       for(int i = stackTop -1; i > RANGE; i--){ 
            if(stackTop != 0){
            System.out.println(stackArr[stackTop]);  
            thirdtempArr[thirdtempTop] = stackArr[stackTop];
            thirdtempTop++; 
            stackTop--;  
            }
          }//end for loop
               for(int i = thirdtempTop -1; i > RANGE; i--){
                  if((thirdtempTop - 1) != 0 || stackArr[i] % 2 == 0){
                     stackTop++;
                     stackArr[stackTop] =  tempArr[tempTop];
                     System.out.println(tempTop);
                     
                     }               
                  }
  }//end quirky method
  

//avgDivSi

public double avgDivSix(double avg){
   int sum = 0;
   for(int i = 0; i < 8; i++){
      sum += stackArr[i]%6;
   }
      avg = sum/2;
      System.out.println("\nAverage: " + avg);
      return avg;
}

//calcSumOverFive
public int calcSumOverFive(int sum){
   sum = 0;
   for(int i = 0; i < 8; i++){
      if(stackArr[i] > 5)
         sum += stackArr[i];
   }
     System.out.println("Sum: " + sum);
     return sum;
}


// //deleteLargest
public void deleteLargest(){
   int maxNum = stackArr[0]; // get the first number in array
   for (int i = 0; i < RANGE; i++) {
      if (stackArr[i] > maxNum) {
      maxNum = stackArr[i];
      
    }
  }  
}  

//deleteChoice   
public void deleteChoice(){
   System.out.println("\nEnter a # you want to delete: ");
   int delNum = kb.nextInt();
   //if index equals user input then shift and print
   for(int i = 0; i < 8; i++){
      if(stackArr[i] == delNum){  
      //Shift elements forward
      for(int shift = i; i < 8; i++){
         stackArr[shift] = stackArr[shift + 1];
         shift++;         
   }
   //print deleted element array
   for(i = 0; i < 8; i++){
      System.out.println(stackArr[i]);   
    }   
   }
  }
 } 

  

} //The end.....