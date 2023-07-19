package exception;

public class NumberFormat {
	public static void main(String[] args) {
		System.out.println("Welcome");
		try {
			String a = "TN18AE1855";
			int b = Integer.parseInt(a);
			System.out.println(a);
		} catch (NumberFormatException x) {
			System.out.println("String cannot converted into int");
			x.printStackTrace();
		} catch (ArithmeticException x) {
			System.out.println("String cannot converted into int");
		} catch (NullPointerException x) {
			System.out.println(x);
		}
		System.out.println("Thank You");
	}
}
