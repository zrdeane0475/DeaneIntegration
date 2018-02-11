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
      if (Integer.valueOf(theirGuess) == 30) { //I chose 30 because its my b-day
    	  System.out.println("Here's the Hint.");
    	  double i = realNumber/2.0;
    	  int j = realNumber*realNumber;
    	  int k = realNumber%2;
    	  System.out.println("The number divided by 2 is " +i);
    	  System.out.println("The number squared is " +j);
    	  if (k == 0) {
    		  System.out.println("The number is even");
    	  }
    	  else {
    		  System.out.println("The number is odd");
    	  }
      }
      
      else if (Integer.valueOf(theirGuess) < realNumber && Integer.valueOf(theirGuess) > 0) {
        //If the value they entered is too low then 
        System.out.println("Too low. Sorry.");
        System.out.println("Need help? Type: 30 for a hint.");
      }

      else if (Integer.valueOf(theirGuess) > realNumber && Integer.valueOf(theirGuess) < 10) {
        System.out.println("Too high.");
        System.out.println("Need help? Type: 30 for a hint.");
      }

      else {
        System.out.println("Good guess!");
      }
      }
    }
  }
 
