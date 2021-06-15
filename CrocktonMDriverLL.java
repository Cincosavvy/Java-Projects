import java.io.*;

public class CrocktonMDriverLL
  {
    public static void main(String [] args)
         {
    
    CrocktonMLL nodeD = new CrocktonMLL();
    
  
  //add to empty 
  nodeD.Q_AddToEmptyMC(5);
  System.out.println("Empty List: ");
  nodeD.Q_PrintMC();
 
 //Add to empty 
 nodeD.Q_AddToRearMC(2);
 System.out.println("Added element to rear: ");
 nodeD.Q_PrintMC();

  //print method
  System.out.println("Printed list: ");
  nodeD.Q_PrintMC();
  
  //Remove from front
  nodeD.Q_RemoveFrontMC(2);
  System.out.println("Removed element: ");
  nodeD.Q_PrintMC();
  
  //Search 
  nodeD.Q_searchMC(5);
  System.out.println("Search .. ");
  nodeD.Q_PrintMC();
  
  //removeExisting
  nodeD.Q_findRemoveMC(5);
  nodeD.Q_PrintMC();

  //is empty
  nodeD.Q_isEmptyMC();
  
  //print Odd
  nodeD.Q_printOddMC();
    }
}