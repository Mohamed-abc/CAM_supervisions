package packB;

import packA.PublicClass.ProtectedClass;
import packB.PublicClassB.PrivateClass;

public class AccessClassB {
	
	
	
	public static void main(String[] args) {
		
	    PrivateClass p = new PrivateClass(); // private class cannot be accessed from another class in the same package
	    System.out.println(p.privateintB);

    }

}
