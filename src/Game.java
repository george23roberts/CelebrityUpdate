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
        Celebrity picked = ca.get(randomNum);
        boolean correctGuess = false;
        Scanner guessReader = new Scanner(System.in);
        while (correctGuess == false) {
            

            System.out.println("Guess The Celebrity");

            String guess = guessReader.nextLine();

            System.out.println (guess);
            if (guess.equals(picked.getName())) {
                System.out.println("guessed correctly");

                correctGuess = true;
            }

            else {
                System.out.println("Pick An Attribute! -"
                        + "Age\nHeight\nHairColor\nGender\nRace\nWeight\nOcccupationProffesionJob");

                String attributePicker2 = guessReader.nextLine();
                if (attributePicker2.equals("Age")) {
                    System.out.println("Take A Guess!");
                    String attempt = guessReader.nextLine();
                    if (attempt.equals(picked.getAge())) {
                        System.out.println("Correct");
                    } else {
                        System.out.println("Wrong");
                    }
                }

                if (attributePicker2.equals("Height")) {

                    System.out.println("Take A Guess!");
                    String attempt = guessReader.nextLine();
                    if (attempt.equals(picked.getHeight())) {
                        System.out.println("Correct");
                    } else {
                        System.out.println("Wrong");
                    }
                }

                if (attributePicker2.equals("HairColor")) {
                    System.out.println("Take A Guess!");
                    String attempt = guessReader.nextLine();
                    if (attempt.equals(picked.getHairColor())) {
                        System.out.println("Correct");
                    } else {
                        System.out.println("Wrong");
                    }
                }
                if (attributePicker2.equals("Gender")) {
                    System.out.println("Take A Guess!");
                    String attempt = guessReader.nextLine();
                    if (attempt.equals(picked.getGender())) {
                        System.out.println("Correct");
                    } else {
                        System.out.println("Wrong");
                    }
                }
                if (attributePicker2.equals("Race")) {
                    System.out.println("Take A Guess!");
                    String attempt = guessReader.nextLine();
                    if (attempt.equals(picked.getRace())) {
                        System.out.println("Correct");
                    } else {
                        System.out.println("Wrong");
                    }
                }
                if (attributePicker2.equals("Weight")) {
                    System.out.println("Take A Guess!");
                    String attempt = guessReader.nextLine();
                    if (attempt.equals(picked.getWeight())) {
                        System.out.println("Correct");
                    } else {
                        System.out.println("Wrong");
                    }
                }
                if (attributePicker2.equals("Job")) {
                    System.out.println("Take A Guess!");
                    String attempt = guessReader.nextLine();
                    if (attempt.equals(picked.getJob())) {
                        System.out.println("Correct");
                    } else {
                        System.out.println("Wrong");
                    }

                }
            }

        }
        guessReader.close();
    }


    public static void celeb(List<Celebrity> celebs) {
        Celebrity LeBronJames = new Celebrity("38", "250", "black", "male", "black", "6ft9", "NBA", "LeBron James");
        Celebrity MarkWinchell = new Celebrity("1900", "50", "grey", "male", "white", "4ft11", "Admissions", "Mark Winchell");
        Celebrity JonahHill = new Celebrity("39", "192", "brown", "male", "white", "5ft7", "Actor", "JonahHill");
        celebs.add(0, LeBronJames);
        celebs.add(1, MarkWinchell);
        celebs.add(2, JonahHill);
    }
}
