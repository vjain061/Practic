package constructorConcepts;

class ConstructorsTest {
	public static void main(String[] args) {
		TConstructorsTest u = new TConstructorsTest();
		TConstructorsTest u1 = new TConstructorsTest(1);
		I v = new I();
		I v1 = new I(1);
		J t = new J();
		J t1 = new J(1);
	}
}

class TConstructorsTest {
	I v = new I();

	TConstructorsTest() {
		System.out.print("t");
	}

	TConstructorsTest(int i) {
		System.out.print("T");
	}
}

class I {
	I() {
		System.out.print("I");
	}

	I(int i) {
		System.out.print("i");
	}
}

class J extends I {
	J() {
		System.out.print("j");
	}

	J(int i) {
		System.out.print("J");
	}
}
