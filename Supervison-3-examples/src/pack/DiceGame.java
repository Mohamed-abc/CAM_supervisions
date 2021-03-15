package pack;
import java.util.Random;

public class DiceGame extends GameInfo implements Actions {
	public static void main(String[] args){
		upper = 6;
	}

	@Override
	public void play() {
		credits -= 10;
		System.out.print("If you land a 6, you will win 20 credits! \n");
		Random rand = new Random();
		int x = rand.nextInt(6);
		if (x == 0) { x = 1;};
		if (x == 6) {
			credits += 20;
			System.out.print("you rolled a 6! \n + 20 credits. \n" );
		}
		else {
			System.out.print("you rolled " + x + ", better luck next time \n" );
			System.out.print(" -10 credits. \n" );
		}
		
	}

}