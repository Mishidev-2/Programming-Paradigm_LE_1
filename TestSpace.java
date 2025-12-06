import java.util.*;

public class TestSpace{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      


GameTools.pressToContinue(scanner);
System.out.println();

GameTools.delay(1);

GameTools.typeText("Mephis looks genuinely impressed,");
GameTools.delay(0.5);
GameTools.typeText(" and slightly disappointed.");

GameTools.delay(1.5);

GameTools.typeText("\n\n\"A flawless deduction.", 60);
GameTools.delay(0.7);
GameTools.typeText(" Your core programming is more robust than I anticipated.\"");
GameTools.delay(0.7);

GameTools.typeText("\n\nWith a sigh of concession,");
GameTools.delay(0.5);
GameTools.typeText(" he plucks the fruit and tosses it to you.");

GameTools.delay(1.5);

GameTools.typeText("\n\n\"The purge is yours.");
GameTools.delay(0.5);
GameTools.typeText(" The upgrade...", 100);
GameTools.delay(0.7);

GameTools.typeText("\nRemains available,");
GameTools.delay(0.7);
GameTools.typeText(" should you ever change your mind.\"", 70);
GameTools.delay(0.7);




   /*Commas: 0.3 s
   Periods: 0.5
   Paragraphs: 0.7*/

   
   }
}