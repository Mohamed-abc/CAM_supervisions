package staticFinalExample;

public class StaticFinalExample {
	public static int staticint = 5;
	public int nonstaticint = 6;

	public static void main(String[] args) {
		
		int i = 50;
		final int f = 55;
		System.out.println(i++); // we can modify i
		System.out.println(f++); // but we cannot modify s, because it has the final tag
		

    }
	

}
