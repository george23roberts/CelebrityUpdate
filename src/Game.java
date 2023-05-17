import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;


public class Game {
   
   public static void main(String[] args) {
      
   

   List<Celebrity> ca;
   ca = new ArrayList<Celebrity>();
   celeb(ca);
   Random g = new Random();
   int randomNum = g.nextInt(ca.size());
   Celebrity picked = ca.get (randomNum);   
   boolean correctGuess = false;
   while(correctGuess = false) {
      Scanner guessReader = new Scanner(System.in);
      System.out.println("Guess The Celebrity");

      String guess = guessReader.nextLine();



         if(guess.equals(picked.getName())) {
               correctGuess = true;
         }

         else {
            Scanner attributePicker = new Scanner(System.in);

            System.out.print("Pick An Attribute! -" + "Age\nHeight\nHairColor\nGender\nRace\nWeight\nOcccupationProffesionJob");

            
         }
      
         

         
         

         
         int attributePicker2 = attributePicker.nextInt();
         if (attributePicker2 == "Age") {
         System.out.println("Take A Guess!");
         String attempt = guessReader.nextLine();
         if (attempt.equals(chosen.getAge())) {
             System.out.println("Correct");
         }
         else{
                 System.out.println("Wrong");
             }
         }
         
         if (attributePicker2 == "Height") {

            System.out.println("Take A Guess!");
         String attempt = s1.nextLine();
         if (attempt.equals(chosen.getHeight())) {
             System.out.println("Correct");
         }
         else{
                 System.out.println("Wrong");
             }
         }

         if (attributePicker2 == "HairColor")
         System.out.println("Take A Guess!");
         String attempt = s1.nextLine();
             if (attempt.equals(chosen.getHairColor())) {
                 System.out.println("Correct");
             }
             else{
                 System.out.println("Wrong");
             }
         }
         if (attributePicker2 == "Gender") {
         System.out.println("Take A Guess!");
         int attempt = s1.nextInt();
             if (attempt.equals(chosen.getGender())) {
                 System.out.println("Correct");
             }
             else{
                 System.out.println("Wrong");
             }
         }
         if (attributePicker2 == "Race") {
            System.out.println("Take A Guess!");
            int attempt = s1.nextInt();
                if (attempt.equals(chosen.getRace())) {
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Wrong");
                }
         }
         if (attributePicker2 == "Weight") {
            System.out.println("Take A Guess!");
            int attempt = s1.nextInt();
                  if (attempt.equals(chosen.getWeight())) {
                       System.out.println("Correct");
                   }
                  else{
                       System.out.println("Wrong");
                   }
         }
         if (attributePicker2 == "OcccupationProffesionJob") {
            System.out.println("Take A Guess!");
            int attempt = s1.nextInt();
                  if (attempt.equals(chosen.getJon())) {
                       System.out.println("Correct");
                   }
                  else{
                       System.out.println("Wrong");
                   }
         }
   }  }                         
   }
   
   public static void celeb(List<Celebrity> celebs) {
   Celebrity LeBronJames = new Celebrity(38, "6ft9", "black", "male", "black", 250, "NBA"); 
   Celebrity MarkWinchell = new Celebrity(1900, "4ft11", "grey", "male", "white", 50, "Admissions");
   Celebrity JonahHill = new Celebrity(39, "5ft7", "brown", "male", "white", 192, "Actor");
   celebs.add(0, LeBronJames);
   celebs.add(1, MarkWinchell);
   celebs.add(2, JonahHill);
   }
}
    
        
    





        