package demo;

public class Person {

	int a;

	public void jump(String j) {
		System.out.println(j);
		Person.stand("Stand");
	}

	public void say(String s) {
		System.out.println(s);
		this.jump("jump");
	}
	public static void stand(String q) {
		System.out.println(q);
		 
	}
	
	 
	public static void main(String[] args) {
		
		Person p = new Person();
		p.say("SAY");

	}

}
