package demo1;

public class SpellChecker {

	public static void checkSpelling() {
		System.out.println("SpellChecker的checkSpelling方法");
	}  
	
	public void test(){
		System.out.println("Test方法");
	}

	public static void main(String[] args) {
		 test();
		checkSpelling();
	}
}
