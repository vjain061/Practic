package exceptionConcept;

import java.io.IOException;

public class Parent {
	public void displayMethod() throws Exception{
		System.out.println("display method parent");
	}
	
	public static void main(String[] args) {
		Parent p = new Child();
		//p.displayMethod();
	}
}

class Child extends Parent {
	public void displayMethod() throws IOException{
		System.out.println("display method child");
	}
	
	
}
