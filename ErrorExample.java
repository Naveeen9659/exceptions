package exception;

public class ErrorExample {
	public void test1() {
		test2();
	}

	public void test2() {
		test1();
	}
}
