package exception;

public class MultipleCatch {
	public static void main(String[] args) {
		System.out.println("Welcome");
		String name = null;
		try {
			System.out.println(name.toUpperCase());
		} catch (ArithmeticException a) {
			System.out.println("Value not found");
			//System.out.println(a);
			a.printStackTrace();
		} catch (NullPointerException a) {
			System.out.println("Value not found");
			a.printStackTrace();// it is another method to find the error & to handle it.
			
			//System.out.println(a);// to find what is the exception message & to handle print the declared variable name to find the error
		} catch (NumberFormatException a) {
			System.out.println("Value not found");
			//System.out.println(a);
		}
	}
}
