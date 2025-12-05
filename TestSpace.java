import java.util.*;

public class TestSpace{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      

      //The Gatekeeper’s grin flickers - like light reflected in bile.
      //“Yes… the endless feast.  
		//You understand the craving, then.”  
      
      //It gestures toward the door.

      //"I never promised to hold the cure."

      //Your soul still burns from the wither - it is not gone.

         System.out.println();
         GameTools.delay(1);
         GameTools.typeText("\nChoose...");
         GameTools.delay(0.7);
         GameTools.typeText("\n[1] Ignore the Child");
         GameTools.delay(0.5);
         GameTools.typeText("\n[2] Help The Child");
         GameTools.delay(0.5);
         GameTools.typeText("\nEnter choice (1 or 2): ");
         String choice = scanner.nextLine();
  
      GameTools.pressToContinue(scanner);
   
   
   /*Commas: 0.3 s
   Periods: 0.5
   Paragraphs: 0.7*/

   
   }
}