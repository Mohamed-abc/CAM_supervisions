package staticFinalExample;

public class StaticExample {
	
	public static void main(String[] args) {
		StaticFinalExample testObjectA = new StaticFinalExample();
		StaticFinalExample testObjectB = new StaticFinalExample();
		
		testObjectA.staticint++; //here we add to the variable that belongs to the class StaticFinalExample
		testObjectA.nonstaticint++; // here we add to the variable that belongs to testObjectA
		
		testObjectB.staticint++; //here we add to the variable that belongs to the class StaticFinalExample
		testObjectB.nonstaticint++; // here we add to the variable that belongs to testObjectA
		
		System.out.println(testObjectA.nonstaticint); // 
		                                              // the output for both of these is 1, as we are referring to separate variables
		System.out.println(testObjectB.nonstaticint); //
		
		System.out.println(testObjectA.staticint); // 
        										   // the output for both of these is 2, as we are referring to the same variable
		System.out.println(testObjectB.staticint); //

		
		
    }


}
