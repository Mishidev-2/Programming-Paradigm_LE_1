import java.util.*;

public class TestSpace{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
/*
GameTools.pressToContinue(scanner);
System.out.println();
*/

/* 

You awaken in the endless void. Again
It’s a formless nothing stretching infinitely - Standard issue oblivion. 

Before you, a vast black hole looms...
Its presence is oppressive, but It just hangs there... Waiting.

As usual its hunger knows no bounds, taking in all the light for itself.

Its grand, terrifying, and exhausting to look at.

No light reaches you... It feels as if the light itself has forsaken you, refusing to guide your way
Or maybe it just couldn't be bothered

Much like you. 


*/
GameTools.typeText("You awaken in the endless void.");
GameTools.delay(0.5);
GameTools.typeText(" Again.", 50);
GameTools.delay(0.7);
GameTools.typeText("\nIt's a formless nothing stretching infinitely -");
GameTools.typeText(" Standard issue oblivion.");

GameTools.delay(0.7);

GameTools.typeText("\n\nBefore you,"); 
GameTools.delay(0.3);
GameTools.typeText(" a vast black hole looms...");
GameTools.delay(0.5);
GameTools.typeText("\nIts presence is oppressive,");
GameTools.delay(0.3);
GameTools.typeText(" but It just hangs there...");
GameTools.delay(0.5);
GameTools.typeText(" Waiting.", 70);

GameTools.delay(0.7);

GameTools.typeText("\n\nAs usual its hunger knows no bounds,", 50);
GameTools.delay(0.3);
GameTools.typeText(" taking in all the light for itself.");

GameTools.delay(0.7);

GameTools.typeText("\n\nIts grand,");
GameTools.delay(0.3);
GameTools.typeText(" terrifying,");
GameTools.delay(0.3);
GameTools.typeText(" and exhausting to look at.", 60);

GameTools.delay(0.7);

GameTools.typeText("\n\nNo light reaches you...");
GameTools.delay(0.5);
GameTools.typeText(" It feels as if the light itself has forsaken you,");
GameTools.delay(0.3);
GameTools.typeText(" refusing to guide your way");
GameTools.delay(0.5);

GameTools.typeText("\nOr maybe it just couldn't be bothered.", 70);
GameTools.typeText("\n\nMuch like you.", 70);



   /*Commas: 0.3 s
   Periods: 0.5
   Paragraphs: 0.7*/

   
   }
}