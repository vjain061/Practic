package exceptionConcept;

import java.io.IOException;

public class Example2 {
	public static void main(String[] args) {
		try {
			throw new IOException();
		} catch (RuntimeException | IOException e) {
			
		}
	}
}
