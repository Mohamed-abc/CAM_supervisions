package pack;
import java.util.Random;
import java.util.Scanner;

public class Roulette extends GameInfo implements Actions {

	public static void main(String[] args){
		upper = 36;
	}

	@Override
	public void play() {
		int number;
        Scanner input = new Scanner(System.in);
        System.out.print("what number do you want to bet on? (1-36) /n");
        number = input.nextInt();
        System.out.println("You entered " + number + "\n");
		credits -= 10;
		System.out.print("If it lands on " + number + ", you will win 100 credits! \n");
		Random rand = new Random();
		int x = rand.nextInt(36);
		if (x == number) {
			credits += 100;
			System.out.print("it lands on " + x + "! \n + 100 credits. \n" );
		}
		else {
			System.out.print("it lands on " + x + ", better luck next time \n" );
			System.out.print(" -10 credits. \n" );
		}
		
	}

}