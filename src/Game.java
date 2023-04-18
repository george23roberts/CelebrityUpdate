import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;


public class Game {
   
   public static void main(String[] args) {
      
   

   List<Celebrity> ca;
   ca = new ArrayList<Celebrity>();
   //name(ca);
   Random g = new Random();
   int randomNum = g.nextInt(ca.size());
   Celebrity picked = ca.get (randomNum);   
   boolean correctguess = false;
   while(correctguess = false) {
      Scanner guessReader = new Scanner(System.in);
      System.out.println("Choose What to go for");
      
   }
   
   public void name(ArrayList p ) {
    p.add(p); Celebrity LeBronJames = new Celebrity(38, "6ft9", "black", "male", "black", 250, "NBA"); 
    p.add(p); Celebrity MarkWinchell = new Celebrity(1900, "4ft11", "grey", "male", "white", 50, "Admissions");
    p.add(p); Celebrity JonahHill = new Celebrity(39, "5ft7", "brown", "male", "white", 192, "Actor");
   }
    
        
    
}
}









        