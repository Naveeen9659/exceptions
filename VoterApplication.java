package exception;

public class VoterApplication {
	public static void main(String[] args) throws AgeException {
		String name = "Bharath";
		System.out.println(name);
		int age = 17;
		if (age >= 18) {
			System.out.println("Valid Age");
		} else {
			throw new AgeException("Invalid Age");
		}
		String gender = "Male";
		System.out.println(gender);

	}
}
