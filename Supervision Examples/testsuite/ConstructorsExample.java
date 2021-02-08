public class ConstructorsExample {
	//The example code
	private int value1;
	private int value2;
	
	public ConstructorsExample() {
		value1 = 0;
		value2 = 0;
	}
	public ConstructorsExample(int v1) {
		value1 = v1;
		value2 = 0;
	}
	public ConstructorsExample(int v1, int v2) {
		value1 = v1;
		value2 = v2;
	}
		
	// my tests
	public static void main(String[] args)
	{
		ConstructorsExample testCon1 = new ConstructorsExample();
		ConstructorsExample testCon2 = new ConstructorsExample(1);
		ConstructorsExample testCon3 = new ConstructorsExample(1,2);
		
		System.out.print("testCon1: " + testCon1.value1 + " " + testCon1.value2 + "\n");
		System.out.print("testCon2: " + testCon2.value1 + " " + testCon2.value2 + "\n");
		System.out.print("testCon3: " + testCon3.value1 + " " + testCon3.value2 + "\n");
		/* output:
		
		    testCon1: 0 0
			testCon2: 1 0
			testCon3: 1 2
			
			the output is as expected.

		 */
	}

	
}
