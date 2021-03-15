package pack;
import java.util.Scanner;
/*
 * Example brief:
 * This Example is of an arcade, where you go bankrupt if you lose all your credits.
 * It uses an interface called actions that provides the method called play the the subclasses
 * that "morph" it to what they need. the abstract class Game Info provides the variables that track the odds 
 * of the arcade games and the credits that the user has. the two classes DiceGame and Roulette 
 * override the method play in order to play the separate games.
 */
public class Main extends GameInfo {
	public static void main(String[] args) {
		credits = 100;
    	System.out.print("Welcome to the arcade!\n>");
    	while (true) {

	        Scanner input = new Scanner(System.in);
	        System.out.print("You currently have "+ credits + " credits \n>");
	        
	  		if (credits <= 0) {
    			System.out.print("You are now bankrupt. \n game over.");
    			System.exit(1);
    		}
	  		
	        System.out.print("choose what game to play (1- Dice Game, 2- Roulette)\n>");
	        int number = input.nextInt();
	        System.out.println("You entered " + number + "\n");
	    
	         
	        DiceGame Game1 = new DiceGame();
	        Roulette Game2 = new Roulette();
	        
	        if (number == 1) {
	        	Game1.play();
	        }
	        if (number == 2) {
	        	Game2.play();
	        }
    	}
    }
    
}
