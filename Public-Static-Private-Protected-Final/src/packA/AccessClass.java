package packA;
import packA.PublicClass.ProtectedClass;
import packB.PublicClassB;

public class AccessClass {
	
	public static void main(String[] args) {
		
	    ProtectedClass e = new ProtectedClass(); // we can import the protected class from a different class inside it's package
	    System.out.println(e.protectedint);
	    
	}


}
