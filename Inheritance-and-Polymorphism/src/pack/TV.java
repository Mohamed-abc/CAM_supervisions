package pack;


public class TV extends Adam {

	public static void main(String[] args) {

	}
	
	public void performTask() {
		System.out.print("TV it is.\n");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (shouldWork) {
			
			System.out.printf("TV: You have no TV credits, " + name + " go back to work.\n");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}else {
			
			System.out.printf("TV: you are watching " + nationality +" TV\n");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("TV: you have run out of TV credits, " + name + ". Go back to work.\n");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			shouldWork = true;
			
		}
	};

}
