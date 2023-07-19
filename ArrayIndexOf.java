package exception;

public class ArrayIndexOf {
	public static void main(String[] args) {
		System.out.println("Welcome");
		String[] a = args[0].split(" ");
		try {
			String b = a[1];
		} 
		catch (ArrayIndexOutOfBoundsException z) {
			System.out.println("No value on length 1");
			System.out.println(z);
		}
		System.out.println("Thank You");
	}
}
