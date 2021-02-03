package pack;
import java.util.Scanner;
/*
 * Example brief:
 * This example uses 1 superclass and 2 subclasses, Adam and work/TV respectively.
 *  work/TV use Adam's personal details in the examples dialog with the user.
 *  work/TV also polymophes the method in Adam "performTask" to whatever the class wants to do.
 *  they also share the static variable "shouldWork" to perform different outcomes.
 */
public class Main {
	
    public static void main(String[] args) {
    	System.out.print("Hi, I'm Adam, should I go to work or watch TV? \n>");
    	while (true) {
	        Scanner input = new Scanner(System.in);
	    	
	        System.out.print("Choose what to do (1 for work, 2 to TV) \n>");
	        int number = input.nextInt();
	        System.out.println("You entered " + number + "\n");
	        
	         
	        Adam work = new Job();
	        Adam TV = new TV();
	        
	        if (number == 1) {
	        	work.performTask();
	        }
	        if (number == 2) {
	        	TV.performTask();
	        }
    	}
    }
    
}
