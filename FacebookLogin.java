package exception;

public class FacebookLogin {
	public static void main(String[] args) throws LoginException {
		String loginName = "Naveen";
		System.out.println(loginName);
		if (loginName.contains("x")) {
			System.out.println("Valid Name");
		} else {
			throw new LoginException("Invalid Name");
		}
	}
}
