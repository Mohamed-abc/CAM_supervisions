package packB;
import packA.PublicClass;// we can import the public class from outside it's package
import packA.PublicClass.ProtectedClass; // we cannot import the protected class from outside it's package

public class PublicClassB {
	
	public int publicintB = 10; 
	
	public static void main(String[] args) {
        
		PublicClass i = new PublicClass(); // we can import the public class's variables from outside it's package
        System.out.println(i.publicint); 
		
        ProtectedClass e = new ProtectedClass(); // we cannot import the protected class's variables from outside it's package
        System.out.println(e.protectedint);
        
        PrivateClass p = new PrivateClass();
        System.out.println(p.privateintB);
    }
	
	private class PrivateClass {
		
		private int privateintB = 20;

	}

}
