import java.util.*;

public class TestSpace{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      

//[Mission 3 - Scene 4]
//In the center stands a magnificent silver tree adorning a single, crystalline fruit.

//Then, a figure detaches itself from the silver bark of the tree, 
//not emerging, but simply resolving into existence as if he was always part of the scene.

//He is a demon who looks like a weary scholar, his eyes holding a library's worth of quiet amusement.
//He gestures with a slender hand to the magnificent tree.

GameTools.typeText("\nIn the center stands a magnificent silver tree.");
GameTools.delay(0.5);
GameTools.typeText("\nAdorning a single,", 60);
GameTools.typeText(" crystalline fruit.", 60);
GameTools.delay(0.7);
GameTools.typeText("\n\nThen,");
GameTools.delay(0.3);
GameTools.typeText(" a figure detaches itself from the silver bark of the tree, ");
GameTools.delay(0.5);
GameTools.typeText("\nnot emerging,");
GameTools.delay(0.3);
GameTools.typeText(" but simply resolving into existence as if he was always part of the scene.");
GameTools.delay(0.7);
GameTools.typeText("\n\nHe is a demon who looks like a weary scholar,");
GameTools.delay(0.3);
GameTools.typeText(" his eyes holding a library's worth of quiet amusement.");
GameTools.delay(0.7);
GameTools.typeText("\nHe gestures with a slender hand to the magnificent tree.");
GameTools.delay(0.7);

//Scene 


GameTools.pressToContinue(scanner);
System.out.println();
   /*Commas: 0.3 s
   Periods: 0.5
   Paragraphs: 0.7*/

   
   }
}