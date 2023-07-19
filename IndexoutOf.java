package exception;

public class IndexoutOf {
	public static void main(String[] args) {
		System.out.println("Welcome");
		String name = "Naveen";
		try {
			char a = name.charAt(6);
		} catch (StringIndexOutOfBoundsException x) {
			System.out.println("Index out of length for position 6");
			System.out.println(x);
		} finally {
			System.out.println("Method");
			
		}
		System.out.println("Thank You");
	}
}
