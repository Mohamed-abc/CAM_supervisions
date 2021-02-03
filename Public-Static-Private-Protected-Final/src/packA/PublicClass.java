package packA;
import packB.PublicClassB;

public class PublicClass {
	
	public int publicint = 1; 
	
	public static void main(String[] args) {
			PublicClassB i = new PublicClassB(); // we cannot import the Public class's variables from outside it's package
	        System.out.println(i.publicintB); 
	        
	        ProtectedClass e = new ProtectedClass(); // we can import the protected class from inside it's package
	        System.out.println(e.protectedint);
	        
	        PublicClassB.PrivateClass p = new PublicClassB.PrivateClass(); // we cannot import the private class's variables from outside it's package
	    

	}

	static protected class ProtectedClass {
		
		protected int protectedint = 100;
		
	}

}

