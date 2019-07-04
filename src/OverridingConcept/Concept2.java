package OverridingConcept;

import java.io.IOException;

public class Concept2 {
	public static void main(String[] args) {

	}
}

class Animal {
	public void eat() throws IOException {
	}
}

class Dog extends Animal {
	public void eat() throws IOException {
	}
}