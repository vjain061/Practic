package exceptionConcept;

import java.io.IOException;

public class ExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Parent{
	public void method() {
		
	}
}
class Child extends Parent{
	public void method() throws RuntimeException{
		
	}
}