package pack;

public class Job extends Adam {

	public static void main(String[] args) {

	}
	public void performTask() {
			System.out.print("Work it is.\n");
			
			if (!shouldWork) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.printf("Boss: More Work is Alwase welcome!\n");
				
			}else {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.printf("Boss: You are late, get to work!\n");
				
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("Boss: you will be sent to the " + age + "+ section: " + level + " catagory.\n");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("Boss: because you are " + age + " you need to cut down " + age + "0 Trees to leave.\n");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("your work is done! go watch some TV.\n");
			shouldWork = false;

	};
}
