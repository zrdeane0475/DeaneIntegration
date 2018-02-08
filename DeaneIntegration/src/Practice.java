//Zachary Deane
//This is practice for an integration project

import java.util.Random; //Used to create random number
import java.util.Scanner; //Scanner for input

public class Practice {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); //Initialize scanner
    Random rand = new Random(); //Initialize the random number
    int realNumber = rand.nextInt(10) + 1; //Make the random number an integer
    String theirGuess = "5";
    
    while (Integer.valueOf(theirGuess) != realNumber) {
      System.out.println("Please try to guess a number 1-10"); 
      //Prompts the user to enter number from 1-10 for theirGuess
      theirGuess = scanner.nextLine(); //Takes the next line that is entered

      if (Integer.valueOf(theirGuess) < realNumber) {
        //If the value they entered is too low then 
        System.out.println("Too low. Sorry.");
        System.out.println("Need help? Type: Hint");
      }

      else if (Integer.valueOf(theirGuess) > realNumber) {
        System.out.println("Too high.");
        System.out.println("Need help? Type: Hint");
      }
      
      else {
        System.out.println("Good guess!");
      }
    }
  }

}
