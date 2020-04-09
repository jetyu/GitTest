package demo1;

class Apple {
	@Deprecated
	public void info() {
		System.out.println("hello world");

	}

 
}

public class DeprecatedTest {

	public static void main(String[] args) {

		Apple apple = new Apple();
		apple.info();

	}

}
