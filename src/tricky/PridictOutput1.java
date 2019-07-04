package tricky;

public class PridictOutput1 {
	public static void main(String[] args) {
		new PridictOutput1().methodOfA();
	}

	int methodOfA() {
		return (true ? null : 0);
	}
}
