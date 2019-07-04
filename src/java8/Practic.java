package java8;

public class Practic {

	final String test;
	public Practic(String test) {
		this.test = test;
	}
	/*
	 * public Practic() { //this.test = test; }
	 */
	
	public static void main(String[] args) {
		new Practic("test").anotherMethod();

	}
	public void anotherMethod() {
		System.out.println(test);
	}

}
